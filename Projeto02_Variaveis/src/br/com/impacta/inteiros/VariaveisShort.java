package br.com.impacta.inteiros;

public class VariaveisShort {
	
	public static void main(String[] args) {
		
		
		//tipo nome de variavel
		// = Atribuição "="
		
		short idade = 80; // -128 ate 127
		short idade2 = 30;
		System.out.println(idade);
		System.out.println(idade2);
		
		//somando as duas idades, e armazenando em uma terceira variavel
		short soma = (short) (idade + idade2); //typecast
		
		System.out.println("A soma das idades" + soma);
	}

	
}
