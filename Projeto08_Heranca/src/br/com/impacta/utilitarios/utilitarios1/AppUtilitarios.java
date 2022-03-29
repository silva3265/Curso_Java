package br.com.impacta.utilitarios.utilitarios1;

import javax.swing.JOptionPane;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	
	public static void main(String[] args) {
		
		//double soma = Utilitarios.somar(12, 15.6);
		//System.out.println(soma );
		
		//System.out.println(Utilitarios.removerEspacos("Meu nome é romulo: ")); //nesse caso ele vai retirar todos os espaços
		
		System.out.println(Utilitarios.gerarEmail("Romulo", "Albuquerque"));
	}

}
