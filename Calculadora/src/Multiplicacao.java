import javax.swing.JOptionPane;

public class Multiplicacao implements Operacao{
	private int n1 , n2;
	@Override
	public void getDatos() {
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
	}

	@Override
	public void result() {
		JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+ (n1*n2));
	}
}
