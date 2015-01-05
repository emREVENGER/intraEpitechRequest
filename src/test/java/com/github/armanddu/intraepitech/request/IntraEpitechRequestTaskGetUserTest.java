package com.github.armanddu.intraepitech.request;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.armanddu.intraepitech.response.IntraAverageGpa;
import com.github.armanddu.intraepitech.response.IntraEvent;
import com.github.armanddu.intraepitech.response.IntraGpa;
import com.github.armanddu.intraepitech.response.IntraGroup;
import com.github.armanddu.intraepitech.response.IntraNsStat;
import com.github.armanddu.intraepitech.response.IntraRight;
import com.github.armanddu.intraepitech.response.IntraSpice;
import com.github.armanddu.intraepitech.response.IntraUserInfo;
import com.github.armanddu.intraepitech.response.IntraUserResponse;

public class IntraEpitechRequestTaskGetUserTest
		extends IntraEpitechRequestTaskPrepareTest {

	IntraUserResponse	validUser;

	@BeforeClass
	public void setUp() {
		validUser = irt.getUser("dupuis_c");
		Assert.assertNotNull(validUser);
	}

	@Test
	public void test_user_content() {
		Assert.assertNotNull(validUser);
		Assert.assertNotNull(validUser.getAverageGPA());
		Assert.assertNotNull(validUser.getCourseCode());
		Assert.assertNotNull(validUser.getCredits());
		Assert.assertNotNull(validUser.getCtime());
		Assert.assertNotNull(validUser.getDocuments());
		Assert.assertNotNull(validUser.getEvents());
		Assert.assertNotNull(validUser.getFirstName());
		Assert.assertNotNull(validUser.getGid());
		Assert.assertNotNull(validUser.getGpa());
		Assert.assertNotNull(validUser.getGroups());
		Assert.assertNotNull(validUser.getIdHistory());
		Assert.assertNotNull(validUser.getIdPromo());
		Assert.assertNotNull(validUser.getInternalEmail());
		Assert.assertNotNull(validUser.getLastName());
		Assert.assertNotNull(validUser.getLocation());
		Assert.assertNotNull(validUser.getLogin());
		Assert.assertNotNull(validUser.getMtime());
		Assert.assertNotNull(validUser.getNsStat());
		Assert.assertNotNull(validUser.getOldIdLocation());
		Assert.assertNotNull(validUser.getOldIdPromo());
		Assert.assertNotNull(validUser.getPicture());
		Assert.assertNotNull(validUser.getPromo());
		Assert.assertNotNull(validUser.getRights());
		Assert.assertNotNull(validUser.getSchoolCode());
		Assert.assertNotNull(validUser.getSchoolTitle());
		Assert.assertNotNull(validUser.getSemester());
		Assert.assertNotNull(validUser.getShell());
		Assert.assertNotNull(validUser.getSpice());
		Assert.assertNotNull(validUser.getStudentYear());
		Assert.assertNotNull(validUser.getTitle());
		Assert.assertNotNull(validUser.getUid());
		Assert.assertNotNull(validUser.getUserdocs());
		Assert.assertNotNull(validUser.getUserInfo());

		Assert.assertFalse(validUser.isAdmin());
		Assert.assertFalse(validUser.isClose());
		
		Assert.assertTrue(validUser.isReferentUsed());
		Assert.assertTrue(validUser.isInvited());
		Assert.assertTrue(validUser.isEditable());
	
		Assert.assertNull(validUser.getPictureFun());

	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_averageGPA_content() {
		List<IntraAverageGpa> averageGpa = validUser.getAverageGPA();

		Assert.assertNotNull(averageGpa);
		for (IntraAverageGpa entry : averageGpa) {
			Assert.assertNotNull(entry);
			Assert.assertNotNull(entry.getCycle());
			Assert.assertNotNull(entry.getAverageGpa());
		}
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_events_content() {
		List<IntraEvent> events = validUser.getEvents();

		Assert.assertNotNull(events);
		for (IntraEvent event : events) {
			Assert.assertNotNull(event);
			Assert.assertNotNull(event.getBegin());
			Assert.assertNotNull(event.getIdActiviteFailed());
			Assert.assertNotNull(event.getIdEventFailed());
			Assert.assertNotNull(event.getIdUser());
		}
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_gpa_content() {
		List<IntraGpa> gpa = validUser.getGpa();

		Assert.assertNotNull(gpa);
		for (IntraGpa entry : gpa) {
			Assert.assertNotNull(entry);
			Assert.assertNotNull(entry.getCycle());
			Assert.assertNotNull(entry.getGpa());
		}
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_groups_content() {
		List<IntraGroup> groups = validUser.getGroups();

		Assert.assertNotNull(groups);
		for (IntraGroup group : groups) {
			Assert.assertNotNull(group);
			Assert.assertNotNull(group.getCount());
			Assert.assertNotNull(group.getName());
			Assert.assertNotNull(group.getTitle());
		}
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_ns_stat_content() {
		IntraNsStat nsStat = validUser.getNsStat();

		Assert.assertNotNull(nsStat);
		Assert.assertNotNull(nsStat.getActive());
		Assert.assertNotNull(nsStat.getIdle());
		Assert.assertNotNull(nsStat.getNslogNorm());
		Assert.assertNotNull(nsStat.getOutActive());
		Assert.assertNotNull(nsStat.getOutIdle());
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_rights_content() {
		IntraRight rights = validUser.getRights();

		Assert.assertNotNull(rights);
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_spices_content() {
		IntraSpice spices = validUser.getSpice();

		Assert.assertNotNull(spices);
		Assert.assertNotNull(spices.getAvailableSpice());
		Assert.assertNotNull(spices.getConsumedSpice());
	}

	@Test(dependsOnMethods = "test_user_content")
	public void test_user_info_content() {
		IntraUserInfo userInfos = validUser.getUserInfo();

		Assert.assertNotNull(userInfos);
	}

}
