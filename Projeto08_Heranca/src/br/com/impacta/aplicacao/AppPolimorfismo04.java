package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo04 {
	
public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel",29, Sexo.MASCULINO, "DEV", 3500 );//colocalos nos parametros os atributos do construtor Funcionario
		//Desejamos alterar o valor do salario no objeto
		
		Funcionario func = (Funcionario)p1; //CASTING (Funcionario) - ele ta forçando que p1 é funcionario
		func.setSalario(4000);
				
		
		
		p1 = new Aluno("Lucas",28, Sexo.MASCULINO, 1234, new Curso (10, "C#", 40, 500));
		
		//Desejamos Alterar o curso para Java
		Curso curso = new Curso (11, "Java", 100, 120.0);
		
		if (p1 instanceof Aluno) {//O instanceof em java também é conhecida como operador de comparação de tipos, isso porque compara a instância com o tipo.
			
			p1.setIdade(27);
			((Aluno) p1).setCurso(curso); 
		}
		
//		Aluno aluno = (Aluno)p1; //CASTING (Aluno)
//		aluno.setCurso (curso);
		
		
		//outra forma de realiza o typecast
//		((Aluno) p1).setCurso(curso); 
//		
//		
//				
//		JOptionPane.showMessageDialog(null, p1.mostrar());
//		
	}
	
	

}
