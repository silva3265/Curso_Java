package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex03_SenhaAlfanumerica {
	
	public static void main(String[] args) {
		
		/*
		 * ESTE PROGRAMA DEVE GERAL UMA SENHA COM
		 * 6 DIGITOS, ONDE CADA DIGITO É UM NUMERO
		 * ENTRE 0 E 9. A SENHA FINAL É UMA STRING
		 * 
		 * 
		 * */
		
		String senha = "";
		
		int valor = (int)(Math.random() * 10);
		 
		for (int i = 1; i < 6; i++) {
			
			int numeroatual = (int)(Math.random() *10 );
			System.out.println("numero atual: " + numeroatual);
			
		}
		JOptionPane.showMessageDialog(null, senha);
	}

}
