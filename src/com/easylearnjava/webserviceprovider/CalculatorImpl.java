package com.easylearnjava.webserviceprovider;

import javax.jws.WebService;

import com.easylearnjava.webserviceexception.CalculatorException;

@WebService(endpointInterface="com.easylearnjava.webserviceprovider.Calculator")
public class CalculatorImpl implements Calculator{

	@Override
	public int add2Numbers(int num1, int num2) throws CalculatorException {
		 if (num1 < 0 || num2 < 0) {
	            throw new CalculatorException("Input must be greater that or equal to Zero...",
	                "Input is : " + num1 + ", " + num2);
	        }
		return num1 + num2;
	}

	@Override
	public int sub2Numbers(int num1, int num2) throws CalculatorException {
		 if (num1 < 0 || num2 < 0) {
	            throw new CalculatorException("Input must be greater that or equal to Zero...",
	                "Input is : " + num1 + ", " + num2);
	        }
		return num1 - num2;
	}

	@Override
	public int mul2Numbers(int num1, int num2) throws CalculatorException {
		if (num1 <= 0 || num2 <= 0) {
            throw new CalculatorException("Input must be greater that Zero...",
                "Input is : " + num1 + ", " + num2);
        }
		return num1 * num2;
	}

	@Override
	public double div2Numbers(int num1, int num2) throws CalculatorException {
		if (num1 <= 0 || num2 <= 0) {
            throw new CalculatorException("Input must be greater that Zero...",
                "Input is : " + num1 + ", " + num2);
        }
		return num1/num2;
	}

}
