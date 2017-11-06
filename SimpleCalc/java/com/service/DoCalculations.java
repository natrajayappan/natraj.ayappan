package com.service;

import com.vo.InputVO;

public class DoCalculations {

	public DoCalculations(InputVO inputVO) {
		
	}
	
	
	public double doMath(InputVO inputVO, String operation) {
		double retVal;
		
		double num1 = inputVO.getNumberOne();
		double num2 = inputVO.getNumberTwo();
		
		switch (operation) {
			case "ADD" :
				retVal = num1 + num2;
				break;
				
			case "SUB" :
				retVal = num1 - num2;
				break;
				
			case "MUL" :
				retVal = num1 * num2;
				break;
				
			case "DIV" :
				retVal = num1 / num2;
				break;
			
			default :
				retVal = 0;	
		}
		
		return retVal;
	}
	
	
	
	
	
	
	
	
	
	
	public double add (double num1, double num2) {
		double retValue;
			retValue = num1 + num2;
		return retValue;
	}
	
	public double subtract (double num1, double num2) {
		double retValue;
			retValue = num1 - num2;
		return retValue;
	}
	
	public double multiply (double num1, double num2) {
		double retValue;
			retValue = num1 * num2;
		return retValue;
	}
	
	public double divide (double num1, double num2) {
		double retValue;
			retValue = num1 / num2;
		return retValue;
	}
	
}
