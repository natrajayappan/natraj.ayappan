/**
 * 
 */
package com.domath;

import org.junit.Before;
import org.junit.Test;
import org.powermock.modules.testng.PowerMockTestCase;

import com.main.CalcMain;
import com.service.DoCalculations;
import com.vo.InputVO;

/**
 * This is the class that has been written for Code Coverage using Power Mockito and coverage measured using EclEmma Plugin
 * @author Natraj Ayappan
 *
 */
public class CalcMainTest extends PowerMockTestCase{
	
	InputVO inputVO;
	DoCalculations doc;
	CalcMain calc;
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
		calc = new CalcMain();
	}
	
	@Test
	public void testMain() {
		String[] args = {"10", "2", "ADD"};
		calc.main(args);
		
	}
	
}
