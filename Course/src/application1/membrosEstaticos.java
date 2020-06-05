package application1;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class membrosEstaticos {
	// Versão 1
	
//	public static final double PI = 3.14159;
//
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//
//		System.out.println("Enter radius: ");
//		double radius  = sc.nextDouble();	
//		
//		double c = circumference(radius);
//		
//		double v = volume(radius);
//		
//		System.out.printf("Circumfrence: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", PI);
//	
//		sc.close();
//	}
//	public static double circumference(double radius){
//		return 2.0 * PI * radius;
//	}
//	public static double volume(double radius){
//		return 4.0 * PI * radius * radius * radius / 3.0;
//		
//	}
	
	// Versão 2

//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator(); // instanciar
//
//		System.out.println("Enter radius: ");
//		double radius  = sc.nextDouble();	
//		
//		double c = calc.circumference(radius);
//		
//		double v = calc.volume(radius);
//		
//		System.out.printf("Circumfrence: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", calc.PI);
//	
	// Versão 3

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius); // classe pois virou static

		double v = Calculator.volume(radius);

		System.out.printf("Circumfrence: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
