package com.github.armanddu.intraepitech.response;

/*
 {
 "active_log":"ii.iii",
 "credits_min":"ii",
 "credits_norm":"iii",
 "credits_obj":"iii",
 "nslog_min":"ii",
 "nslog_norm":"ii",
 "semester_code":"B5",
 "semester_num":"i",
 "achieved":iii,
 "failed":i,
 "inprogress":ii
 }
 */
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

	public Number getActive_log() {
		return Double.valueOf(active_log);
	}

	public Number getCredits_min() {
		return Integer.valueOf(credits_min);
	}

	public Number getCredits_norm() {
		return Integer.valueOf(credits_norm);
	}

	public Number getCredits_obj() {
		return Integer.valueOf(credits_obj);
	}

	public Number getNslog_min() {
		return Double.valueOf(nslog_min);
	}

	public Number getNslog_norm() {
		return Double.valueOf(nslog_norm);
	}

	public String getSemester_code() {
		return semester_code;
	}

	public Number getSemester_num() {
		return Integer.valueOf(semester_num);
	}

	public Number getAchieved() {
		return achieved;
	}

	public Number getFailed() {
		return failed;
	}

	public Number getInprogress() {
		return inprogress;
	}

}
