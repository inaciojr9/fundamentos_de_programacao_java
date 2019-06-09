package com.inaciojr9.fundamentos.exercicio7;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class NomeDoAtorDoSuperHeroi {

	public static void main(String[] args) {
		
		String mensagem = "Menu de Herois: \n"+
		"homem de ferro \n" +
		"capitao america \n" +
		"viuva negra \n" +
		"thor \n" +
		"hulk \n\n" +
		"Por favor, digite o heroi:";
		
		String nomeDoSuperHeroi = JOptionPane.showInputDialog(mensagem);
		if(nomeDoSuperHeroi == null) {
			return;
		}
		
		Map<String, String> herois = new HashMap<>();
		herois.put("homem de ferro", "Robert Downey Jr.");
		herois.put("capitao america", "Chris Evans");
		herois.put("viuva negra", "Scarlett Johansson");
		herois.put("thor", "Chris Hemsworth");
		herois.put("hulk", "Mark Ruffalo");
		
		String ator = herois.get(nomeDoSuperHeroi);
		if(ator == null) {
			JOptionPane.showMessageDialog(null,  "Heroi nao encontrado");
		}else {
			JOptionPane.showMessageDialog(null,  "Quem interpreta "+nomeDoSuperHeroi + ": "+ator);
		}
		
	}

}
