package com.orangeandbronze.enlistment.console;

import com.orangeandbronze.enlistment.*;

public class TestEquals {
  public static void main(String[] args) {
    Student sherlock1 = new CollegeStudent(123, "Sherlock", "Holmes");
    Student sherlock2 = new CollegeStudent(123, "Sherlock", "Holmes");
    System.out.println(sherlock1.equals(sherlock2));  // false
    Section math1 = new Section("ABC999", Subject.MATH);
    Section math2 = new Section("ABC999", Subject.MATH);
    System.out.println(math1.equals(math2));          // false
  }
}
