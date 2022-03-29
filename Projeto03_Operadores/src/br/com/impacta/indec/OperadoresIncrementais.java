package br.com.impacta.indec;

public class OperadoresIncrementais {

	public static void main(String[] args) {
		
		int numero = 10;
		System.out.println("numero: " + numero); //10
		
		numero++;
		
		System.out.println("numero: " + numero); //11
		
		++numero;
		
		System.out.println("numero: " + numero); //12
		
		//Instrução (;)
		//Opraeção = Operadores como --, +, ++
		
		int x = numero ++;
		
		System.out.println();
		System.out.println("X: " + x); //12
		System.out.println("numero: " + numero); //13
		
		x = ++numero;
		
		System.out.println("x: " + x);
	}

}
