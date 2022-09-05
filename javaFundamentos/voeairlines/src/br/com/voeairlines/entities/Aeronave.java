package br.com.voeairlines.entities;

public class Aeronave {

	private int id;
	private String fabricante;
	private String modelo;
	private String codigo;
	
	//Construtor - cria e inicializa o objeto.
	public Aeronave() {
		
	}
	//Construtor com parâmetro

	public Aeronave(String fabricante, String modelo, String codigo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	
}
