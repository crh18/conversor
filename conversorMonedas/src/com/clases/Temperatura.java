package com.clases;

public class Temperatura {
	private String nombreEscala;
	private double medicion;
	
	public Temperatura(String nombreEscala, double medicion) {
		this.nombreEscala = nombreEscala;
		this.medicion = medicion;
	}
	public String getNombreEscala() {
		return nombreEscala;
	}
	public void setNombreEscala(String nombreEscala) {
		this.nombreEscala = nombreEscala;
	}
	public double getMedicion() {
		return medicion;
	}
	public void setMedicion(double medicion) {
		this.medicion = medicion;
	}
	
	
}
