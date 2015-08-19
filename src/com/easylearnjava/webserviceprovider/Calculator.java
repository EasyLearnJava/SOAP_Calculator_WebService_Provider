package com.easylearnjava.webserviceprovider;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.easylearnjava.webserviceexception.CalculatorException;


@WebService
@SOAPBinding(style=Style.RPC)
public interface Calculator {
	
	@WebMethod
	public int add2Numbers(int num1, int num2) throws CalculatorException;
	
	@WebMethod
	public int sub2Numbers(int num1, int num2) throws CalculatorException;
	
	@WebMethod
	public int mul2Numbers(int num1, int num2) throws CalculatorException;
	
	@WebMethod
	public double div2Numbers(int num1, int num2) throws CalculatorException;

}
