
package br.com.impacta.classes;

public class Automovel {
	
	
	
	public static final String PAIS_ORIGEM = "Brasil";
	
	//Atributos.
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	private final int chassi;
	
	
	//CONSTRUTORES
	
	
	//AUTO01
	public Automovel (String marca, String modelo) {//SOBRECARGA DE CONSTRUTOR (ESSE CONSTRUTOR ACEITA 2)
		this.chassi = (int )(Math.random() * 1000); //VAI GERAR UM NUMERO ALEATORIO
		this.setMarca(marca);
		this.setModelo(modelo);
		
		
		
	}
	//AUTO02
	public Automovel (String marca, String modelo, int ano) {//SOBRECARGA DE CONSTRUTOR (ESSE CONSTRUTOR ACEITA 3)
		this (marca, modelo);//ESTA HERDANDO DO CONSTRUTOR DE CIMA
		this.setAno(ano);
		
		
	}
	/*//AUTO03
	public Automovel (String marca, String modelo, int ano, String placa, int chassi)  {//SOBRECARGA DE CONSTRUTOR (ESSE CONSTRUTOR ACEITA 4)
		this (marca, modelo, ano);
		this.setPlaca(placa);
		
		
	}*/
	
	public int getChassi() {
		return chassi;
	}
	
	//MOSTRAR 01
	public String mostrar() { //SOBRECARGA DE METODOS - SEM PARAMETROS
		
		String titulo = "DADOS DO AUTOMOVEL";
		
		
		
		String resposta = titulo +"\n\nMarca:  " + this.getMarca() +
							"\nModelo: " + this.getModelo() + "\nChassi: " + this.getChassi();
							
		
		if (this.getAno() > 0) {
			
			resposta += "\nAno: " + this.getAno();
			
		}
		if (this.getPlaca() != null) {
			
			resposta += "\nPlaca: " + this.getPlaca();
		}
		
		resposta += "\nPais de Origem: " + PAIS_ORIGEM;
						
		
		return resposta;
		
	}
	
	
	//MOSTRAR 02
	public String mostrar(String titulo) { //SOBRECARGA DE METODO - COM 1 PARAMETRO (String titulo)
	
		
		
		
		String resposta = titulo + this.getMarca() +
							"\nMODELO: " + this.getModelo() + 
							"\nano" + this.getAno() +
							"\nplaca: " + this.getPlaca() + 
							"\nChassi: " + this.getChassi();
		
				
		return resposta;
	}
	
	public String mostrar(String titulo, int ano) { //SOBRECARGA DE METODO - COM 2 PARAMETROS (String titulo, int ano)
	
		
		
		
		String resposta = titulo + this.getMarca() +
							"\nMODELO: " + this.getModelo() + 
							"\nano" + this.getAno() +
							"\nplaca: " + this.getPlaca();
		
				
		return resposta;
	}
	
	// THIS - ELE REFERENCIA A PROPRIA CLASSE
	// É UMA REFERENCIA QUE SERVE PARA TERMOS ACESSO A TODOS
		//OS ATRIBUTOS DA CLASSE (ATRIBUTOS E METODOS)
	
	public void lerDados (String marca, String modelo, int ano, String placa) {
		
		this.setMarca (marca);
		this.setModelo (modelo);
		this.setAno(ano);
		this.setPlaca (placa);
	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		if (ano < 1970) {
			throw new NumberFormatException("o Ano nao pode ser menor que 1970");//Estamos escrevendo essa exceção de erro caso o usuario digite um valor inferior
		}
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
}
	



