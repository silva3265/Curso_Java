package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {

	public static void main(String[] args) {
		
		/*
		 * UM FUNCIONARIO TERA UM VALOR DE 10% DE DESCONTO
		 * SE O SALARIO BRUTO FOR SUPERIOR DE 5000 REIAS.
		 * O DESCONTO SERA CALCULADO SOBRE A DIFERENÇA ENTRE O VALOR DO SALARIO  E O VALOR BASE DE 500
		 * 
		 
		 * */
		
		double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario: "));
		
		double desconto = 0;
		
		if (salarioBruto > 5000) {
			
			desconto = (salarioBruto - 50000) * 10 / 100;
			
		}
		
		String resposta = "salario bruto" + salarioBruto 
				+ "\ndesconto: " + desconto 
				+ "\nSalario Liquido: " + (salarioBruto - desconto);
		
		JOptionPane.showConfirmDialog(null, resposta);
		
		
		
		
		
		
	}

}
