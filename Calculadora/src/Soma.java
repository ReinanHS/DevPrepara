import javax.swing.JOptionPane;

public class Soma implements Operacao {
	int n1;
	int n2;
	
	@Override
	public void getDatos() {
		// TODO Auto-generated method stub
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para a soma: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número para o soma: "));
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"A soma é = " + (n1+n2));
	}

}