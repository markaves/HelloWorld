package com.orangeandbronze;

public class Rounding {
  public static void main(String[] args) {
    final double[] doubles = {4.7, 3.1, 2.8, 3.3, 5.6};
	
    for (double item : doubles) {
      //System.out.println(Math.round(item));
      if (item - (int) item >= .5) {
    	  System.out.println((int) item + 1);  
      } else {
    	  System.out.println((int) item);
      }
    }    	
  }
}
