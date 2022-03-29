package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	


	private double taxaImportacao;
	
	
	public ProdutoImportado(String categoria, String descricao, double preco) {
		super("categoria", "descricao", preco);//super, representa o construtor da superclasse
	}	
		//SOBRECARGA
	public ProdutoImportado (String categoria, String descricao, double preco, double taxaImportacao)	{
		this("categoria", "descricao", preco); //CHAMA O CONSTRUTOR DE CIMA, *O THIS COM OS ATRIBUTOS VEM PRIMEIRO E DEPOIS ADCIONAMOS O QUE FALTA COM SET
												//THIS COMUNICACAO COM A SOBRECARGA DO CONSTRUTOR "THIS ()"
		
		this.setTaxaImportacao(taxaImportacao);//VALOR DO ATRIBUTO DA CLASSE
												//ACIONANDO O METODO setTaxaImportacao
	}


	public double getTaxaImportacao() {
		return taxaImportacao;
	}


	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public String mostrar() {
		
		return super.mostrar() + "\nTaxa de Importação: " + this.getTaxaImportacao() ;
	}
	


}
