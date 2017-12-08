package com.orangeandbronze;

public class TotalPrice {
 public static void main(String[] args) {
	 final double[] prices = {75.0, 80.0, 90.0, 85.0, 70.0};

	 double total = 0;
	 for (double price : prices) {
       total += price; 
	 }
	 System.out.println(total);
 }
}