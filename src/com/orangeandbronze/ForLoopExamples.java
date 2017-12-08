package com.orangeandbronze;

public class ForLoopExamples {
  public static void main(String[] args) {
	  char[] letters = {'A', 'B', 'C', 'D', 'E'};

	  for (char letter : letters) {
	      if (letter == 'D') {
	          break;
	      }
	      System.out.println(letter);
	  }
  }
}
