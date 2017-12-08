package com.orangeandbronze;

import java.util.*;

public class TwoMonthsLaterExercise {
  public static void main(String[] args) {
	  Calendar cal = Calendar.getInstance();
	  cal.set(2014, Calendar.DECEMBER, 31);               // Wed Dec 31 XX:XX:XX PHT 2014
	  System.out.println(cal.getTime());
	  System.out.println(twoMonthsLater(cal.getTime())); // Sat Feb 28 XX:XX:XX PHT 2015
  }
  
  static Date twoMonthsLater(Date date) {
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	cal.add(Calendar.MONTH, 2);	
    return cal.getTime(); 
  }
}
