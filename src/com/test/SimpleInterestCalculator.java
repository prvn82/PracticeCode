package com.test;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	private BigDecimal principle;
	private BigDecimal interestRate;
	private BigDecimal totalValue;
	public SimpleInterestCalculator(String principle, String interestRate) {
		//super();
		this.principle = new BigDecimal(principle);
		this.interestRate = new BigDecimal(interestRate);;
		
	}
	
	public BigDecimal calculateTotalValue(String noOfYear) {
		
		BigDecimal noOfYear1 = new BigDecimal(noOfYear);
		
		BigDecimal TotalInterest = principle.multiply(interestRate).multiply(noOfYear1);
		
		return TotalInterest.add(principle);
	}
	
	

}
