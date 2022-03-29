package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	
	private int matricula;
	private Curso curso; //Curso é um Objeto, ai vai puxar os dados da classe Curso
	
	
	public Aluno() {//ESSE CONSTRUTOR É PADRAO
		
	}
	
	public Aluno (String nome, int idade, Sexo sexo, int matricula, Curso curso) {
		super (nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
	
	public String mostrar() {
		
		return super.mostrar()  +"\nMaricula: " + 
		this.getMatricula() +
		
		((this.getCurso() != null) ?  "\nNenhum curso Atribuido" :
			"\n\nDADOS DO CURSO: \n\n " + this.getCurso().mostrar());
		
	}

	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	

}
