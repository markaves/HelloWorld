package com.orangeandbronze;

import java.util.*;

public class SortListExercise {
  public static void main(String[] args) {
	  List<String> strings = new ArrayList<>();
	  strings.add("Ernie");
	  strings.add("Bert");
	  strings.add("Elmo");
	  strings.add("Grover");
	  strings.add("Abby");	  
	  Collections.sort(strings);	  
	  System.out.println(strings);
  }
}
