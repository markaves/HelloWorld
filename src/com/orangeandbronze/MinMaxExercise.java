package com.orangeandbronze;

import java.util.*;

public class MinMaxExercise {
  public static void main(String[] args) {
	Collection<Integer> numbers = new ArrayList<>();
    numbers.add(5);
	numbers.add(8);
	numbers.add(3);
	numbers.add(12);
	numbers.add(2);
	System.out.println(Collections.min(numbers)); // Get minimum
	System.out.println(Collections.max(numbers)); // Get maximum
  }
}
