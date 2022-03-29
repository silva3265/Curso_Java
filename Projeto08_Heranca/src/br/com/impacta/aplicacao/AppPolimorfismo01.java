package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel",29, Sexo.MASCULINO, "DEV", 3500 );//colocalos nos parametros os atributos do construtor Funcionario
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		//QUEM EXECUTA O METODO É O OBJETO" NUNCA A VARIAVEL!
		//p1 é apenas uma variavel de referencia
		
		p1 = new Aluno ("Lucas",28, Sexo.MASCULINO, 1234, new Curso (10, "C#", 40, 500)); //PODEMOS CRIAR O NEW CURSO PARA PODER INSTANCIAR OUTROS ATRIBUTOS TAMBEM
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		

	}

}
