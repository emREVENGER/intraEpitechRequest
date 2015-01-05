package com.github.armanddu.intraepitech.request;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TokenUrlTest {

	@Test
	public void token_url_from_valid_string_should_be_valid() {

		String token = "/module/2014/SOME_MODULE_CODE/SEMESTER_42/activity-421337/event-80085/token";
		TokenUrl tUrl = new TokenUrl(token);

		Assert.assertEquals(token, tUrl.getTokenUrl());
		Assert.assertEquals("2014", tUrl.getYear());
		Assert.assertEquals("SOME_MODULE_CODE", tUrl.getModuleCode());
		Assert.assertEquals("SEMESTER_42", tUrl.getSemester());
		Assert.assertEquals("activity-421337", tUrl.getIdActivity());
		Assert.assertEquals("event-80085", tUrl.getIdEvent());

	}

	@Test
	public void token_url_from_invalid_string_should_be_invalid() {
		// TODO do invalid tests
	}

}
