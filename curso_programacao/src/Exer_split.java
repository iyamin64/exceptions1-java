import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula as raízes de uma equação do segundo grau
Os valores dos coeficientes devem ser digitados um por linha
*/


public class Exer_split {

	public static void main(String[] args) {
		
//		String s = "potato apple lemon";
//		String[] vect = s.split(" ");
//		System.out.println(vect[0]);
//		System.out.println(vect[1]);
//		System.out.println(vect[2]);
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c; // cálculo do valor de delta
		

		
	}

}
