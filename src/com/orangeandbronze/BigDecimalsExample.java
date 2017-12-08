package com.orangeandbronze;

import java.math.BigDecimal; // import statement

public class BigDecimalsExample {
  public static void main(String[] args) {  
    
    double funds1 = 1.00;
    int itemsBought1 = 0;
    for (double price1 = 0.10; funds1 >= price1; price1 += 0.10) {
        funds1 -= price1;
        itemsBought1++;
    }
    System.out.println(itemsBought1 + " items bought.");
    System.out.println("Change: PHP " + funds1);
    
    
    BigDecimal TEN_CENTS = new BigDecimal("0.10");
    int itemsBought2 = 0;
    BigDecimal funds2 = new BigDecimal("1.00");
    for (BigDecimal price2 = TEN_CENTS; funds2.compareTo(price2) >= 0;
            price2 = price2.add(TEN_CENTS)) {
        itemsBought2++;
        funds2 = funds2.subtract(price2);
    }
    System.out.println(itemsBought2 + " items bought.");
    System.out.println("Change: PHP " + funds2);
    
    BigDecimal salary = new BigDecimal("2600.00");
    BigDecimal mySalary = salary;
    BigDecimal hisSalary = salary;
    System.out.println(salary + " | " + mySalary + " | " + hisSalary);
    
    salary = null;
    System.out.println(salary + " | " + mySalary + " | " + hisSalary);
  }
}