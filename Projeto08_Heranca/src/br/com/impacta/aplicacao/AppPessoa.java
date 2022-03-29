package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ();
		
		pessoa.setIdade (55);
		pessoa.setNome ("Romulo");
		pessoa.setSexo (Sexo.MASCULINO); //ENUM - enumeração - São tipos de campos que consistem em um conjunto fixo de constantes
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
		
		
		//INSTANCIA DA CLASSE FUNCIONARIO
		
		Funcionario funcionario = new Funcionario ();
		
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("vendedor");
		funcionario.setSalario(5000);
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Joao");
		aluno.setIdade(25);
		aluno.setSexo(Sexo.MASCULINO);
		aluno.setMatricula(12345);

		
//		Curso novoCurso = new novoCurso();
//		
//		novoCurso.setCodigo (222);
//		novoCurso.setDescricao("Java Programmer");
//		novoCurso.setCargaHoraria (100);
//		novoCurso.setPreco (1000);
		
		
		//chama o construtor do curso, depois cria o objeto CURSO e depois de criado atribui ao aluno
		aluno.setCurso(new Curso (222,"java programmer", 100, 1000));
		JOptionPane.showMessageDialog(null, aluno.mostrar());
		
	}

}
