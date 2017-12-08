package com.orangeandbronze;

public class Fibonacci {
  static int fibAt(int n) {
      
	  if (n == 0 || n == 1) {
		  return n;	  
	  } else {
		  return fibAt(n - 1) + fibAt(n-2);  
	  }
  }	
	
  public static void main(String[] args) {
	final int fibA = fibAt(2);
    System.out.println(fibA);   // 1
    final int fibB = fibAt(6);
    System.out.println(fibB);   // 8
    final int fibC = fibAt(10);
    System.out.println(fibC);   // 55
  }
}
