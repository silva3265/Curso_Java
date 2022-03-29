package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
	
	public static void main(String[] args) {
		
	
	
	/*
	 * NESSE PROGRAMA, O USUARIO FORNECE UMA CERTA QUANTIDADE DE NUMEROS.
	 * A ENTRADA DE DADOS TERMINA QUNDI O USUARIO DIGITAR O 0
	 * 
	 * cada numero informado é mostrado na tela
	 * 
	 * se o usuario digitar um numero negativo, esta é ignorado
	 * 
	 * 
	 * no final
	 *
	 * */
	
	
	int quantidade = 0;
	int soma = 0;
	
	
	
	
	while (true) { // SE DEIXAR DESSA MANEIRA VAI SER UM LOOP INFINITO
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero")); //pergunta para ao usuario
		
		if (numero == 0) {
			break; //interrompe a estrutura de repetição
		}
		
		if (numero < 0) {
			continue; //continuar para prox instruçao (voltar para o inicio)
		}
		
		soma += numero;
		quantidade++;
	}
	
		//return - sai do metodo
		
	
	}
	}


