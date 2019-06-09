package com.inaciojr9.fundamentos.exercicio8;

import javax.swing.JOptionPane;

public class QuantidadeDeLetras {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Por favor, digite a palavra:");
		if(palavra == null) {
			return;
		}
		
		// o metodo length() devolve a quantidade de caracteres de uma String
		int quantidadeDeLetras = palavra.length();
		
		JOptionPane.showMessageDialog(null, "Quantidade de caracteres da palavra " + palavra + ": " + quantidadeDeLetras);
	}

}
