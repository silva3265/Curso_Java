package br.com.impacta.classes;

public class AppAutomovel01 {
	
	public static void main(String[] args) {
		
		//declarando uma variavel
		
		//tipo nome
		
		Automovel auto = new Automovel ();
		auto.marca = "honda";
		auto.ano = 2019; 
		auto.modelo = "civic";
		auto.placa = "EBB1234";
		
		Automovel auto2 = new Automovel ();
		auto2.marca = "chevrolet";
		auto2.ano = 2023;
		auto2.modelo = "corsa";
		auto2.placa = "AAA0000";
		
		System.out.println(auto);
		
		System.out.println(auto2);
		
		
		
	}

}
