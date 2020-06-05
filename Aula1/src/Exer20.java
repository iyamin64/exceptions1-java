import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int ct = 1;
		double totais = 0;
		while (ct <= 12) {
			String salario = JOptionPane.showInputDialog("Digite o " + ct+ " salario ?");
			double valor = Double.parseDouble(salario);
			totais += valor;
			++ct;
			
		}
		double dec = totais / 12;
		JOptionPane.showMessageDialog(null, "13 salario do "+nome+"="+dec);
		System.exit(0);

	}

}
