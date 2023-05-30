package com.clases;

public class Divisa {
	
	private String nombre;
	private double equivalenciaPesoCol;
	
	public Divisa() {
	}
	
	public Divisa(String nombre, double equivalenciaDolar) {
		this.nombre = nombre;
		this.equivalenciaPesoCol = equivalenciaDolar;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEquivalenciaPesoCol() {
		return equivalenciaPesoCol;
	}

	public void setEquivalenciaPesoCol(double equivalenciaPesoCol) {
		this.equivalenciaPesoCol = equivalenciaPesoCol;
	}

}
