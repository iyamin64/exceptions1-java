import java.util.Locale;
import java.util.Scanner;

public class Exer_scanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
//		String x;
//		x = sc.next();
		
//		int y;
//		y = sc.nextInt();
		
//		double z;
//		z = sc.nextDouble();
//		
//		//System.out.println("Voce digitou: " + z);
//		System.out.printf("Voce digitou: %.2f%n", z);
		
		
		/*char z;
		z = sc.next().charAt(0);
		System.out.println("Voce digitou: " + z);*/

		//Para ler vários dados na mesma linha
		String r;
		int s;
		double t;
		r = sc.next();
		s = sc.nextInt();
		t = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
	
		sc.close();
	}

}
