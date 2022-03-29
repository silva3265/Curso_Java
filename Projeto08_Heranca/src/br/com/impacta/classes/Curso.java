package br.com.impacta.classes;

public class Curso {//SUPERCLASSE DE CURSO � OBJECT
	
	public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setPreco(preco);
	}
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
	
	
	public String mostrar () {
		
		return "\nCodigo: " + this.getCodigo() + "\nCDescricao: " + this.getDescricao() + 
				"\nCargaHoraria: " + this.getCargaHoraria() + "\nPreco: " + this.getPreco();
				
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
