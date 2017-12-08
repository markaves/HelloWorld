package com.orangeandbronze;


import java.util.*;

public class RoundOffDoublesExercise {
  public static void main(String[] args) {
    long[] rounded = round(4.7, 3.1, 2.8, 3.3, 5.6);
    System.out.println(Arrays.toString(rounded)); // [5, 3, 3, 3, 6]
  }
  
  static long[] round(double... doubles) {  	  
	  long[] r = new long[doubles.length];
	  
	  for (int i = 0; i < doubles.length; i++) {		  
		  r[i] = Math.round((doubles[i]));
	  }   
	  return r;
  }
}
