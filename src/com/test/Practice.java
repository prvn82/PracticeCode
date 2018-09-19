package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {


		// Solution by using Collection 

		int[] a1 = {2,43,2,3,4,12,23,76};
		int[] a2= {4,0,3,6,76,5,100};

		int[] a3 = new int[a1.length+a2.length];

		for(int i=0;i<a1.length;i++) {

			a3[i]=a1[i];
		}
		int rem_len=a1.length;
		for(int i=0;i<a2.length;i++) {
			a3[rem_len]=a2[i];
			rem_len++;

		}

		Arrays.sort(a3);
		System.out.println(Arrays.toString(a3));

		ArrayList<Integer> DuplicateValue = new ArrayList<>();
		ArrayList<Integer> SingleValue = new ArrayList<>();

		boolean flag;;

		for(int i=0;i<a3.length;i++) {
			flag=false;
			for(int j=i+1;j<a3.length;j++) {

				if(a3[i]==a3[j]) {
					flag=true;
					if(flag) {
						DuplicateValue.add(a3[i]);
					}
					break;
				}

			}

		}

		

		for(int i=0;i<a3.length;i++) {
			flag=false;
			for(int j=0;j<DuplicateValue.size();j++) {
				if(a3[i]==(int)DuplicateValue.get(j)) {
					flag=true;
				}
			}

			if(!flag) {
				SingleValue.add(a3[i]);
			}
		}
		
		System.out.println(DuplicateValue);

		System.out.println(SingleValue);


	}

}
