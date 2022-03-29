package br.com.impacta.classes;

public class Produto {
	
	
	//Atributos
	private final int codigo;//FINAL PQ NAO VAI MUDAR 
	private String descricao;
	private String categoria;
	private double preco;
	
	private static int contador = 1;

	public Produto(String descricao, String categoria, double preco) {
		this.codigo = contador++;
		this.descricao = (descricao);
		this.categoria = (categoria);
		this.preco = (preco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	//public void setCodigo(int codigo) { //NAO PODEMOS TER SET EM UMA VARIAVEL "FINAL"
		//this.codigo = codigo;
	//}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//metodo mostrar () - essda String retorna todos os dados do objeto
	
	public String mostrar() {
	
		return "Código: " + this.getCodigo() + //podemos usar o return direto
				"\nDescrição: " + this.getDescricao() + 
				"\nCategoria: " + this.getCategoria() + 
				"\nPreço: " + this.getPreco();
		
	}

}
