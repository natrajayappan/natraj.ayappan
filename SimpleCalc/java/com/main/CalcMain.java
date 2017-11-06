/**
 * 
 */
package com.main;

import java.util.Scanner;

import com.service.DoCalculations;
import com.vo.InputVO;

/**
 * @author Natraj Ayappan
 *
 */
public class CalcMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputVO inVO = new InputVO();
		System.out.println("Please enter the first number: ");
		Scanner scanner = new Scanner(System.in);
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Please enter the second number: ");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Please enter the Operation (ADD/SUB/MUL/DIV): ");
		String operation = scanner.nextLine();
		
		inVO.setNumberOne(num1);
		inVO.setNumberTwo(num2);
		
		DoCalculations d = new DoCalculations(inVO);
		System.out.println("Your Result:::"+d.doMath(inVO, operation.toUpperCase()));
	}

}
