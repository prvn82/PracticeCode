package com.test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

public class Hackerrank4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount =200.0;
		StringBuffer Rs = new StringBuffer("Rs");
	   Locale locale = new Locale("en", "IN");      
     NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
	//	NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

     String format = currencyFormatter.format(amount, Rs, new FieldPosition(0)).toString();
System.out.println(format);

	}

};
