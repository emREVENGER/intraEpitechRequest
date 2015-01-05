package com.github.armanddu.intraepitech.request;

import java.net.URISyntaxException;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.github.armanddu.intraepitech.IntraEpitechRequestTask;
import com.github.armanddu.intraepitech.response.IntraEpitechResponse;

import retrofit.RetrofitError;

public class IntraEpitechRequestTaskPrepareTest {

	IntraEpitechRequestTask	irt;
	IntraEpitechResponse	response;

	@BeforeClass
	public void setup() {
		try {
			irt = new IntraEpitechRequestTask(null);
			response = irt.connect("dupuis_c", "fqp3rbCs");
		} catch (RetrofitError e) {
			throw new SkipException(e.getMessage());
		} catch (URISyntaxException e) {
			throw new SkipException(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		try {
			irt.disconnect();
		} catch (RetrofitError e) {
			System.err.println("//TODO catch this exception");
		}
	}

}
