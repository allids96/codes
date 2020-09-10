import javax.swing.JOptionPane;
import java.io.*;
public class Numeros {

	public static void main(String[] args) {
		
	

		int i=0, j;
		String numeros;
		int aux;	
		int n = i+1;
		boolean encontrou;
		
		
		//Solicitar ao usuário o tamanho do array
		numeros = JOptionPane.showInputDialog("Digite a quantidade de dados que deseja armazenar");
		int qtde = Integer.parseInt(numeros);
		int vet[] = new int[qtde];
		
		//
		JOptionPane.showMessageDialog(null, "Vetor de " + vet.length + " elementos");
		
		
		//Solicitar os números que irão compor o array de n posições
		
		for ( i =0; i < vet.length; i++) {
		
			numeros = JOptionPane.showInputDialog("Informe os números " + n);
			vet[i] = Integer.parseInt(numeros);	
		}
		
		//ordenar os valores do array -- bubble sort
		
		for(i= 0; i < vet.length; i++) {
			
			for ( j = vet.length-1; j >i; j--) {
				
				if( vet[j-1] > vet[j]) {
					
					aux = vet [j-1];
					vet[j-1] = vet[j];
					vet[j] = aux;	
				}
			}
			
			
		}
		for(i= 0; i < vet.length; i++) {
			
			JOptionPane.showMessageDialog(null, "Os números ordenados são: "  +
					vet[i]);
			
			}
		
		// Solicitar o número que será buscado
		
		numeros = JOptionPane.showInputDialog("Digite o número que deseja encontrar");
		int searchNum = Integer.parseInt(numeros);
		
	   encontrou =  buscaBinaria(searchNum, vet);
	     
	   if (encontrou)  {
		   
		   JOptionPane.showMessageDialog(null, "Número " + searchNum + " encontrado");
		    
	   }
	   else 
	   {
		   JOptionPane.showMessageDialog(null, " Número não localizado");
	   }
	   
	   
	   
		
	}
		// Método -- busca binária
	public static boolean buscaBinaria(int searchNum, int[] vet) {
		
		int inicio, fim, meio;
		
		
		inicio =0;
		fim = vet.length-1;
		
		for (int  i = inicio; i <= fim; i++) {
			
		meio = (inicio + fim) /2;
		
		if(searchNum == vet[meio]) {
			
			return  true;
		}
		
		if (searchNum < vet[meio]) {
			
			fim = meio -1;
		}
		
		else {
			
			inicio = meio + 1;
			
		}
		
		}
		
		
		return false;

		
		
	}

}

