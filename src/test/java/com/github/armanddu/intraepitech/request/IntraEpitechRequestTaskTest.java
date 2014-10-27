package com.github.armanddu.intraepitech.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.github.armanddu.intraepitech.request.IntraEpitechRequestTask;
import com.google.gson.JsonObject;

/**
 * Unit test for {@link IntraEpitechRequestTask}.
 * 
 * TODO better "file not found" handler in @BeforeClass Method TODO add a way to
 * test callbacks tests
 */
public class IntraEpitechRequestTaskTest {

	private static final String		PASSWORDFILE	= ".intra.passwd";
	private static final int		FIRST_PRIORITY	= 0;
	private static final int		SECOND_PRIORITY	= 1;
	private static final int		THIRD_PRIORITY	= 2;
	private static final int		LAST_PRIORITY	= 3;
	private IntraEpitechRequestTask	mIntraTaskRequest;
	private String					mLogin;
	private String					mPassword;

	/**
	 * if you want to test this Api, please give a .intra.password at projet
	 * root
	 * 
	 * the file must contain you login and unix password in one line ex : $> cat
	 * .intra.passwd login_x:password
	 * 
	 */
	@BeforeClass
	public void setup() {

		Reader file = null;
		BufferedReader bufferFile = null;
		String[] res = null;

		try {
			if (new File(PASSWORDFILE).isFile() == false) {
				throw new SkipException(
						"You don't have {passwdFile} file, test finished now"
								.replace("{passwdFile}", PASSWORDFILE));
			}
			file = new FileReader(PASSWORDFILE);
			bufferFile = new BufferedReader(file);
			Assert.assertTrue(bufferFile.ready());
			res = bufferFile.readLine().split(":");
			mLogin = res[0];
			mPassword = res[1];
			file.close();
			bufferFile.close();
			mIntraTaskRequest = new IntraEpitechRequestTask();
		} catch (FileNotFoundException e) {
			Assert.fail();
		} catch (IOException e) {
			Assert.fail();
		} catch (URISyntaxException e) {
			Assert.fail();
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void getWithoutLogin() {
		JsonObject res = mIntraTaskRequest.getService("");
		Assert.assertTrue(res.has("board"));
		Assert.assertTrue(res.has("message"));
		Assert.assertEquals(res.get("board").getAsJsonArray().size(), 0);
	}

	@Test(priority = FIRST_PRIORITY)
	public void getWithoutLoginCallback() {
		mIntraTaskRequest.getService("", new Callback<JsonObject>() {

			@Override
			public void failure(RetrofitError arg0) {
				Assert.assertTrue(true);
			}

			@Override
			public void success(JsonObject arg0, Response arg1) {
				Assert.fail();
			}
		});
	}

	@Test(priority = FIRST_PRIORITY)
	public void connect403AccessDenied() {
		JsonObject res = mIntraTaskRequest.connect("login_x", "");
		Assert.assertTrue(res.has("board"));
		Assert.assertTrue(res.has("message"));
		Assert.assertTrue(res.has("login"));
		Assert.assertEquals(res.get("board").getAsJsonArray().size(), 0);
		System.out.println(res);
	}

	@Test(priority = SECOND_PRIORITY)
	public void connect() {
		JsonObject res = mIntraTaskRequest.connect(mLogin, mPassword);
		Assert.assertTrue(res.has("ip"));
		Assert.assertTrue(res.has("board"));
		Assert.assertTrue(res.getAsJsonObject("board").has("projets"));
		Assert.assertTrue(res.getAsJsonObject("board").has("activites"));

	}

	@Test(priority = THIRD_PRIORITY)
	public void get404NotFoundService() {
		JsonObject res = mIntraTaskRequest.getService("some random service");
		Assert.assertFalse(res.has("board"));
		Assert.assertTrue(res.has("error"));
		Assert.assertTrue(res.has("exception"));
		Assert.assertTrue(res.has("message"));
	}

	@Test(priority = THIRD_PRIORITY)
	public void getWithLogin() {
		JsonObject res = mIntraTaskRequest.getService("");
		Assert.assertTrue(res.has("ip"));
		Assert.assertTrue(res.has("board"));
		Assert.assertTrue(res.getAsJsonObject("board").has("projets"));
		Assert.assertTrue(res.getAsJsonObject("board").has("activites"));
	}

	@Test(priority = THIRD_PRIORITY)
	public void getWithLoginCallback() {
		mIntraTaskRequest.getService("", new Callback<JsonObject>() {

			@Override
			public void failure(RetrofitError arg0) {
				Assert.assertTrue(false);
			}

			@Override
			public void success(JsonObject res, Response response) {
				Assert.assertTrue(res.has("ip"));
				Assert.assertTrue(res.has("board"));
				Assert.assertTrue(res.getAsJsonObject("board").has("projets"));
				Assert.assertTrue(res.getAsJsonObject("board").has("activites"));
			}
		});
	}

	@Test(priority = LAST_PRIORITY)
	public void disconnectAndGet() {
		JsonObject res = mIntraTaskRequest.disconnect();
		Assert.assertTrue(res.toString().equals("{}"));

		res = mIntraTaskRequest.getService("");
		Assert.assertTrue(res.has("board"));
		Assert.assertTrue(res.has("message"));
		Assert.assertEquals(res.get("board").getAsJsonArray().size(), 0);
	}

}
