package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

//EXTENDS = HERANCA (SUBCLASSE DE PESSOA)
public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;
	
	public Funcionario () {
		super();
	}	
	
	
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		
		super(nome, idade, sexo);//AQUI O SUPER PUXOU (NOME, IDADE, SEXO) DA SUPECLASSE PESSOA
		this.setCargo (cargo); // COLOCAMOS EM PARENTESES PARA MANTER AS BOAS PRATICAS
		this.setSalario(salario);
		
	}
		@Override //(Opcional)mais Garante a Sobreescrita do Metodo
		public String mostrar() { //Criar com o mesmo nome
			
			return super.mostrar() + "\nCargo: " + this.getCargo() + "\nSalario: " + this.getSalario();
		}
		
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double slaario) {
		this.salario = slaario;
	}

	
	

}
