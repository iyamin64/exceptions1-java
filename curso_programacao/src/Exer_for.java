import java.util.Scanner;

public class Exer_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//      Contagem crescente
//		for (int i=0; i<5; i++) {
//			System.out.println("Valor de i: " + i);
//			}
//			
//		//Contagem regressiva
//		for (int i=4; i>=0; i--) {
//			System.out.println("Valor de i: " + i);
//		}
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		sc.close();
	}

}
