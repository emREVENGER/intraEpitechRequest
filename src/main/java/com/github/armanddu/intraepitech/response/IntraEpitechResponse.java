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

	public void setIp(String ip) {
		this.ip = ip;
	}

	public IntraBoard getBoard() {
		return board;
	}

	public void setBoard(IntraBoard board) {
		this.board = board;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public IntraGlobalInfos getInfos() {
		return infos;
	}

	public void setInfos(IntraGlobalInfos infos) {
		this.infos = infos;
	}

	public IntraCurrentInfos getCurrentInfos() {
		return currentInfos;
	}

	public void setCurrent(IntraCurrentInfos current) {
		this.currentInfos = current;
	}

	public ArrayList<IntraHistory> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<IntraHistory> history) {
		this.history = history;
	}

}
