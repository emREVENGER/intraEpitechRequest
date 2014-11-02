package com.github.armanddu.intraepitech.response;

/*
 * 				"title":"S0 - Sport",
 "title_link":"\/module\/2014\/G-EPI-010\/STG-0-1\/",
 "timeline_start":"10\/08\/2014",
 "timeline_end":"23\/06\/2015",
 "timeline_barre":"26.3197",
 "date_inscription":"13\/01\/2015, 00h00"
 */

public class IntraModule {
	private String	title;
	private String	title_link;
	private String	timeline_start;
	private String	timeline_end;
	private String	timeline_barre;
	private String	date_inscription;

	public String getTitle() {
		return title;
	}

	public String getTitle_link() {
		return title_link;
	}

	public String getTimeline_start() {
		return timeline_start;
	}

	public String getTimeline_end() {
		return timeline_end;
	}

	public Number getTimeline_barre() {
		return Double.valueOf(timeline_barre);
	}

	public String getDate_inscription() {
		return date_inscription;
	}

}
