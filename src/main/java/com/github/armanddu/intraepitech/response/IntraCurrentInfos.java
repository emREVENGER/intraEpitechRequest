package com.github.armanddu.intraepitech.response;

public class IntraCurrentInfos {

	private String	active_log;
	private String	credits_min;
	private String	credits_norm;
	private String	credits_obj;
	private String	nslog_min;
	private String	nslog_norm;
	private String	semester_code;
	private String	semester_num;
	private Number	achieved;
	private Number	failed;
	private Number	inprogress;

	public String getActive_log() {
		return active_log;
	}

	public void setActive_log(String active_log) {
		this.active_log = active_log;
	}

	public String getCredits_min() {
		return credits_min;
	}

	public void setCredits_min(String credits_min) {
		this.credits_min = credits_min;
	}

	public String getCredits_norm() {
		return credits_norm;
	}

	public void setCredits_norm(String credits_norm) {
		this.credits_norm = credits_norm;
	}

	public String getCredits_obj() {
		return credits_obj;
	}

	public void setCredits_obj(String credits_obj) {
		this.credits_obj = credits_obj;
	}

	public String getNslog_min() {
		return nslog_min;
	}

	public void setNslog_min(String nslog_min) {
		this.nslog_min = nslog_min;
	}

	public String getNslog_norm() {
		return nslog_norm;
	}

	public void setNslog_norm(String nslog_norm) {
		this.nslog_norm = nslog_norm;
	}

	public String getSemester_code() {
		return semester_code;
	}

	public void setSemester_code(String semester_code) {
		this.semester_code = semester_code;
	}

	public String getSemester_num() {
		return semester_num;
	}

	public void setSemester_num(String semester_num) {
		this.semester_num = semester_num;
	}

	public Number getAchieved() {
		return achieved;
	}

	public void setAchieved(Number achieved) {
		this.achieved = achieved;
	}

	public Number getFailed() {
		return failed;
	}

	public void setFailed(Number failed) {
		this.failed = failed;
	}

	public Number getInprogress() {
		return inprogress;
	}

	public void setInprogress(Number inprogress) {
		this.inprogress = inprogress;
	}

}
