package com.easylearnjava.webserviceexception;

public class InterestException extends Exception {

	String detailMsg;

	public InterestException(String message, String detailMsg) {
		super(message);
		this.detailMsg = detailMsg;
	}

	public String getDetailMsg() {
		return detailMsg;
	}

}