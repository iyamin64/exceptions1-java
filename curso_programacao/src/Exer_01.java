import java.util.Locale;
import java.util.Scanner;

public class Exer_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int entrada1 = sc.nextInt();
		int entrada2 = sc.nextInt();

		int saida1 = entrada1 + entrada2;

		System.out.println("SOMA = " + saida1);
		sc.close();
	}

}
