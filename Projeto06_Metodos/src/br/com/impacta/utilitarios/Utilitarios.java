package br.com.impacta.utilitarios;

public class Utilitarios {
	
		//STATIC - Dispensa o uso do objeto, e não ocupa espaço na memoriua HEAP
	
		//STATIC nao precisa de nenhum objeto para ser executado
		
		//pelo fato de ser static o this não funciona
	
		
		public static double somar (double x, double y) {
			
			return x + y;
		}
		
		
		//Escreva um metodo que receba como parametro um texto
				// e retorne este texto sem espacos
				
		public static String removerEspacos (String texto) {
					
					
		//trocar		  //(old)Antigo //(new)novo	   //ele vai subistituir o "antigo" pelo o "novo"
			return texto.replace(" ", "");
								
		}
		
		//Escrever um metodo que receba como parametro um nome e um
		//Sobrenome e retorrne email no formato: nome.sobrenome@impacta.com.br
		
		public static String gerarEmail (String nome, String sobrenome) {
			
			String email = nome + "."  + sobrenome + "@impacta.com.br"; 
			
			return removerEspacos(email.toLowerCase()); ////nome.toLowerCase() - converte os caracteres para minusculo
		}
				
}


