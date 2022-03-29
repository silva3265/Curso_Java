package br.com.impacta.classes;

public class Automovel {
	
	
	//FINALIZED
	
	//STATIC FINAL TEMOS QUE INFOMRAR UM VALOR INICIAL
		//POR OBRIGAÇÃO. FINAL TEMOS QYE INFORMAR ALGO
	
	//QUANDO CRIAMOS UMA CONSTANTE (STATIC + FINAL)
	//O NOME DEVE SER MAIUSCULO (PAIS_ORIGEM)
	
	
	public static final String PAIS_ORIGEM = "Brasil";
	
	//Atributos.
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	public String mostrar() { //criamos uma string com todas as informações aqui para depois nao ficar chamando o Get no metodo main
		
		String titulo = "DADOS DO AUTOMOVEL";
		
		
		
		String resposta = titulo + this.getMarca() +
							"\nMODELO: " + this.getModelo() + 
							"\nAno: " + this.getAno() +
							"\nPlaca: " + this.getPlaca() +
							"\nPaisOrigem" + PAIS_ORIGEM; 
						
		
		return resposta;
		
				
		
	}
	
	public String mostrar(String titulo) { //SOBRECARGA (String titulo)
	
		
		
		
		String resposta = titulo + this.getMarca() +
							"\nMODELO: " + this.getModelo() + 
							"\nano" + this.getAno() +
							"\nplaca: " + this.getPlaca();
		
				
		return resposta;
	}
	
	public String mostrar(String titulo, int ano) { //SOBRECARGA (String titulo, int ano)
	
		
		
		
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
	



