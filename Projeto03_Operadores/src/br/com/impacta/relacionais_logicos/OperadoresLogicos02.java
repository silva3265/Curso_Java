package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos02 {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		//A PRIMEIRA OPERA��O � TRUE, O CODIGO VAI CONTINUAR SEM COMPARAR OUTRAS CONDI��ES
		
		//||
		
		boolean b1 = (a >= 10) || (--b > 0);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("b1 = " + b1);
	}

}
