package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex02_Ingressos {

	public static void main(String[] args) {
		
		/*
		 * EM UM CLUBE, O VALOR DO INGRESSO É COBRADO D ACORDO
		 * COM A IDADE DO PARTICIPANTE
		 * 
		 * - SE A IDADE FOR MENOR QUE 18: R$: 20,00
		 * - ENTRE 18 E 59 ANOS: R$ 30,00
		 * - ACIMA DE 59 ANOS: R$: 15,00
		 * 
		 * COM BASE NESTAS INFORMAÇÕES, ESCREVA O PROGRAMA QUE
		 * SOLICITE A IDADE AO USUARIO, EM SEGUIDA APRESENTE: 
		 * 
		 * - A IDADE
		 * - O VALOR DO INGRESSO
		 * 
		 */
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(""));
		
		double ingresso; //nao nescessariamente precisamos declarar a variavel de cara, podemos declarar ela no decorrer do nosso codigo
		
		if (idade < 18) {
			ingresso = 20;
			
		}else if (idade > 59) {
			ingresso = 15;
			
		}else{
			ingresso = 30;
		}
		
		String resposta = "idade" + idade +
				"\nValor Igresso: " + ingresso;
		
		JOptionPane.showMessageDialog(null, resposta);
		

	}

}
