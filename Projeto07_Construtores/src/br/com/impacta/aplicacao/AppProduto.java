package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
	
		while (true) {
			String categoria = JOptionPane.showInputDialog("Informe a categoria: ");
			String descricao = JOptionPane.showInputDialog("Informe a descrição: ");
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
			Produto celular = new Produto(categoria, categoria, preco);
			System.out.println(celular.mostrar());
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao = JOptionPane.showConfirmDialog(null, "deseja confirmar", "Vonfirmação", JOptionPane.YES_NO_OPTION);
			
				if (opcao == JOptionPane.NO_OPTION) { //é uma confirmação, se clicar em si ele volta no começo da condição, se nao, ele para no break!
					break;
				}
			
		}
		
		/*//REAPROVEITANDO O CODIGO
		categoria = JOptionPane.showInputDialog("Informe a categoria: "); //REAPROVEITANDO A VARIAVEL
		descricao = JOptionPane.showInputDialog("Informe a descrição: ");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
		
		celular = new Produto (categoria,  categoria, preco);

		
		
		System.out.println(celular.mostrar());
		JOptionPane.showMessageDialog(null, celular.mostrar());*/
		

	}
	

}
