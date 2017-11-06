/**
 * 
 */
package com.domath;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

import com.service.DoCalculations;
import com.vo.InputVO;

/**
 * This is the class that has been written for Code Coverage using Power Mockito and coverage measured using EclEmma Plugin
 * @author Natraj Ayappan
 *
 */

@PrepareForTest({InputVO.class, DoCalculations.class})
public class DoMathTest extends PowerMockTestCase {

	InputVO inputVO;
	DoCalculations doc;
	double num1;
	double num2;
	
	@Before
	public void setUp() throws Exception {
		inputVO = new InputVO();
		inputVO.setNumberOne(10);
		inputVO.setNumberTwo(5);
		doc = new DoCalculations(inputVO);
		num1 = inputVO.getNumberOne();
		num2 = inputVO.getNumberTwo();
	}
	
	@Test
	public void testDoMath_Add() {
		double d = doc.add(num1, num2);
		assertEquals("15.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Sub() {
		double d = doc.subtract(num1, num2);
		assertEquals("5.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Mul() {
		double d = doc.multiply(num1, num2);
		assertEquals("50.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Div() {
		double d = doc.divide(num1, num2);
		assertEquals("2.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Add1() {
		String operation = "ADD";
		double d = doc.doMath(inputVO, operation);
		assertEquals("15.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Sub1() {
		String operation = "SUB";
		double d = doc.doMath(inputVO, operation);
		assertEquals("5.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Mul1() {
		String operation = "MUL";
		double d = doc.doMath(inputVO, operation);
		assertEquals("50.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Div1() {
		String operation = "DIV";
		double d = doc.doMath(inputVO, operation);
		assertEquals("2.0", String.valueOf(d));
	}
	
	@Test
	public void testDoMath_Switch_Default() {
		String operation = "";
		double d = doc.doMath(inputVO, operation);
		assertEquals("0.0", String.valueOf(d));
	}
}
