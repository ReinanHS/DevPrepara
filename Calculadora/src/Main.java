import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Soma e Multiplica��o
		
		//Soma somas = new Soma();
		//Multiplicacao multipicacoes = new Multiplicacao();
		
		String tela = JOptionPane.showInputDialog(null ,"Qual o tipo da opera��o?\n - 1 Para Soma\n - 2 Para Multipica��o");
		
		
		if(Integer.parseInt(tela) == 1) {
			
			Soma somas = new Soma();
			somas.getDatos();
			somas.result();
			
		}else {

			Multiplicacao mult = new Multiplicacao();
			mult.getDatos();
			mult.result();
		}
		
	}

}
