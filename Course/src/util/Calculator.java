package util;

public class Calculator {
	// Versão 1 e 2
	
//	public final double PI = 3.14159;
//	
//	public double circumference(double radius){
//		return 2.0 * PI * radius;
//	}
//	public double volume(double radius){
//		return 4.0 * PI * radius * radius * radius / 3.0;
//		
//	}
	
	// Versão 3
	public static final double PI = 3.14159; // static

	public static double circumference(double radius) { // static
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) { // static
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
