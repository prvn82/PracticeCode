package com.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hackerrank3  {

		
	public static  String getDay(String day,String month, String year){
		
		int year1= Integer.parseInt(year);
		int month2=Integer.parseInt(month)-1;
		int day2=Integer.parseInt(day);
		
	    Calendar d = Calendar.getInstance();
	    d.set(year1, month2, day2);
	    int i = d.get(Calendar.DAY_OF_WEEK)-1;
	    String actualDay=null;
        switch(i) {
        case 0:
            actualDay="SUNDAY";
            break;
		case 1:
			actualDay="MONDAY";
            break;
		case 2:
			actualDay="TUESDAY";
            break;
		case 3:
			actualDay="WEDNESDAY";
            break;
		case 4:
			actualDay="THRUSDAY";
            break;
		case 5:
			actualDay="FRIDAY";
            break;
		case 6:
			actualDay="SATURDAY";
            break;
        }
		return actualDay;
	  
	    
	}

		public static void main(String[] args) throws Exception {
    	 
    	 Scanner in = new Scanner(System.in);
         String month = in.next();
         String day = in.next();
         String year = in.next();
         
         System.out.println(getDay(day, month, year));
     }
    	
}

	
