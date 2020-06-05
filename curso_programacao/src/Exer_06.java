import java.util.Locale;
import java.util.Scanner;

public class Exer_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float s1, s2, s3;
	
		s1 = sc.nextFloat();
		s2 = sc.nextFloat();
		s3 = sc.nextFloat(); // Raio
		
		double R, A, pi = 3.14159;
		
		double triangulo = (s1 * s3) / 2;
		double circulo = pi * s3 * s3;
		double trapezio = ((s1 + s2) * s3) / 2;
		double quadrado = s2 * s2;
		double retangulo = s1 * s2;
		
		System.out.printf("TRIANGULO: %.3f%n" , triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n" , trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
