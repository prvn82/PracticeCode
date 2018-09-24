package com.test;

import java.util.Arrays;

public class W3SchoolProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "xxyz";
		String str2 = "yezx";
		System.out.println("Original strings: "+str1+"  "+str2);
        System.out.println(stringPermutation(str1, str2));
		

	}
	
	public static boolean stringPermutation(String str1, String str2) {
        int[] arr = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            //arr[(int) str1.charAt(i)] +=1;
            arr[(int) str1.charAt(i)]=arr[(int) str1.charAt(i)]+1;
        }
        
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }
        
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;

}
}
