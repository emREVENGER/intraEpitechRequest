package com.github.armanddu.intraepitechrequest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 * 
 * TODO better "file not found" handler in @BeforeClass Method
 */
public class IntraEpitechRequestTaskTest {

	private static final String		PASSWORDFILE	= ".intra.passwd";
	private static final int		FIRST_PRIORITY	= 0;
	private static final int		SECOND_PRIORITY	= 1;
	private static final int		THIRD_PRIORITY	= 2;
	private static final int		LAST_PRIORITY	= 3;
	private IntraEpitechRequestTask	mintraTaskRequest;
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
			mintraTaskRequest = new IntraEpitechRequestTask();
		} catch (FileNotFoundException e) {
			Assert.fail();
		} catch (IOException e) {
			Assert.fail();
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void getWithoutLogin() {
		try {
			String res = mintraTaskRequest.get("/");
			Assert.assertTrue(res
					.contains("\"message\":\"Veuillez vous connecter\""));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(priority = FIRST_PRIORITY)
	public void postWihtoutLogin() {
		try {
			String res = mintraTaskRequest.post("/",
					new JSONObject().put("some key", "some value"));
			Assert.assertTrue(res
					.contains("\"message\":\"Veuillez vous connecter\""));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(priority = SECOND_PRIORITY)
	public void connect() {
		try {
			String res = mintraTaskRequest.connect(mLogin, mPassword);
			Assert.assertTrue(res.contains("ip"));
			Assert.assertTrue(res.contains("projets"));
			Assert.assertTrue(res.contains("activites"));

		} catch (IOException e) {
		} catch (URISyntaxException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(priority = THIRD_PRIORITY)
	public void getWithLogin() {
		try {
			String res = mintraTaskRequest.get("/");
			Assert.assertTrue(res.contains("ip"));
			Assert.assertTrue(res.contains("projets"));
			Assert.assertTrue(res.contains("activites"));
		} catch (IOException e) {
		}
	}

	@Test(priority = THIRD_PRIORITY)
	public void postWithLogin() {
		try {
			String res = mintraTaskRequest.post("/",
					new JSONObject().put("some key", "some value"));
			Assert.assertTrue(res.contains("ip"));
			Assert.assertTrue(res.contains("projets"));
			Assert.assertTrue(res.contains("activites"));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(priority = LAST_PRIORITY)
	public void disconnectAndGet() {
		try {
			mintraTaskRequest.disconnect();
			String res = mintraTaskRequest.get("/");
			Assert.assertTrue(res
					.contains("\"message\":\"Veuillez vous connecter\""));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
