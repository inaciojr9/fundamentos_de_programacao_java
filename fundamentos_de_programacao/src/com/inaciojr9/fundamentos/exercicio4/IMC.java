package com.inaciojr9.fundamentos.exercicio4;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String pesoStr = JOptionPane.showInputDialog("Por favor, digite o peso:");
		if(pesoStr == null) {
			return;
		}
		Float peso = Float.valueOf(pesoStr);
		
		String alturaStr = JOptionPane.showInputDialog("Por favor, digite a altura:");
		if(alturaStr == null) {
			return;
		}
		Float altura = Float.valueOf(alturaStr);
		
		float imc = (peso/(altura*altura));
		
		JOptionPane.showMessageDialog(null, "IMC: "+imc);
		
		String situacao = null;
		if(imc < 17) {
			situacao = "muito abaixo do pesso";
		}else if(imc >= 17 && imc < 18.5) {
			situacao = "abaixo do peso";
		}else if(imc >= 18.5 && imc < 25) {
			situacao = "peso normal";
		}else if(imc >= 25 && imc < 30) {
			situacao = "acima do peso";
		}else if(imc >= 30 && imc < 35) {
			situacao = "obesidade I";
		}else if(imc >= 35 && imc < 40) {
			situacao = "obesidade II (severa)";
		}else if(imc >= 40) {
			situacao = "obesidade III (mórbida)";
		}
		JOptionPane.showMessageDialog(null, "Situacao: "+situacao);
		
	}

}
