package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produto;

public class AppProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto ();
		
		produto.codigo = 55;
		produto.descricao = "Desifetante";
		produto.categoria = "Limpeza";
		produto.preco = 25.90;
		
		System.out.println(produto.codigo);
		System.out.println(produto.descricao);
		System.out.println(produto.categoria);
		System.out.println(produto.preco);
	

	}

}
