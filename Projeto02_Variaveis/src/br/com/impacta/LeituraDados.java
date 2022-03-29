package br.com.impacta;

import javax.swing.JOptionPane;

public class LeituraDados {

	public static void main(String[] args) {
		
		//obter a idade do usuario
		int idade = Integer.parseInt(JOptionPane.showInputDialog("qual é a idade:  ")); //Integer.parseInt - vai converter o qye esta dentro do ()
		
		String usuario = JOptionPane.showInputDialog("qual é o seu nome: ");
		
		//Obtera altura
		double altura = Double.parseDouble(JOptionPane.showInputDialog("qual é a sua altura:  "));
		
		JOptionPane.showMessageDialog(null, "Seu nome é: " + usuario);
		JOptionPane.showMessageDialog(null, "Sua idade: " + idade);
		JOptionPane.showMessageDialog(null, "Sua altura é: " + altura);
		
		//Gerando uma resposta unificada
		
		String resposta = "seu nome: " + usuario +  "\nSua idade: " + "\nSua Altura: " + altura; 
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
		

	}

}
