package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class W3_2 {
	//Problem Statement
	
	//Write a Java program to find the index of the first unique character in a given string, assume that there is at least one unique character in the string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "wwiikc";
		String[] split = str.split("");
		
		String[] unique = new String[split.length];
	
		int count=0;
		
		if(str.length()==1) {
			 
			System.out.println("First unique character of the above: "+split[0]);
		}
		else {
			
		   for(int i=0;i<split.length;i++) {
			   count=0;
			   for(int j=0;j<split.length;j++) {
				   if(split[i].equals(split[j])){
					   count=count+1;
				   }
				   
			   }
			   
			   if(count==1) {
				   System.out.println(split[i]+count);
				   break;
			   }
		   }
			
		}
			

	}

}
