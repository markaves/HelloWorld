package com.orangeandbronze;

import java.util.*;

public class ParameterPassingExample {
  public static void main(String[] args) {
	int i = 10;    
    System.out.println("in main: " + i);  // i = 10
    test(i);
    System.out.println("in main: " + i);  // i still equals 10
    
    int[] ages = {10, 11, 12};
    System.out.println("before parameter passing:");
    System.out.println(Arrays.toString(ages));
    test(ages);  
    System.out.println("after parameter passing:");
    System.out.println(Arrays.toString(ages));
  }
  
  static void test(int i) {
   i = 20;                               // change value of parameter
   System.out.println("in test: " + i);  // i = 20
  }
  
  static void test ( int[] arr ) {
    for ( int i = 0 ; i < arr.length; i++ ) {
        arr[i] = i + 50;
    }
  }
}
