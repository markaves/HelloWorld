package com.orangeandbronze.enlistment.console;

import com.orangeandbronze.enlistment.*;

public class PrintOut {
  public static void main(String[] args) {
    Student sherlock = new CollegeStudent(123, "Sherlock", "Holmes");
    System.out.println(sherlock);

    Section math1 = new Section("ABC999", Subject.MATH);    
    System.out.println(math1);
  }
}