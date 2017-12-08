package com.orangeandbronze;

public class StringManagementExample {
  public static void main(String[] args) {
	String x = stringX(); 
    String y = stringY(); 
    System.out.println(x == y); // true
    
    StringBuilder builder = new StringBuilder("Please").append('B').append(true).append(2).append("me.");
    // Convert StringBuilder contents to String:
    String message = builder.toString();
    System.out.println(message);
  }
  
  static String stringX() { 
    return "Test";
  }

  static String stringY() {
    return "Test";
  }
}
