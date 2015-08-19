package com.easylearnjava.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Purchase {

	private int id;	
	private double purchaseAmount;
	private double interestPercent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public double getInterestPercent() {
		return interestPercent;
	}

	public void setInterestPercent(double interestPercent) {
		this.interestPercent = interestPercent;
	}

}
