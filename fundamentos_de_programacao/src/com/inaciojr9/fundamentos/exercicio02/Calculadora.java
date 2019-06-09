package com.inaciojr9.fundamentos.exercicio02;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		while(true) {
			
			String numeroStr1 = JOptionPane.showInputDialog("Por favor, digite o primeiro numero:");
			if(numeroStr1 == null) {
				break;
			}
			Integer numero1 = Integer.valueOf(numeroStr1);
			
			String numeroStr2 = JOptionPane.showInputDialog("Por favor, digite o segundo numero:");
			if(numeroStr2 == null) {
				break;
			}
			Integer numero2 = Integer.valueOf(numeroStr2);
			
			double resultado = 0;
			String operacao = JOptionPane.showInputDialog("Por favor, digite a operacao:");
			if(operacao == null) {
				break;
			}
			
			if(operacao.equals("+")) {
				resultado = numero1 + numero2;
				
			}else if (operacao.equals("-")) {
				resultado = numero1 - numero2;
				
			}else if (operacao.equals("x")) {
				resultado = numero1 * numero2;
				
			}else if (operacao.equals("/")) {
				resultado = numero1 / numero2;
				
			}else {
				JOptionPane.showMessageDialog(null, "Operacao invalida: "+operacao);
				break;
			}

			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
		}
		
	}

}
