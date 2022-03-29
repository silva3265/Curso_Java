package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
	
		while (true) {
			String categoria = JOptionPane.showInputDialog("Informe a categoria: ");
			String descricao = JOptionPane.showInputDialog("Informe a descri��o: ");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o: "));
			Produto celular = new Produto(categoria, categoria, preco);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao = JOptionPane.showConfirmDialog(null, "deseja confirmar", "Vonfirma��o", JOptionPane.YES_NO_OPTION);
			
				if (opcao == JOptionPane.NO_OPTION) { //� uma confirma��o, se clicar em si ele volta no come�o da condi��o, se nao, ele para no break!
					break;
				}
			
		}
		
		/*//REAPROVEITANDO O CODIGO
		categoria = JOptionPane.showInputDialog("Informe a categoria: "); //REAPROVEITANDO A VARIAVEL
		descricao = JOptionPane.showInputDialog("Informe a descri��o: ");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o: "));
		
		celular = new Produto (categoria,  categoria, preco);

		
		
		System.out.println(celular.mostrar());
		JOptionPane.showMessageDialog(null, celular.mostrar());*/
		

	}
	

}
