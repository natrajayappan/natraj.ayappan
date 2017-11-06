/**
 * 
 */
package com.domath;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.service.DoCalculations;
import com.vo.InputVO;

/**
 * This class contains the functional junits written using Junit 4
 * @author Natraj Ayappan
 *
 */
public class TestDoMath {
	
	   @Test
	 	public void testDoMath_Add1() {
		   String methodName = "TestDoMath.testDoMath_Add1()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   boolean isValid = false;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(2);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.add(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   if(d == 7) {
			   isValid = true;
		   }
		   assertTrue(isValid);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Add2() {
		   String methodName = "TestDoMath.testDoMath_Add2()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(2);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.add(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   assertNotEquals(10, d);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Sub1() {
		   String methodName = "TestDoMath.testDoMath_Sub1()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   boolean isValid = false;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(20);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.subtract(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   if(d == 15) {
			   isValid = true;
		   }
		   assertTrue(isValid);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Sub2() {
		   String methodName = "TestDoMath.testDoMath_Sub2()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(2);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.subtract(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   assertNotEquals(10, d);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Mul1() {
		   String methodName = "TestDoMath.testDoMath_Mul1()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   boolean isValid = false;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(2);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.multiply(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   if(d == 10) {
			   isValid = true;
		   }
		   assertTrue(isValid);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Mul2() {
		   String methodName = "TestDoMath.testDoMath_Mul21()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(2);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.multiply(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   assertNotEquals(101, d);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Div1() {
		   String methodName = "TestDoMath.testDoMath_Div1()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   boolean isValid = false;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(20);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.divide(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   if(d == 4) {
			   isValid = true;
		   }
		   assertTrue(isValid);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
	   
	   @Test
	 	public void testDoMath_Div2() {
		   String methodName = "TestDoMath.testDoMath_Div2()";
		   System.out.println("Entering "+methodName+" -->");
		   double d = 0;
		   InputVO inputVO = new InputVO();
		   inputVO.setNumberOne(20);
		   inputVO.setNumberTwo(5);
		   DoCalculations doc = new DoCalculations(inputVO);
		   d = doc.divide(inputVO.getNumberOne(), inputVO.getNumberTwo());
		   
		   assertNotEquals(10, d);
		   System.out.println("Exiting "+methodName+" -->");
	 	}
}
