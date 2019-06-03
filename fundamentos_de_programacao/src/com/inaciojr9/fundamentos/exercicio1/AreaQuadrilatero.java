package com.inaciojr9.fundamentos.exercicio1;

import javax.swing.JOptionPane;

public class AreaQuadrilatero {

	public static void main(String[] args) {
		
		while(true) {
			String baseStr = JOptionPane.showInputDialog("Por favor, digite a medida da base:");
			if(baseStr == null) {
				break;
			}
			Integer base = Integer.valueOf(baseStr);
			
			String alturaStr = JOptionPane.showInputDialog("Por favor, digite a medida da altura:");
			if(alturaStr == null) {
				break;
			}
			Integer altura = Integer.valueOf(alturaStr);
			
			int area = base * altura;
			JOptionPane.showMessageDialog(null, "Area: "+area);
			
			if(base == altura) {
				JOptionPane.showMessageDialog(null, "Quadrado");
			}else {
				JOptionPane.showMessageDialog(null, "Retangulo");
			}
		}
		
	}

}
