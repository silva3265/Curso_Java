package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos03 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		
		//&&s
		
		boolean b1 = (a >= 10) && (--b > 0);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("b1 = " + b1);

	}

}
