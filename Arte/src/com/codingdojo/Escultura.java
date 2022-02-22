package com.codingdojo;

public class Escultura extends Arte {
	
private String material;
	
	public Escultura(String titulo, String autor, String descripcion,String material) {
		super(titulo,autor,descripcion);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	} 
	
	public void arte() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Descripcion: " + getDescripcion());
		System.out.println("Tipo de material: " + getMaterial());
	}

}
