package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ();
		
		pessoa.idade = 55;
		pessoa.nome = "Romulo";
		pessoa.sexo = Sexo.MASCULINO; //ENUM - enumera��o - S�o tipos de campos que consistem em um conjunto fixo de constantes

	}

}
