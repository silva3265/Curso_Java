package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	
	public static void main(String[] args) {
		
		/*
		 * NESSE PROGRAMA, O USUARIO FORNECE UMA CERTA QUANTIDADE DE NUMEROS.
		 * A ENTRADA DE DADOS TERMINA QUNDI O USUARIO DIGITAR O 0
		 * 
		 * NO FINAL, O PROGRAMA DEVE MOSTRAR A SOMA E
		 * A QUANTIDADE DE NUMEROS INFORMADOS.
		 *
		 * */
		
		int quantidade = 0;
		int soma = 0;
		
		
		
		while (true) { // SE DEIXAR DESSA MANEIRA VAI SER UM LOOP INFINITO
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero"));
			
			if (numero == 0) {
				break; //interrompe a estrutura de repetição
			}
			
			soma+=numero;
			quantidade++;
		}
		
	
		
		
	}

}
