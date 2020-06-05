import javax.swing.JOptionPane;

public class Exer18 {

	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite número 1?");
		String v2 = JOptionPane.showInputDialog("Digite número 2?");
		int vl1 = Integer.parseInt(v1);
		int vl2 = Integer.parseInt(v2);
		String relatorio = "Maior = ";
		if (vl1 > vl2) {
			relatorio += v1;
		} else {
           if (vl2 > vl1) {
			relatorio += v2;
		} else {
			relatorio = "Iguais = "+ vl1;

		}
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
