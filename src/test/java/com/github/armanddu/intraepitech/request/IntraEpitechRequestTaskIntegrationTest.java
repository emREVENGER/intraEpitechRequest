package com.github.armanddu.intraepitech.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.github.armanddu.intraepitech.IntraEpitechRequestTask;
import com.github.armanddu.intraepitech.response.IntraEpitechResponse;

/**
 * Unit test for {@link IntraEpitechRequestTask}.
 * 
 * TODO better "file not found" handler in @BeforeClass Method TODO add a way to
 * test callbacks tests
 */
/*
public class IntraEpitechRequestTaskIntegrationTest {

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
	 * the file must contain you login and unix password in one line ex : 
	 * $> cat .intra.passwd 
	 * login_x:password
	 * 
	 */
/*
	@BeforeTest
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
			mIntraTaskRequest = new IntraEpitechRequestTask(null);
			Assert.assertNotNull(mIntraTaskRequest);
		} catch (IOException e) {
			Assert.fail();
		} catch (URISyntaxException e) {
			Assert.fail();
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void get_good_service_without_login_should_403_fobidden() {
		try {
			mIntraTaskRequest.getServices();
			Assert.fail();
		} catch (RetrofitError e) {
			Assert.assertEquals(e.getMessage(), "403 Forbidden");
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void disconnect_before_connect_should_403_forbidden() {

		try {
			mIntraTaskRequest.disconnect();
			Assert.fail();
		} catch (RetrofitError e) {
			Assert.assertEquals(e.getMessage(), "403 Forbidden");
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void get_good_service_without_login_callback_should_403_forbidden() {
		mIntraTaskRequest.getServices(new Callback<IntraEpitechResponse>() {

			@Override
			public void failure(RetrofitError arg0) {
			}

			@Override
			public void success(IntraEpitechResponse arg0, Response arg1) {
				Assert.fail();
			}
		});
	}

	@Test(priority = FIRST_PRIORITY)
	public void connect_with_bad_login_should_403_forbidden() {

		try {
			mIntraTaskRequest.connect("login_x", "");
			Assert.fail();
		} catch (RetrofitError e) {
			Assert.assertEquals(e.getMessage(), "403 Forbidden");
		}
	}

	@Test(priority = SECOND_PRIORITY)
	public void connect_with_good_login_should_success() {
		IntraEpitechResponse res = mIntraTaskRequest.connect(mLogin, mPassword);
		Assert.assertNotNull(res);
		Assert.assertNotNull(res.getBoard());
		Assert.assertNotNull(res.getIp());
		Assert.assertNotNull(res.getInfos());
		Assert.assertNotNull(res.getCurrentInfos());
		Assert.assertNotNull(res.getHistory());

		Assert.assertNull(res.getMessage());
	}

	@Test(priority = THIRD_PRIORITY)
	public void get_good_service_with_login_should_success() {
		IntraEpitechResponse res = mIntraTaskRequest.getServices();
		Assert.assertNotNull(res.getIp());
		Assert.assertNotNull(res.getBoard());
	}

	@Test(priority = THIRD_PRIORITY)
	public void get_good_service_with_login_callback_should_success() {
		mIntraTaskRequest.getServices(new Callback<IntraEpitechResponse>() {

			@Override
			public void failure(RetrofitError arg0) {
				Assert.assertTrue(false);
			}

			@Override
			public void success(IntraEpitechResponse res, Response response) {
				Assert.assertNotNull(res.getIp());
				Assert.assertNotNull(res.getBoard());
			}
		});
	}

	@Test(priority = LAST_PRIORITY)
	public void disconnect_then_reconnect_should_success() {
		disconnect_should_success();
		connect_with_good_login_should_success();
	}

	@Test(priority = LAST_PRIORITY + 1)
	public void disconnect_should_success() {
		IntraEpitechResponse res = mIntraTaskRequest.disconnect();
		Assert.assertNull(res.getBoard());
		Assert.assertNull(res.getMessage());
		Assert.assertNull(res.getIp());
	}

	@Test(priority = LAST_PRIORITY)
	public void disconnect_and_get_good_service_should_403_forbidden() {
		disconnect_should_success();
		get_good_service_without_login_should_403_fobidden();
		// don't forget to reconnect for other tests
		connect_with_good_login_should_success();
	}

}
*/
