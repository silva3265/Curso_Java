package br.com.impacta.estruturawhile;

public class EstruturaWhile02 {
	
public static void main(String[] args) {
		
		int numero = (int) (Math.random() * 20);
		
		//FAÇA
		do {
			
			System.out.println(numero++); //PRIMEIRO EXECUTA O (DO) - DEPOIS VERIFICA SE DEVE EXECUTAR NOVAMENTE
		}
		
		
		while (numero < 10); {
			System.out.println(numero++);
		}
		
		System.out.println("fim do programa");
	}

}
