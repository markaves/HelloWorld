package com.orangeandbronze;

import java.util.*;

public class ToCSVCollectionExercise {
  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
	strings.add("Ernie");
	strings.add("Bert");
	strings.add("Elmo");
	strings.add("Grover");
	strings.add("Abby");
	System.out.println(toCsv(strings));
  }
  static String toCsv(Collection<String> tokens) {
	//StringBuilder builder = new StringBuilder();	
    //for(String token: tokens) {
    //  builder.append(token).append(",");
    //}     
    //return builder.toString();
	return String.join(",", tokens);
  }
}
