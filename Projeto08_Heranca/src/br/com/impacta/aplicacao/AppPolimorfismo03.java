package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;
import br.com.impacta.classes.ProdutoImportado;

public class AppPolimorfismo03 {
	public static void main(String[] args) {
		
		Produto prod = new Produto ("Alimenta��o","Batata frita", 50);
		Produto prod2 = new ProdutoImportado("Transportre", "Bicicleta", 2500, 50);
		
		//Desejamos alterar a taxa de importa��o para 7.0%
		
		if (prod2 instanceof ProdutoImportado) {
			((ProdutoImportado) prod2).setTaxaImportacao(7.0);
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, prod.mostrar());
		JOptionPane.showMessageDialog(null, prod2.mostrar());
	}
	
	

}
