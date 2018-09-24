package com.test;

import java.util.Scanner;

public class ChoiceProgram {
	
	private static int num1;
	private static int num2;
	private static int choice;
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	System.out.println( "Enter first Number: ");
	num1=s.nextInt();
	
	System.out.println("Enter second Number");
	
	num2=s.nextInt();
	
	System.out.println("Enter your Choice");
	System.out.println("1 - Addition");
	System.out.println("2 - Multiplication");
	System.out.println("3 - Subtraction");
	System.out.println("4 - Division");
	
	choice=s.nextInt();
	
	switch(choice) {
	case 1:
		 System.out.println("Result is "+(num1+num2));
		break;
	case 2:
		 System.out.println("Result is "+(num1*num2));
			break;
	case 3:
		 System.out.println("Result is "+(num1-num2));
			break;
	 case 4:
		 System.out.println("Result is "+(num1/num2));
			break;
	 default:
		 System.out.println("Wrong Choice");
		 
	}




	
	
	}
}
