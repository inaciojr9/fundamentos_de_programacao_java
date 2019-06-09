package com.inaciojr9.fundamentos.exercicio10;

import java.util.Random;

import javax.swing.JOptionPane;

public class Sorteio {

	public static void main(String[] args) {
		
		while(true) {
			
			String numeroStr = JOptionPane.showInputDialog("Por favor, digite o numero maximo a ser sorteado:");
			if(numeroStr == null) {
				break;
			}
			Integer numero = Integer.valueOf(numeroStr);
			
			Random aleatorio = new Random();
			int numeroSorteado = aleatorio.nextInt(numero) + 1;
			
			
			JOptionPane.showMessageDialog(null, "Numero sorteado: "+numeroSorteado);
		}
		
	}

}
