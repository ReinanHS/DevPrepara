import javax.swing.JOptionPane;

public class Multiplicacao implements Operacao{
	private int n1 , n2;
	@Override
	public void getDatos() {
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
	}

	@Override
	public void result() {
		JOptionPane.showMessageDialog(null, "O resultado da multiplica��o �: "+ (n1*n2));
	}
}
