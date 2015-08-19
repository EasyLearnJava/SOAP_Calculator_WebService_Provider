package com.easylearnjava.webserviceprovider;

import javax.jws.WebService;

import com.easylearnjava.dto.Purchase;
import com.easylearnjava.webserviceexception.InterestException;

@WebService(endpointInterface="com.easylearnjava.webserviceprovider.InterestCalculator")
public class InterestCalculatorImpl implements InterestCalculator{

	@Override
	public double calculateInterest(Purchase purchaseObj) throws InterestException {
		if (purchaseObj == null) {
            throw new InterestException("Input object is null...",
                "Purchase object is : " + purchaseObj );
        }
		return purchaseObj.getPurchaseAmount()*(purchaseObj.getInterestPercent()/100);
	}

	@Override
	public double calculateInterest(double amount, double interestPercent)
			throws InterestException {
		if (amount <= 0 || interestPercent <= 0) {
            throw new InterestException("Input amount and percentage must  be greater that Zero...",
                "Input amount is : " + amount + " and interest percentage is : " + interestPercent );
        }
		return amount*(interestPercent/100);
	}

}
