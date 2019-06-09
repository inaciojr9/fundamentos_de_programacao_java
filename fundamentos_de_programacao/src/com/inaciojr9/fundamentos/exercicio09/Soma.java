package com.inaciojr9.fundamentos.exercicio09;

import javax.swing.JOptionPane;

public class Soma {

	public static void main(String[] args) {
		
		int soma = 0;
		
		while(true) {
			
			String numeroStr = JOptionPane.showInputDialog("Por favor, digite um numero a ser somado:");
			if(numeroStr == null) { // se o usuario clicou em cancelar
				break; // sai do while
			}
			int numero = Integer.parseInt(numeroStr);
			
			soma = soma + numero;
			
		}
		
		JOptionPane.showMessageDialog(null, "Soma: "+soma);
		
	}

}
