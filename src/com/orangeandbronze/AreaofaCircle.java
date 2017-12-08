package com.orangeandbronze;

public class AreaofaCircle {
  static double square(double param) {
    return param * param;
  }
  
  static double areaOfCircleFromDiameter(int param) {
	return 3.1416 * square(param / 2);  
  }
  
  static double areaOfCircleFromDiameter(double param) {
	return 3.1416 * square(param / 2);  
  }
  
  public static void main(String[] args) {	
    final double area1 = areaOfCircleFromDiameter(10);
    System.out.println(area1);     // 78.54
    final double area2 = areaOfCircleFromDiameter(0.5);
    System.out.println(area2);     // 0.19635
    final double area3 = areaOfCircleFromDiameter(7.50);
    System.out.println(area3);     // 44.17875
  }
}
