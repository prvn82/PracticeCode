package com.test;

import java.io.File;

public class hackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\prakumak\\Desktop\\JavaCode");
		
		String[] list = f.list();
		
		for(String S: list) {
			System.out.println(S);
		}

	}

}
