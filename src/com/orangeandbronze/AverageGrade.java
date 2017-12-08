package com.orangeandbronze;

public class AverageGrade {
	public static void main(String[] args) {
	    final double[] grades = {75.0, 80.0, 90.0, 85.0, 70.0};
	    
	    final double total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
	    System.out.println(total);
	    final double average = total / grades.length;
	    System.out.println(average);
	    
	    final String[] firstnames = {"Mickey", "Bugs", "Optimus"};
	    final String[] lastnames = {"Prime", "Mouse", "Bunny"};	    
	    System.out.println(firstnames[0] + " " + lastnames[1]);
	    System.out.println(firstnames[1] + " " + lastnames[2]);
	    System.out.println(firstnames[2] + " " + lastnames[0]);
	}
}