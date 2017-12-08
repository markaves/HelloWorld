package com.orangeandbronze.enlistment.console;

import com.orangeandbronze.enlistment.*;

public class ConsoleRunner {
  public static void main(String[] args) {
	  Student sherlock = new CollegeStudent(123, "Sherlock", "Holmes");
	  System.out.println(sherlock.getStudentNumber());    // 123
	  System.out.println(sherlock.getFirstname());        // Sherlock
	  System.out.println(sherlock.getLastname());         // Holmes

	  Section math1 = new Section("ABC999", Subject.MATH);    
	  Section math2 = new Section("DEF888", Subject.MATH);
	  Section his1 = new Section("GHI777", Subject.HISTORY);
	  Section his2 = new Section("JKL123", Subject.HISTORY);
	  System.out.println(math1.getSectionId());            // MNO555
	  System.out.println(math2.getSubject());              // ENGLISH
  }
}
