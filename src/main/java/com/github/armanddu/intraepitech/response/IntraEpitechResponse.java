package com.github.armanddu.intraepitech.response;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class IntraEpitechResponse {

	private String					ip;
	private IntraBoard				board;
	private String					message;
	private IntraGlobalInfos		infos;
	@SerializedName("current")
	private IntraCurrentInfos		currentInfos;
	private ArrayList<IntraHistory>	history;

	public String getIp() {
		return ip;
	}

	public IntraBoard getBoard() {
		return board;
	}

	public String getMessage() {
		return message;
	}

	public IntraGlobalInfos getInfos() {
		return infos;
	}

	public IntraCurrentInfos getCurrentInfos() {
		return currentInfos;
	}

	public ArrayList<IntraHistory> getHistory() {
		return history;
	}

}
