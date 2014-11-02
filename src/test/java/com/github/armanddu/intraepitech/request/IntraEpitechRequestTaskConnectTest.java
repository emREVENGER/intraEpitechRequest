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

public class IntraEpitechRequestTaskConnectTest
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

		Assert.assertNull(infos.getClose_reason());
		Assert.assertNull(infos.getComment());
		Assert.assertNull(infos.getEmail_referent());
		Assert.assertNull(infos.getEmail());
		Assert.assertNull(infos.getNetsoul());
		Assert.assertNull(infos.getPicture_fun());

		Assert.assertNotNull(infos.getCourse_code());
		Assert.assertNotNull(infos.getCtime());
		Assert.assertNotNull(infos.getDecoded());
		Assert.assertNotNull(infos.getDocuments());
		Assert.assertNotNull(infos.getFirstname());
		Assert.assertNotNull(infos.getGid());
		Assert.assertNotNull(infos.getId());
		Assert.assertNotNull(infos.getId_history());
		Assert.assertNotNull(infos.getId_promo());
		Assert.assertNotNull(infos.getInternal_email());
		Assert.assertNotNull(infos.getLastname());
		Assert.assertNotNull(infos.getLocation());
		Assert.assertNotNull(infos.getLogin());
		Assert.assertNotNull(infos.getMtime());
		Assert.assertNotNull(infos.getOld_id_location());
		Assert.assertNotNull(infos.getOld_id_promo());
		Assert.assertNotNull(infos.getPass_referent());
		Assert.assertNotNull(infos.getPicture());
		Assert.assertNotNull(infos.getPromo());
		Assert.assertNotNull(infos.getRights());
		Assert.assertNotNull(infos.getSchool_code());
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
		Assert.assertTrue(infos.isReferent_used());

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_current_content() {
		IntraCurrentInfos current = response.getCurrentInfos();

		Assert.assertNotNull(current.getAchieved());
		Assert.assertNotNull(current.getActive_log());
		Assert.assertNotNull(current.getCredits_min());
		Assert.assertNotNull(current.getCredits_norm());
		Assert.assertNotNull(current.getCredits_obj());
		Assert.assertNotNull(current.getFailed());
		Assert.assertNotNull(current.getInprogress());
		Assert.assertNotNull(current.getNslog_min());
		Assert.assertNotNull(current.getNslog_norm());
		Assert.assertNotNull(current.getSemester_code());
		Assert.assertNotNull(current.getSemester_num());

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_board_content() {
		IntraBoard board = response.getBoard();

		Assert.assertNotNull(board.getActivities());
		Assert.assertNotNull(board.getModules());
		Assert.assertNotNull(board.getNotes());
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
			Assert.assertNotNull(activity.getRegister_link());
			Assert.assertNotNull(activity.getSalle());
			Assert.assertNotNull(activity.getTimeline_barre());
			Assert.assertNotNull(activity.getTimeline_end());
			Assert.assertNotNull(activity.getTimeline_start());
			Assert.assertNotNull(activity.getTitle_link());
			Assert.assertNotNull(activity.getToken_link());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_modules_content() {
		List<IntraModule> modules = response.getBoard().getModules();

		Assert.assertNotNull(modules);
		for (IntraModule module : modules) {
			Assert.assertNotNull(module);
			Assert.assertNotNull(module.getDate_inscription());
			Assert.assertNotNull(module.getTimeline_barre());
			Assert.assertNotNull(module.getTimeline_end());
			Assert.assertNotNull(module.getTimeline_start());
			Assert.assertNotNull(module.getTitle());
			Assert.assertNotNull(module.getTitle_link());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_notes_content() {
		List<IntraNote> notes = response.getBoard().getNotes();

		Assert.assertNotNull(notes);
		for (IntraNote note : notes) {
			Assert.assertNotNull(note);
			Assert.assertNotNull(note.getNote());
			Assert.assertNotNull(note.getNoteur());
			Assert.assertNotNull(note.getTitle());
			Assert.assertNotNull(note.getTitle_link());
		}
	}

	@Test(dependsOnMethods = "test_board_content")
	public void test_projects_content() {
		List<IntraProject> projects = response.getBoard().getProjects();

		Assert.assertNotNull(projects);
		for (IntraProject project : projects) {
			Assert.assertNotNull(project);
			Assert.assertNotNull(project.getDate_inscription());
			Assert.assertNotNull(project.getId_activite());
			Assert.assertNotNull(project.getSoutenance_date());
			Assert.assertNotNull(project.getSoutenance_link());
			Assert.assertNotNull(project.getSoutenance_name());
			Assert.assertNotNull(project.getSoutenance_salle());
			Assert.assertNotNull(project.getTimeline_barre());
			Assert.assertNotNull(project.getTimeline_end());
			Assert.assertNotNull(project.getTimeline_start());
			Assert.assertNotNull(project.getTitle());
			Assert.assertNotNull(project.getTitle_link());

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
			Assert.assertNotNull(susie.getCreneau_link());
			Assert.assertNotNull(susie.getEtat());
			Assert.assertNotNull(susie.getIntervenant());
			Assert.assertNotNull(susie.getSalle());
			Assert.assertNotNull(susie.getTimeline_barre());
			Assert.assertNotNull(susie.getTimeline_end());
			Assert.assertNotNull(susie.getTimeline_start());
			Assert.assertNotNull(susie.getTitle());
			Assert.assertNotNull(susie.getType());
		}

	}

	@Test(dependsOnMethods = "test_response_content")
	public void test_history_content() {
		ArrayList<IntraHistory> history = response.getHistory();

		for (IntraHistory entry : history) {
			Assert.assertNotNull(entry);
			Assert.assertNotNull(entry.getClassType());
			Assert.assertNotNull(entry.getContent());
			Assert.assertNotNull(entry.getDate());
			Assert.assertNotNull(entry.getId());
			Assert.assertNotNull(entry.getIdActivity());
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
