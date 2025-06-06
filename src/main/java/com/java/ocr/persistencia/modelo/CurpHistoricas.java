package com.java.ocr.persistencia.modelo;

import java.util.List;

public class CurpHistoricas {

	private List<String> curpHistoricas;

	public List<String> getCurpHistoricas() {
		return curpHistoricas;
	}

	public void setCurpHistoricas(List<String> curpHistoricas) {
		this.curpHistoricas = curpHistoricas;
	}

	public CurpHistoricas() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurpHistoricas [curpHistoricas=");
		builder.append(curpHistoricas);
		builder.append("]");
		return builder.toString();
	}

}
