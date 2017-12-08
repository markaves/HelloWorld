package com.orangeandbronze;

public class MethodExamples {
  public static void main(String[] args) {
	final double[] doubles = {4.7, 3.1, 2.8, 3.3, 5.6};
	System.out.println(add(doubles));
	
	final int[] numbers = {1, 2, 3};
	System.out.println(add(numbers));    // 6
	
	System.out.println(add(10, 20));    // 30
    System.out.println(add(10, 20, 30));    // 60
    System.out.println(add(10, 20, 30, 40));    // 100
  }
  
  static int add(int... addends) {
    int total = 0;
	for (int addend : addends) {
	  total += addend;
	}
	return total;
  }
  
  static double add(double... addends) {
    double total = 0;
	for (double addend : addends) {
	  total += addend;
	}
	return total;
  }
}