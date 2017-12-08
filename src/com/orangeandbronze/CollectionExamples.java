package com.orangeandbronze;

import java.util.*;
import java.util.concurrent.*;

public class CollectionExamples {
  public static void main(String[] args) {
	System.out.println("----- ArrayList -----");
	System.out.println("                     ");
    Collection<String> names = new ArrayList<>();
	names.add("Mickey");
	names.add("Minnie");
	names.add("Donald");
	System.out.println(names);	
	System.out.println("                     ");
	
	System.out.println("----- HashSet -----");
	Collection<String> moreNames = new HashSet<>();
	moreNames.add("Pluto");
	moreNames.add("Goofy");
	System.out.println(moreNames);
	System.out.println("                     ");
	
	System.out.println("----- PriorityQueue -----");
	Collection<String> mice = new PriorityQueue<>();
	mice.add("Mickey");
	mice.add("Minnie");
	mice.add("Ben");
	System.out.println(mice);
	System.out.println("                     ");
	
	System.out.println("----- ArrayList + Hashset -----");
	names.addAll(moreNames);
	System.out.println(names);
	System.out.println("                     ");
	
	System.out.println("----- Hashset + ArrayList -----");
	moreNames.addAll(names);
	System.out.println(moreNames);
	System.out.println("                     ");
	
	System.out.println("----- 'contains' method -----");
	System.out.println(names.contains("Goofy"));
	System.out.println("                     ");
	
	System.out.println("----- 'containsAll' method -----");
	System.out.println(names.containsAll(mice));
	System.out.println("                     ");
	
	System.out.println("----- 'remove' & 'removell' method -----");
	names.remove("Goofy");
	System.out.println(names);
	names.removeAll(mice);
	System.out.println(names);
	System.out.println("                     ");
	
	System.out.println("----- 'size' method -----");
	System.out.println(names.size());
	System.out.println("                     ");
	
	System.out.println("----- 'isEmpty' method -----");
	System.out.println(names.isEmpty());
	System.out.println("                     ");
	
	System.out.println("----- List -----");
	List<String> names1 = new ArrayList<>();
	names1.add("Mickey");
	names1.add("Minnie");
	names1.add("Donald");
	names1.add("Mickey");
	names1.add("Goofy");
	System.out.println(names1);
	System.out.println(names1.get(2));
	System.out.println(names1.set(3, "Daisy"));
	System.out.println(names1);
	System.out.println(names1.remove(4));
	System.out.println(names1);
	System.out.println("                     ");
	
	System.out.println("----- 'asList' method -----");
	List<String> names2 = Arrays.asList("Mickey", "Minnie", "Donald", "Goofy", "Pluto");
	System.out.println(names2);
	System.out.println("                     ");
	
	System.out.println("----- Queues -----");	
	Queue<String> q = new LinkedList<>(); // LinkedList is simplest FIFO queue
	q.offer("Minnie"); // offer used to add elements
	q.offer("Mickey"); // returns true if element successfully
	q.offer("Donald"); // added, & false otherwise
	q.offer("Goofy");
	q.offer("Pluto");
	System.out.println(q);
	System.out.println("                     ");
	
	System.out.println("----- 'peek' method -----");
	System.out.println(q.peek());
	System.out.println(q);
	System.out.println("                     ");
	
	System.out.println("----- 'poll' method -----");
	while (!q.isEmpty()) {
	    System.out.println(q.poll());
	    System.out.println(q);
	}
	System.out.println("                     ");
	
	System.out.println("----- BlockingQueues -----");
	Queue<String> q1 = new LinkedBlockingQueue<>(4);
	System.out.println(q1.offer("Mickey")); 
	System.out.println(q1.offer("Minnie")); 
	System.out.println(q1.offer("Donald")); 
	System.out.println(q1.offer("Goofy"));
	System.out.println(q1.offer("Pluto")); // will not be added, no exception thrown
	System.out.println(q1);
	System.out.println("                     ");
	
	System.out.println("----- PriorityQueue -----");
	Queue<String> q2 = new PriorityQueue<>();
	q2.offer("Mickey");
	q2.offer("Minnie");
	q2.offer("Pluto");
	q2.offer("Donald");
	q2.offer("Goofy");	
	System.out.println(q2);
	System.out.println(q2.peek());
	while (!q2.isEmpty()) {
	    System.out.println(q2.poll());
	    System.out.println(q2);
	}
	System.out.println("                     ");
	
	System.out.println("----- Deque (FIFO)-----");
	Deque<String> q3 = new LinkedList<>(); // LinkedList is also a deque!
	q3.offer("Mickey");
	q3.offer("Minnie");
	q3.offer("Donald");
	q3.offer("Goofy");
	q3.offer("Pluto");
	System.out.println(q3);
	System.out.println(q3.peek());
	while (!q3.isEmpty()) {
	    System.out.println(q3.poll());
	    System.out.println(q3);
	}
	System.out.println("                     ");
	
	System.out.println("----- Deque (LIFO)-----");
	Deque<String> q4 = new LinkedList<>(); // LinkedList is also a deque!
	q4.push("Mickey");
	q4.push("Minnie");
	q4.push("Donald");
	q4.push("Goofy");
	q4.push("Pluto");
	System.out.println(q4);
	System.out.println(q4.peek());
	while (!q4.isEmpty()) {
	    System.out.println(q4.pop());
	    System.out.println(q4);
	}
	System.out.println("                     ");
	
	System.out.println("----- HashSet-----");
	Set<String> names3 = new HashSet<>();
	names3.add("Mickey");
	names3.add("Minnie");
	names3.add("Donald");
	names3.add("Mickey");
	names3.add("Goofy");
	System.out.println(names3);
	System.out.println("                     ");
	
	System.out.println("----- LinkedHashSet-----");
	Set<String> names4 = new LinkedHashSet<>();
	names4.add("Mickey");
	names4.add("Minnie");
	names4.add("Donald");
	names4.add("Mickey");
	names4.add("Goofy");
	System.out.println(names4);
	System.out.println("                     ");
	
	System.out.println("----- TreeSet-----");
	Set<String> names5 = new TreeSet<>();
	names5.add("Mickey");
	names5.add("Minnie");
	names5.add("Donald");
	names5.add("Mickey");
	names5.add("Goofy");
	System.out.println(names5);
	System.out.println("                     ");
	
	System.out.println("----- SortedSet-----");
	SortedSet<String> names6 = new TreeSet<>();	
	names6.add("Mickey");
	names6.add("Minnie");
	names6.add("Donald");
	names6.add("Mickey");
	names6.add("Goofy");
	System.out.println(names6);
	System.out.println(names6.first());
	System.out.println(names6.last());
	System.out.println(names6.subSet("Goofy", "Minnie"));
	System.out.println(names6.headSet("Mickey"));
	System.out.println(names6.tailSet("Mickey"));
	System.out.println("                     ");
	
	System.out.println("----- Map-----");
	Map<Integer, String> map = new HashMap<>();
	map.put(4, "Erap");
	map.put(2, "Cory");
	map.put(3, "Ramos");
	map.put(1, "Marcos");
	map.put(5, "Gloria");
	System.out.println(map);
	System.out.println(map.get(2));
	System.out.println(map.get(4));
	map.put(4, "Obama"); // replaces
	System.out.println(map.get(4));
	System.out.println(map);
	System.out.println("                     ");
	
	System.out.println("----- 'keySet' method-----");
	Set<Integer> keySet = map.keySet();
	System.out.println(keySet);
	System.out.println("                     ");
	
	System.out.println("----- 'entrySet' method-----");
	Set<Map.Entry<Integer, String>> entries = map.entrySet();
	System.out.println(entries);
	System.out.println("                     ");
	
	System.out.println("----- Iterator (old way)-----");
	List<String> names7 =  Arrays.asList("Walter","Jesse","Saul","Gustavo","Skyler");
	Iterator<String> iter = names7.iterator();
	while(iter.hasNext()) {
	    String name = iter.next();
	    System.out.println("Name: " + name);
	}
	System.out.println("                     ");
	
	System.out.println("----- Iterator (new way)-----");
	List<String> names8 =  Arrays.asList("Walter", "Jesse", "Saul",
	        "Gustavo", "Skyler");

	for(String name: names8) {
	    System.out.println("Name: " + name);
	}
	System.out.println("                     ");
	
	System.out.println("----- Copy Constructor-----");
	List<String> names9 = Arrays.asList("Mickey", "Minnie", "Donald", "Goofy", "Pluto");
	Set<String> nameSet = new HashSet<>(names9);
	Queue <String> nameQueue = new PriorityQueue<>(nameSet);
	System.out.println(names);
	System.out.println(nameSet);
	System.out.println(nameQueue);
	
	Map<Integer, String> map1 = new HashMap<>();
	map1.put(1, "Mickey");
	map1.put(2, "Minnie");
	map1.put(3, "Donald");
	SortedMap<Integer, String> sortedMap = new TreeMap<>(map);
	Map<Integer, String> linkedMap = new LinkedHashMap<>(sortedMap);
	System.out.println(map);
	System.out.println(sortedMap);
	System.out.println(linkedMap);
	System.out.println("                     ");
	
	System.out.println("----- Collections-----");
	List<Integer> numbers = Arrays.asList(5, 3, 8, 6, 0, 5, 5);
	System.out.println(Collections.frequency(numbers, 5));
	System.out.println(Collections.max(numbers));
	System.out.println(Collections.min(numbers));
	Collections.sort(numbers);
	System.out.println(numbers);
	Collections.rotate(numbers, 2);
	System.out.println(numbers);
	Collections.shuffle(numbers);
	System.out.println(numbers);
	System.out.println("                     ");
  }
}
