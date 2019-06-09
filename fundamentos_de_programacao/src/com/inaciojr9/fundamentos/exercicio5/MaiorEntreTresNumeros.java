package com.inaciojr9.fundamentos.exercicio5;

import javax.swing.JOptionPane;

public class MaiorEntreTresNumeros {

	public static void main(String[] args) {
		
		String numero1Str = JOptionPane.showInputDialog("Por favor, digite o primeiro numero:");
		if(numero1Str == null) {
			return;
		}
		Integer numero1 = Integer.valueOf(numero1Str);
		
		String numero2Str = JOptionPane.showInputDialog("Por favor, digite o segundo numero:");
		if(numero2Str == null) {
			return;
		}
		Integer numero2 = Integer.valueOf(numero2Str);
		
		String numero3Str = JOptionPane.showInputDialog("Por favor, digite o terceiro numero:");
		if(numero3Str == null) {
			return;
		}
		Integer numero3 = Integer.valueOf(numero3Str);
		
		int numeroMaior = 0;
		if(numero1 > numero2) {
			if (numero1 > numero3) {
				numeroMaior = numero1;
			}else {
				numeroMaior = numero3;
			}
		}else {
			if (numero2 > numero3) {
				numeroMaior = numero2;
			}else {
				numeroMaior = numero3;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior numero: "+numeroMaior);
		
	}

}
