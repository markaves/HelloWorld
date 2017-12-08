package com.orangeandbronze;

public class FizzBuzz {
  public static void main(String[] args) {
    int item = 1;    
    
    while (item <= 100) {
      if (((item%3) == 0) && ((item%5) == 0)) {
    	  System.out.println("FizzBuzz");
      }	else if ((item%3) == 0) {
    	  System.out.println("Fizz");
      } else if ((item%5) == 0) {
    	  System.out.println("Buzz");
      } else {
    	  System.out.println(item);
      }
      item++;
    }     
  }
}
