package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	
	public static void main(String[] args) {
		
		int quantidadePessoas = Integer.parseInt(JOptionPane.showInputDialog("quantas pessoas estao na sala: "));
		
		int maior = 0;
		int posicao = 0;
		 
		for (int i = 1; i <= quantidadePessoas; i++) {
			
			System.out.println(quantidadePessoas);
			
			String pergunta = "pessoa: " + i +
					"\n qual a idade da pessoa " + i + "?";
			
			//idade vai receber um novo valor para cada pessoa
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));
			
			
			//System.out.println("a idade atual: " + idade);
			
			if (idade > maior) { //Atualizamos o nivel da variavel de fora
				maior = idade;  //Atualizamos o nivel da variavel de fora
				posicao = i;//posição atual
			}
			
		String resposta = "maior idade: " + maior + "\n pessoa: " + posicao;
		
		JOptionPane.showMessageDialog(null, resposta);
		
			
			
			
		}
		
		
		
	}

}
