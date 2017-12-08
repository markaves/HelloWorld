package com.orangeandbronze;

import java.util.*;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> pets = new ArrayList<>();
    pets.add("dog");
    pets.add("cat");
    pets.add("fish");
    System.out.println(pets);
    
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(8);
    System.out.println(numbers);
    
    int i1 = Integer.parseInt("10");
    int i2 = Integer.parseInt("20");
    System.out.println(i1 + i2);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.toHexString(10));
    System.out.println(Integer.toBinaryString(10));
    
    double d1 = Double.parseDouble("1.4");
    double d2 = Double.parseDouble("3.6");
    System.out.println(d1 + d2);;
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);
    System.out.println(Double.POSITIVE_INFINITY);
    System.out.println(Double.NEGATIVE_INFINITY);
    System.out.println(Double.NaN);
    
    char ch = 'A';
    System.out.println(Character.isDigit(ch));
    System.out.println(Character.isLetter(ch));
    System.out.println(Character.isLetterOrDigit(ch));
    System.out.println(Character.isUpperCase(ch));
    System.out.println(Character.isLowerCase(ch));
    System.out.println(Character.isWhitespace(ch));
    System.out.println(Character.toLowerCase(ch));
    System.out.println(Character.toUpperCase(ch));
    
    Double d1a = 0.0;
    Double d2a = 0.0;
    System.out.println(d1a == d2a); // false;
    
    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(b1 == b2); // true;
    
    Integer i1a = 1;
    Integer i2a = 1;
    System.out.println(i1a == i2a);   // true

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);   // false
    
    Boolean b1b = new Boolean(true);
    Boolean b2b = true;
    System.out.println(b1b == b2b);   // false

    Integer i1b = new Integer(1);
    Integer i2b = 1;
    System.out.println(i1b == i2b);   // false
    
    System.out.println(System.currentTimeMillis());
    System.out.println(System.getProperty("os.name"));
    System.out.println(System.getProperty("user.name"));
    System.out.println(System.getProperty("user.dir"));
  }
}
