package com.github.armanddu.intraepitech.request;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.armanddu.intraepitech.response.IntraActivity;
import com.github.armanddu.intraepitech.response.IntraBoard;
import com.github.armanddu.intraepitech.response.IntraCurrentInfos;
import com.github.armanddu.intraepitech.response.IntraHistory;
import com.github.armanddu.intraepitech.response.IntraGlobalInfos;
import com.github.armanddu.intraepitech.response.IntraModule;
import com.github.armanddu.intraepitech.response.IntraNote;
import com.github.armanddu.intraepitech.response.IntraProject;
import com.github.armanddu.intraepitech.response.IntraSusie;
import com.github.armanddu.intraepitech.response.IntraUserInfo;

public class IntraEpitechRequestTaskConnectTest__
		extends IntraEpitechRequestTaskPrepareTest {

	@Test
	public void test_response_content() {

		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getBoard());
		Assert.assertNotNull(response.getIp());
		Assert.assertNotNull(response.getInfos());
		Assert.assertNotNull(response.getCurrentInfos());
		Assert.assertNotNull(response.getHistory());

		Assert.assertNull(response.getMessage());
	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_infos_content() {
		IntraGlobalInfos infos = response.getInfos();

		Assert.assertNull(infos.getCloseReason());
		Assert.assertNull(infos.getComment());
		Assert.assertNull(infos.getEmailReferent());
		Assert.assertNull(infos.getEmail());
		Assert.assertNull(infos.getNetsoul());
		Assert.assertNull(infos.getPicture_fun());
		Assert.assertNull(infos.getEmailReferent());

		Assert.assertNotNull(infos.getCourse_code());
		Assert.assertNotNull(infos.getCtime());
		Assert.assertNotNull(infos.getDecoded());
		Assert.assertNotNull(infos.getDocuments());
		Assert.assertNotNull(infos.getFirstname());
		Assert.assertNotNull(infos.getGid());
		Assert.assertNotNull(infos.getId());
		Assert.assertNotNull(infos.getIdHistory());
		Assert.assertNotNull(infos.getId_promo());
		Assert.assertNotNull(infos.getInternalEmail());
		Assert.assertNotNull(infos.getLastname());
		Assert.assertNotNull(infos.getLocation());
		Assert.assertNotNull(infos.getLogin());
		Assert.assertNotNull(infos.getMtime());
		Assert.assertNotNull(infos.getOldIdLocation());
		Assert.assertNotNull(infos.getOldIdPromo());
		Assert.assertNotNull(infos.getPicture());
		Assert.assertNotNull(infos.getPromo());
		Assert.assertNotNull(infos.getRights());
		Assert.assertNotNull(infos.getSchool_title());
		Assert.assertNotNull(infos.getSchool_title());
		Assert.assertNotNull(infos.getSemester());
		Assert.assertNotNull(infos.getShell());
		Assert.assertNotNull(infos.getStudentyear());
		Assert.assertNotNull(infos.getTitle());
		Assert.assertNotNull(infos.getUid());
		Assert.assertNotNull(infos.getUserdocs());
		Assert.assertNotNull(infos.getUserinfo());

		Assert.assertFalse(infos.isAdmin());
		Assert.assertFalse(infos.isClose());

		Assert.assertTrue(infos.isInvited());
		Assert.assertTrue(infos.isReferentUsed());

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_current_content() {
		IntraCurrentInfos current = response.getCurrentInfos();

		Assert.assertNotNull(current.getAchieved());
		Assert.assertNotNull(current.getActiveLog());
		Assert.assertNotNull(current.getCreditsMin());
		Assert.assertNotNull(current.getCreditsNorm());
		Assert.assertNotNull(current.getCreditsTarget());
		Assert.assertNotNull(current.getFailed());
		Assert.assertNotNull(current.getInProgress());
		Assert.assertNotNull(current.getMinNslog());
		Assert.assertNotNull(current.getNslogNorm());
		Assert.assertNotNull(current.getSemesterCode());
		Assert.assertNotNull(current.getSemesterNum());

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_board_content() {
		IntraBoard board = response.getBoard();

		Assert.assertNotNull(board.getActivities());
		Assert.assertNotNull(board.getModules());
		Assert.assertNotNull(board.getGrades());
		Assert.assertNotNull(board.getProjects());
		Assert.assertNotNull(board.getInternships());
		Assert.assertNotNull(board.getSusies());
		Assert.assertNotNull(board.getTickets());
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_activities_content() {
		List<IntraActivity> activities = response.getBoard().getActivities();
		for (IntraActivity activity : activities) {
			Assert.assertNotNull(activity);
			Assert.assertNotNull(activity.getTitle());
			if (!activity.getTitle().contains("Coaching individuel"))
				Assert.assertNotNull(activity.getModuleName());
			Assert.assertNotNull(activity.getModule_code());
			Assert.assertNotNull(activity.getModule_link());
			Assert.assertNotNull(activity.getRegisterLink());
			Assert.assertNotNull(activity.getRoom());
			Assert.assertNotNull(activity.getTimeline_barre());
			Assert.assertNotNull(activity.getTimelineEnd());
			Assert.assertNotNull(activity.getTimelineStart());
			Assert.assertNotNull(activity.getTitleLink());
			Assert.assertNotNull(activity.getTokenLink());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_modules_content() {
		List<IntraModule> modules = response.getBoard().getModules();

		Assert.assertNotNull(modules);
		for (IntraModule module : modules) {
			Assert.assertNotNull(module);
			Assert.assertNotNull(module.getinscriptionDate());
			Assert.assertNotNull(module.getTimelineBarre());
			Assert.assertNotNull(module.getTimelineEnd());
			Assert.assertNotNull(module.getTimelineStart());
			Assert.assertNotNull(module.getTitle());
			Assert.assertNotNull(module.getTitleLink());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_notes_content() {
		List<IntraNote> notes = response.getBoard().getGrades();

		Assert.assertNotNull(notes);
		for (IntraNote note : notes) {
			Assert.assertNotNull(note);
			Assert.assertNotNull(note.getNote());
			Assert.assertNotNull(note.getNoteur());
			Assert.assertNotNull(note.getTitle());
			Assert.assertNotNull(note.getTitleLink());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_projects_content() {
		List<IntraProject> projects = response.getBoard().getProjects();

		Assert.assertNotNull(projects);
		for (IntraProject project : projects) {
			Assert.assertNotNull(project);
			Assert.assertNotNull(project.getDateInscription());
			Assert.assertNotNull(project.getActiviteId());
			Assert.assertNotNull(project.getSoutenanceDate());
			Assert.assertNotNull(project.getSoutenanceLink());
			Assert.assertNotNull(project.getSoutenanceName());
			Assert.assertNotNull(project.getSoutenanceRoom());
			Assert.assertNotNull(project.getTimelineBarre());
			Assert.assertNotNull(project.getTimelineEnd());
			Assert.assertNotNull(project.getTimelineStart());
			Assert.assertNotNull(project.getTitle());
			Assert.assertNotNull(project.getTitleLink());

		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_stages_content() {
		List<Void> stages = response.getBoard().getInternships();

		Assert.assertNotNull(stages);
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_susies_content() {
		List<IntraSusie> susies = response.getBoard().getSusies();

		Assert.assertNotNull(susies);
		for (IntraSusie susie : susies) {
			Assert.assertNotNull(susie);
			Assert.assertNotNull(susie.getCreneauLink());
			Assert.assertNotNull(susie.getState());
			Assert.assertNotNull(susie.getIntervenant());
			Assert.assertNotNull(susie.getRoom());
			Assert.assertNotNull(susie.getTimelineBarre());
			Assert.assertNotNull(susie.getTimelineEnd());
//			Assert.assertNotNull(susie.getTimelineStart());
			Assert.assertNotNull(susie.getTitle());
			Assert.assertNotNull(susie.getType());
		}

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_history_content() {
		List<IntraHistory> history = response.getHistory();

		for (IntraHistory entry : history) {
			Assert.assertNotNull(entry);
			Assert.assertNotNull(entry.getClassType());
			Assert.assertNotNull(entry.getContent());
			Assert.assertNotNull(entry.getDate());
			Assert.assertNotNull(entry.getId());
//TODO			Assert.assertNotNull(entry.getIdActivity());
			Assert.assertNotNull(entry.getTitle());
			Assert.assertNotNull(entry.getUser());
			test_user_content(entry.getUser());
			Assert.assertNotNull(entry.getVisible());
		}
	}

	private void test_user_content(IntraUserInfo userInfo) {
		Assert.assertNotNull(userInfo.getPicture());
		Assert.assertNotNull(userInfo.getTitle());
		Assert.assertNotNull(userInfo.getUrl());
	}

}
