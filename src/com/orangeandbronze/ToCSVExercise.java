package com.orangeandbronze;

public class ToCSVExercise {
  public static void main(String[] args) {
    System.out.println(toCsv("Row", "row", "row", "your boat"));  // Row,row,row,your boat,
  }
  
  static String toCsv(String...strings) {
	  StringBuilder builder = new StringBuilder();
	  for (String str: strings) {
    	builder.append(str).append(",");
    }
	return builder.toString();
  }  
}
