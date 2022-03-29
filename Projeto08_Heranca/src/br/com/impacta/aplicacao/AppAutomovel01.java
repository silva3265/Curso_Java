package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	
	public static void main(String[] args) {
		
		Automovel auto = new Automovel("honda", "Civic", 2020); 
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		
		Automovel auto02 = new Automovel("Fiat", "Palio", 2019);
		JOptionPane.showMessageDialog(null, auto02.mostrar());
		
		/*Automovel auto03 = new Automovel("BMW", "X6", 2022, "HBB1254");
		JOptionPane.showMessageDialog(null, auto03.mostrar());*/

	}

}
