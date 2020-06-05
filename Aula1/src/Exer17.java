import javax.swing.JOptionPane;

public class Exer17 {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Qual a sua idade? ");
		int vl = Integer.parseInt(idade);
		String Relatorio = "";
		if (vl >= 18) {
			Relatorio = "Vc já pode tirar carteira";
		} else {
			Relatorio = "Vc não pode tirar carteira";
		}
		JOptionPane.showMessageDialog(null, Relatorio);
		System.exit(0);
	}

}
