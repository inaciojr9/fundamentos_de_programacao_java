package com.inaciojr9.fundamentos.exercicio3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("Numero invalido de argumentos. O sistema deve receber apenas o primeiro numero como argumento.");
			return;
		}
		
		int numero1 = Integer.valueOf(args[0]);
		
		String numeroStr2 = JOptionPane.showInputDialog("Por favor, digite o segundo numero:");
		if(numeroStr2 == null) {
			return;
		}
		Integer numero2 = Integer.valueOf(numeroStr2);
		
		scanner = new Scanner(System.in);
		System.out.print("Por favor, entre com o terceiro numero: ");
		int numero3 = scanner.nextInt();
		
		int resultado = numero1 + numero2 + numero3;
		
		System.out.println("Resultado: "+resultado);
		
		if(resultado > 10) {
			System.out.println("Resultado maior que 10");
		}else if(resultado == 10) {
			System.out.println("Resultado igual a 10");
		}else {
			System.out.println("Resultado menor que 10");
		}
		
	}

}
