package com.inaciojr9.fundamentos.exercicio11;

import javax.swing.JOptionPane;

public class Substituicao {

	public static void main(String[] args) {
		
		while(true) {
			String palavra = null;
			palavra = JOptionPane.showInputDialog("Por favor, digite uma palavra que contenha a letra a:");
			if(palavra == null) {
				break;
			}
			
			if(!palavra.contains("a") && !palavra.contains("A")) { // verifica se nao contem a letra 'a' e nao contem a letra 'A'
				JOptionPane.showMessageDialog(null, "A palavra nao contem a letra a");
			}else {
				String palavraSubstituida = palavra.replace("a", "o"); // substitiu 'a' por 'o'
				String palavraSubstituida1 = palavraSubstituida.replace("A", "O");	// substitiu 'A' por 'O'
				JOptionPane.showMessageDialog(null, "Palavra substituída: "+palavraSubstituida1);
			}
				
		}
		
	}

}
