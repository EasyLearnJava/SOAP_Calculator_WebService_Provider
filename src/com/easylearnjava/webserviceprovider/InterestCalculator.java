package com.easylearnjava.webserviceprovider;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.easylearnjava.dto.Purchase;
import com.easylearnjava.webserviceexception.InterestException;

@WebService
@SOAPBinding(style=Style.RPC)
public interface InterestCalculator {
	
	@WebMethod(operationName="calculateInterestFromObject")
	public double calculateInterest(Purchase purchaseObj) throws InterestException;
	
	@WebMethod(operationName="calculateSimpleInterest")
	public double calculateInterest(double amount, double interestPercent) throws InterestException;
}
