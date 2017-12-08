package com.orangeandbronze;

public class StringtoIntegersExercise {
  public static void main(String[] args) {
	System.out.println(sumIntegersAsString("10", "20"));  // 30
    System.out.println(sumIntegersAsString("10", "20", "30"));  // 60
    System.out.println(sumIntegersAsString("10", "20", "30", "40"));  // 100
  }
  
  static int sumIntegersAsString(String...stringIntegers) {
	int sum = 0;
	for (String str:stringIntegers) {
		sum += Integer.parseInt(str);
	}
    return sum;
  }
}
