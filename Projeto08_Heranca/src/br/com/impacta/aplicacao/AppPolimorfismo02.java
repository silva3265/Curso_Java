package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Automovel;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo02 {
		
		public static void main(String[] args) {
			
			Pessoa p1 = new Funcionario("Joel",29, Sexo.MASCULINO, "DEV", 3500 );
			
			Aluno p2 = new Aluno ("Lucas",28, Sexo.MASCULINO, 1234, new Curso (10, "C#", 40, 500)); //PODEMOS CRIAR O NEW CURSO PARA PODER INSTANCIAR OUTROS ATRIBUTOS TAMBEM
				
			
			mostrarPessoa (p1);
			mostrarPessoa (p2);
	}
		private static void mostrarPessoa (Pessoa p) {
			
			String nomeClasse = p.getClass().getSimpleName(); //getClass - pega a classe que a pessoa é  //getSimpleName - vai pegar o nome
			String resposta = p.mostrar();
			
			JOptionPane.showMessageDialog(null, "Classe: "  + nomeClasse + "\n" + resposta);
			
		}
		
}


