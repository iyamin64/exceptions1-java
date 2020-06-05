import java.util.Locale;
import java.util.Scanner;

public class Exer_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double valor = sc.nextDouble();
		double porHora	= sc.nextDouble();	
		
		double salario = valor * porHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}