package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_AdivinhaNumero {
	
	public static void main(String[] args) {
		
		
		//o programa produz um numero entre 0 a 100
		
		int numero = (int) (Math.random() * 100) + 1; //essa função exige 100, mais nunca vai chegar no 100 vai chegar em 99. ai acrecentamos +1
		int min = 1, max = 100;
		int tentativas = 0;
		
		while (true) {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre " + min + max));
		
			
			if (valor > max || valor < min) {
				System.out.println("");     
				continue; //volta pro começo, e pergunta de novo
			}
			
			tentativas++;
			
			if (valor < numero) {
				min = valor + 1;
				
			}else if (valor == numero) {
				break;
				
			}else {
				
				max = valor -1;
			}
			
		
		}
		
		String resposta = "Vc acertou em: " + tentativas + "tentativas";
		
		JOptionPane.showInternalMessageDialog(null, resposta);
		
		
	
	
	}

}
