package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {

	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("qual a sua idade: "));
		
		//if = Condi��o SE
		
		if (idade < 18) { //SE A CONFI��O FOR VERDADEIRA
			System.out.println("menor de idade");
		}
		else {//senao
			System.out.println("maior de idade");
			System.out.println("idade fornecuda: " + idade);	
		
		}
	}

}
