package com.orangeandbronze;

public class FindMax {
  static double findMax(double... items) {
	  double max = 0;
	  for (double item : items) {
		if (max < item) {
			max = item;
		}
	  }
	  return max;
  }
	
  public static void main(String[] args) {
	double max1 = findMax(10, 3.7, -5);
    System.out.println(max1); // 10.
    double max2 = findMax(-7.5, 1.3e5, 73, 0.9); 
    System.out.println(max2); // 130000.0
    double max3 = findMax(0.1, -1.2, 0, 3, 99, -9e9);
    System.out.println(max3); // 99.0
  }
}
