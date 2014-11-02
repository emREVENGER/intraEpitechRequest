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
	private List<IntraNote>		notes;
	private List<IntraSusie>	susies;
	@SerializedName("activites")
	private List<IntraActivity>	activities;
	private List<IntraModule>	modules;
	private List<Void>			stages;
	private List<Void>			tickets;

	public List<IntraProject> getProjects() {
		return projects;
	}

	public void setProjects(List<IntraProject> projects) {
		this.projects = projects;
	}

	public List<IntraNote> getNotes() {
		return notes;
	}

	public void setNotes(List<IntraNote> notes) {
		this.notes = notes;
	}

	public List<IntraSusie> getSusies() {
		return susies;
	}

	public void setSusies(List<IntraSusie> susies) {
		this.susies = susies;
	}

	public List<IntraActivity> getActivities() {
		return activities;
	}

	public void setActivities(List<IntraActivity> activities) {
		this.activities = activities;
	}

	public List<IntraModule> getModules() {
		return modules;
	}

	public void setModules(List<IntraModule> modules) {
		this.modules = modules;
	}

	public List<Void> getStages() {
		return stages;
	}

	public void setStages(List<Void> stages) {
		this.stages = stages;
	}

	public List<Void> getTickets() {
		return tickets;
	}

	public void setTickets(List<Void> tickets) {
		this.tickets = tickets;
	}

}
