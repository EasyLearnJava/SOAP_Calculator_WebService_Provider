package com.easylearnjava.webserviceexception;

public class CalculatorException extends Exception {

	String detailMsg;

	public CalculatorException(String message, String detailMsg) {
		super(message);
		this.detailMsg = detailMsg;
	}

	public String getDetailMsg() {
		return detailMsg;
	}

}