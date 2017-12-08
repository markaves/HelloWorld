package com.orangeandbronze;

import java.math.*;
import java.util.*;

public class ObjectExample {
  public static void main(String[] args) {
    Object object = new Object();
    String objectString = object.toString();
    System.out.println(objectString);

    int[] array = {1, 2, 3, 4, 5};
    String arrayString = array.toString();
    System.out.println(arrayString);
    
    BigDecimal bd = new BigDecimal("1.00");
    String bdString = bd.toString();
    System.out.println(bdString);
    System.out.println(bd);

    Date now = new Date();
    String nowString = now.toString();
    System.out.println(nowString);
    System.out.println(now);
    
    BigDecimal money = new BigDecimal("100.00");
    Date now1 = new Date();
    String message = "You owe me " + money 
            + " pesos. Please pay me on " + now1 + ".";
    System.out.println(message);
    System.out.println("You owe me " + money + " pesos. Please pay me on " + now1 + ".");
    
    BigDecimal b1 = new BigDecimal("1.00");
    BigDecimal b2 = new BigDecimal("1.00");
    System.out.println(b1 == b2); // false
    System.out.println(b1.equals(b2)); // true

    Calendar cal = Calendar.getInstance();
    cal.set(1985, Calendar.JULY, 1);
    Date d1 = cal.getTime();
    Date d2 = cal.getTime();
    System.out.println(d1 == d2); // false
    System.out.println(d1.equals(d2)); // true
  }
}
