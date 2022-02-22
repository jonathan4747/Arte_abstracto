package com.codingdojo;

public abstract class Arte {
	
	private String titulo;
	private String autor;
	private String descripcion;
		
	public Arte(String titulo, String autor, String descripcion) {
		this.titulo = titulo;
		this.autor = autor;
		this.descripcion = descripcion;
	}
	
	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		autor = autor;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		descripcion = descripcion;
	}


	abstract void arte();
	

}
