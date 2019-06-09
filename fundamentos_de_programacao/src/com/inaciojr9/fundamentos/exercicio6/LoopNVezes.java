package com.inaciojr9.fundamentos.exercicio6;

import javax.swing.JOptionPane;

public class LoopNVezes {

	public static void main(String[] args) {
		
		String numeroDeVezesStr = JOptionPane.showInputDialog("Por favor, digite o numero de vezes:");
		if(numeroDeVezesStr == null) {
			return;
		}
		Integer numeroDeVezes = Integer.valueOf(numeroDeVezesStr);
		
		for(int i = 0; i < numeroDeVezes; i++) {
			System.out.println("Linguagem Java");
		}
		
	}

}
