package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto ();
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo: "));
		String categoria = JOptionPane.showInputDialog("Informe a categoria: ");
		String descricao = JOptionPane.showInputDialog("Informe a descrição: ");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));
		
		
		produto.setCodigo(100);
		produto.setCategoria("Limpeza");
		produto.setDescricao("deseinfetante");
		produto.setPreco(35.0);
		
		
		System.out.println(produto.mostrar());//podemos chamar pelo System.out, ou
		JOptionPane.showMessageDialog(null, produto.mostrar());//podemos chamar pelo JOptionPane
		
		

	}

}
