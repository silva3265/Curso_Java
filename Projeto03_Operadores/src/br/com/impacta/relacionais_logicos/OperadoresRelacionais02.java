package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		boolean b1 = (a < 10) && (b % 2 == 0); //AND (&&) - SÓ VAI SER VERDADEIRO SE TODOS FOREM VERDADEIROS
		
		boolean b2 = (a == 10) || (a == b) || (b > 20); //OU (||) - SÓ VAI SER VERDADEIRO SE SOMENTE UM FOR VERDADEIRO
		
		System.out.println("n2: " + b2);
		
		// || VAI COMPARAR ATÉ TER UM TRUE
		// | VAI COMPARAR TODAS AS CONDIÇÕES MESMO QUE TENHA TRUE
		
		// && VAI COMPARAR ATE TER UM FALSE
		
		// & VAI COMPARAR TODAS AS CONDIÇÕES MESMO QUE TENHA FALSE
	}

}
