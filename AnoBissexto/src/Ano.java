import javax.swing.JOptionPane;

public class Ano {
	
	public int ano;
	public boolean ano_bissexto;
	
	
	public Ano(int anoBuscado) {
		
		
		this.setAno(anoBuscado);
		
	}
	
	public void setAno(int ano) {
		
		this.ano = ano;
		
	}
	
	public int getAno() {
		
		return ano;
		
	}
	
	public void isAno_bissexto() {
		
		this.ano_bissexto = false;
		
	}
	
	public boolean getAno_bissexto() {
		
	return false;
		
	}
	
	
	public boolean validaAno(int ano) {
		
		boolean anoBissexto;
		
		if ( this.getAno() % 400 ==0 ) {
			
			JOptionPane.showMessageDialog(null,"Ano bissexto");
			
			
		}
		
		
		else if( this.getAno() % 4 ==0 && this.getAno() % 100 !=0 ) {
			
			
			JOptionPane.showMessageDialog(null, "Ano bissexto");
			
		}
		
		
		else {
			
			JOptionPane.showMessageDialog(null, "O ano informado não é bissexto");
		}
		
		return anoBissexto = true;
	}
	
	
	
	
	
	
	

}
