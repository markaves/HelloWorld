package com.orangeandbronze;

import java.util.*;

public class ArrayUtility {
  public static void main(String[] args) {
    int[] integerArray = {5, 3, 2, 7, 1};
    Arrays.sort(integerArray);
    System.out.println(integerArray);
    System.out.println(Arrays.toString(integerArray));
    System.out.println(Arrays.binarySearch(integerArray, 5));
  }	
}
