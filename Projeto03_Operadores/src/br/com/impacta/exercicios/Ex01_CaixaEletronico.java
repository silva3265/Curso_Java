package br.com.impacta.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01_CaixaEletronico {
	
	/*
	 * Um caixa eletronico possui cedulas de 50, 20, 10, 5
	 * 
	 * escreva o programa para solicitar ao usuario o valor do saque
	 * com base no valor que vimos
	 *
	 * 
	 * 	Escrever o programa para solicitar
	 
	 */
	public static void main(String[] args) {
		
		//solicitar o valor do saque
		
		//Scanner valorSaque = new Scanner(System.in);
		
		
		//solicitar o valor do saque
		double valor = Double.parseDouble(JOptionPane.showInputDialog("qual o valor do saque"));;
		
		
		//obter o valor como sendo inteiro
		
		int valorSaque = (int) valor; //typescript
		
		//todavariavel devemos atribuir um valor
		
		int qtd50, qtd20, qtd10, qtd5 = 0;
		
		qtd50 = valorSaque / 50; // 2notas de 50
		
		//valorSaque = valorSaque % 50;
		
		valorSaque %=50; // receber o resto e atribuir no valorSaque
		
		qtd20 = valorSaque / 20;
		
		//valorSaque = valorSaque % 20;
		
		valorSaque %=20;
		
		qtd10 = valorSaque / 10;
		
		//valorSaque = valorSaque % 10;
		
		valorSaque %=10;
		
		qtd5 = valorSaque / 5;
		
		String resposta = "Valor do saque: " + valor + 
				"\nNotas de 50: " + qtd50 +
				"\nNotas de 20: " + qtd20 +
				"\nNotas de 10: " + qtd10 +
				"\nNotas de 5: " + qtd5;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}






