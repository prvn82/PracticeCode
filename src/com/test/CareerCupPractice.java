package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class meals{

	String dishes;
	ArrayList<String> ingredient = new ArrayList<>();
	public meals(String dishes, ArrayList<String> ingredient) {
		//super();
		this.dishes = dishes;
		this.ingredient = ingredient;
	}

}

public class CareerCupPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		meals[] m = new meals[5];
		ArrayList<String> arraylist= new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter dish Name");
			String dish=s.next();
			System.out.println("Enter Dish ingredent sperated by comma ','");
			String ingredent=s.next();
			String[] eachIngredient = ingredent.split(",");

			for(String s1 : eachIngredient) {

				arraylist.add(s1);
			}
			
			m[i]=new meals(dish, arraylist);

		}
		
		HashMap<ArrayList<String>,String> myHashMap = new HashMap<>();
		for(int i=0;i<5;i++){
			myHashMap.put(m[i].ingredient, m[i].dishes);
		}
		System.out.println(myHashMap.size());

		
		



	}

}
