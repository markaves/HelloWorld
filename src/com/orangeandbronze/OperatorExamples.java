package com.orangeandbronze;

public class OperatorExamples {
  public static void main(String[] args) {
	  boolean left = true;
	  boolean right = true;
	  System.out.println(left ^ right);   // false

	  left = false;
	  right = true;
	  System.out.println(left ^ right);    // true

	  left = true;
	  right = false;
	  System.out.println(left ^ right);    // true

	  left = false;
	  right = false;
	  System.out.println(left ^ right);    // false
  }
}
