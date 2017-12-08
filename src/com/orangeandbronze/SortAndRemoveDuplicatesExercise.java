package com.orangeandbronze;

import java.util.*;

public class SortAndRemoveDuplicatesExercise {
  public static void main(String[] args) {
	Set<String> strings = new HashSet<>();
    strings.add("Ernie");
    strings.add("Ernie");
    strings.add("Bert");
    strings.add("Elmo");
    strings.add("Grover");
    strings.add("Abby");
    System.out.println(sortAndRemoveDuplicates(strings)); // sorted collection
    System.out.println(strings); // original collection remains unsorted
    List<String> strings2 = new LinkedList<>();
    strings2.add("Ernie");
    strings2.add("Ernie");
    strings2.add("Bert");
    strings2.add("Elmo");
    strings2.add("Grover");
    strings2.add("Abby");
    System.out.println(sortAndRemoveDuplicates(strings2)); // sorted collection
    System.out.println(strings2); // original collection remains unsorted
  }
  
  static Collection<String> sortAndRemoveDuplicates(Collection<String> strings) {
	return new TreeSet<>(strings);
  }
}
