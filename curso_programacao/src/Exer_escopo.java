
public class Exer_escopo {

	public static void main(String[] args) {
		double price = 400;
		double discount; // variaval não inicializada
		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0; // garante que a variavel seja inicializada
		}

	}

}
