package br.com.impacta.inteiros;

public class VariaveisByte {
	
	public static void main(String[] args) {
		
		
		//tipo nome de variavel
		// = Atribuição "="
		
		byte idade = 80; // -128 ate 127
		byte idade2 = 30;
		System.out.println(idade);
		System.out.println(idade2);
		
		//somando as duas idades, e armazenando em uma terceira variavel
		byte soma = (byte) (idade + idade2); //typecast
		
		System.out.println("A soma das idades" + soma);
	}

}
