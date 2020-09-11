import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		String ano;
		ano = JOptionPane.showInputDialog(null, "Informe o ano que deseja verificar");
		int anoBuscado = Integer.parseInt(ano);
	
		Ano num = new Ano(anoBuscado);
		
		System.out.print(num.validaAno(num.getAno()));
		

	}

}
