package com.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleInterestCalculator_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		;
		System.out.println("Enter Amount: ");
		String next = s.next();
		System.out.println("Enter Interest Rate:");
		
		SimpleInterestCalculator simpleInterest = new SimpleInterestCalculator("4000","7.5");
		BigDecimal totalValue = simpleInterest.calculateTotalValue("5");
		
		System.out.println(totalValue);

	}

}
