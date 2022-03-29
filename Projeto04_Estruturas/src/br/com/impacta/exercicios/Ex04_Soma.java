package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	
	public static void main(String[] args) {
		
		//perguntar para o usuario quantos numeros ele deseja
		
		//quantidade devera ser armazenada em uma variavel
		

		
		int numeros = Integer.parseInt(JOptionPane.showInputDialog("quantas numeros voce deseja: ")); //pergunta para ao usuario
		
		System.out.println(numeros);
		//perguntar para o usuario quantos irmaos ele possui
		//armazenar esse valor em uma variavel chamada irmaos
		
		int irmaos = Integer.parseInt(JOptionPane.showInputDialog("quantos irmaos voce tem? "));
		
		System.out.println(irmaos);
		
		//perguntar em qual cidade ele mora e armazenar em
		//uma variavel chamada cidade.
		
		String cidades = (JOptionPane.showInputDialog("qual cidade voce mora? "));
		
		System.out.println(cidades);
		//perguntar qual é o slaario, incluindo os centavos.
		//armazenar em uma variavel chamada salario
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("qual é o seu salario? "));
		
		System.out.println(salario);
		//declarar uma variavel do tipo String chamada Status.
		
		String status;
		
		
		//se o salario informado for maior que R$: 6.000.00,
		//esta variavel deve armazenar: "vc esta acima da media."
		
		if (salario > 6000) {
			
			status = "vc esta acima da media!!";
			
			System.out.println(status);
		}
		// caso contrario, a variavel deve armazenar: 
			//vc esta dentro da média
		
		else {
			status = "vc esta dentro da média!!";
			
			System.out.println(status);
		}
		
	}

}
