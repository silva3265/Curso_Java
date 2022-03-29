package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel02 {
	
	public static void main(String[] args) {
		
		Automovel auto01 = new Automovel(); //1
		auto01.lerDados("Honda", "CIVIC", 2021, "EBX1234");
		Automovel auto02 = auto01; //2
		auto01 = null;
		
		auto02.setAno(2022);
		//JOptionPane.showMessageDialog(null, auto01.mostrar());
		
	
		
	}

}
