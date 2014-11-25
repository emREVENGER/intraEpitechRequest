package com.github.armanddu.intraepitech.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

//TODO stages POJO
//TODO tickets POJO

/*
 {
 "projects" : [],
 "notes" : [],
 "susies" : [],
 "activites" : [],
 "modules" : [],
 "stages" : [],
 "tickets" : []
 }
 */
public class IntraBoard {

	@SerializedName("projets")
	private List<IntraProject>	projects;
	@SerializedName("notes")
	private List<IntraNote>		grades;
	private List<IntraSusie>	susies;
	@SerializedName("activites")
	private List<IntraActivity>	activities;
	private List<IntraModule>	modules;
	@SerializedName("stages")
	private List<Void>			internships;
	private List<Void>			tickets;

	public List<IntraProject> getProjects() {
		return projects;
	}

	public List<IntraNote> getGrades() {
		return grades;
	}

	public List<IntraSusie> getSusies() {
		return susies;
	}

	public List<IntraActivity> getActivities() {
		return activities;
	}

	public List<IntraModule> getModules() {
		return modules;
	}

	public List<Void> getInternships() {
		return internships;
	}

	public List<Void> getTickets() {
		return tickets;
	}

}
