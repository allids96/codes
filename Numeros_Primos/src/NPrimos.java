import javax.swing.JOptionPane;

public class NPrimos {
	
	int numeros;
	

	
	
	
	public void Status() {
		
		
	}
	
	
	
	public NPrimos( int numeroProcurado) {
		
		this.numeros = numeroProcurado;
	}
	
	public int getNumeros() {
		return numeros;
	}







	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}




	public void numeroPrimo ( ) {
		
		if((this.getNumeros() % 2 == 0 && this.getNumeros( ) != 2) ) {
		
			JOptionPane.showMessageDialog(null, "Não é um número primo");
			
		}
			
		else if (this.getNumeros() < 2 ) {
				
				JOptionPane.showMessageDialog(null, "Não é um número primo");
			}
			else {
				JOptionPane.showMessageDialog(null, "Número primo");
			}
			
			
		}
		
		
	   /* Outra forma utilizando o for
	    * 
	    *  
	    *  int resultado=0, i;
		
		
		for( i = 2; i <= this.getNumeros(); i++) {
			
			if( this.getNumeros() % i == 0) {
			
		     resultado ++;	
			}

		}
		if ( resultado == 1) {
			
			JOptionPane.showMessageDialog(null, "O número " + this.getNumeros() + " é primo");
			
		}
		else {
			
			JOptionPane.showMessageDialog(null, "O número " + this.getNumeros() + " não é primo");
			
		}*/
		 
		
		
		
		
	
	
	
	

}
