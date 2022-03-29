package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	
	public static void main(String[] args) {
		
		//declarando uma variavel
		
		//tipo nome
		
		Automovel auto = new Automovel (); //Variavel alto
		auto.lerDados("honda", "civic", 2019, "EBB1234");
		
		String texto = auto.mostrar();
		
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);
		
		//Automovel.PAIS_ORIGEM = "ARGENTINA";
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		//Automovel.PAIS_ORIGEM = "Brasil";
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
		
		
		
	}

}
