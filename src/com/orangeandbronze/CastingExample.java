package com.orangeandbronze;

import java.math.*;
import java.util.*;

public class CastingExample {
  public static void main(String[] args) {
    /*Integer i = new Integer(10);
    Number n1 = i;
    System.out.println(n1.getClass().getName());    // java.lang.Integer
    Double d = new Double(7.50);
    Number n2 = d;
    System.out.println(n2.getClass().getName());    // java.lang.Double
    
    Integer i1 = new Integer(10);
    Number n = i1;
    Integer i2 = (Integer) n;     // Will not compile
    System.out.println(i2.getClass().getName()); */
	  
    Object o1 = new Object();       // Object is the superclass of all classes
    Object o2 = o1;                 // o2 points to same instance as o1
    System.out.println(o1 == o2);   // true
    
    Object o1a = new Object();       // Object is the superclass of all classes
    Object o2a = new Object();       // o2 points to a new instance
    System.out.println(o1a == o2a);   // false
    System.out.println(o1a.equals(o2a));
    
    BigDecimal b1 = new BigDecimal("7.50");
    BigDecimal b2 = b1;             // same instance
    System.out.println(b1 == b2);   // true
    System.out.println(b1.equals(b2));
    
    BigDecimal b1a = new BigDecimal("7.50");
    BigDecimal b2a = new BigDecimal("7.50"); 
    System.out.println(b1a == b2a);  // false, even if same value
    
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {1, 2, 3};
    System.out.println(arr1 == arr2);     // false
    System.out.println(Arrays.equals(arr1, arr2)); // true
    
    Number n = new BigDecimal("10");
    System.out.println(n instanceof BigDecimal); // true
    System.out.println(n instanceof BigInteger); // false
    System.out.println(n instanceof Number);  // true
    System.out.println(n instanceof Object);  // true
  }
}
