package com.orangeandbronze;

public class Average {
  static double average(double... items) {
	double total = 0;
	for (double item : items) {
	  total += item;
	}
	return total/items.length;
  }	
	
  public static void main(String[] args) {
	final double ave1 = average(5.8, 3.2);
    System.out.println(ave1);    // 4.5
    final double ave2 = average(7.5, 22.5, 10);
    System.out.println(ave2);    // 13.3333...
    final double ave3 = average(6, 18, 7.5, 9.8);
    System.out.println(ave3);    // 10.325
  }
}
