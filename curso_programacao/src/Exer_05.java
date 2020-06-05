import java.util.Locale;
import java.util.Scanner;

public class Exer_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double s1, s2, s3, s4, s5, s6;
		
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();
		
		s4 = sc.nextDouble();
		s5 = sc.nextDouble();
		s6 = sc.nextDouble();
		
		System.out.println(s1 + " "+ s2 +" "+ s3);
		System.out.println(s4 + " "+ s5 +" "+ s6);

		double PAGO = (s2 * s3 + s5 * s6);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", PAGO);
		
		sc.close();

	}

}
