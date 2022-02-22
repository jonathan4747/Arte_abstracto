package com.codingdojo;

public class Pintura extends Arte {
	
	private String tipoPintura;
	
	public Pintura(String titulo, String autor, String descripcion,String tipoPintura) {
		super(titulo,autor,descripcion);
		this.tipoPintura=tipoPintura;
	} 
	
	
	
	public String getTipoPintura() {
		return tipoPintura;
	}



	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}



	public void arte() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Descripcion: " + getDescripcion());
		System.out.println("Tipo de pintura: " + getTipoPintura());
	}
	
	

}
