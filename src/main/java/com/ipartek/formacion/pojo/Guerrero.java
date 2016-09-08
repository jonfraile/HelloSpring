package com.ipartek.formacion.pojo;

public class Guerrero {

	private int puntosVida;
	private int nivel;
	private String nombre;

	public Guerrero() {
		super();
		this.puntosVida = 20;
		this.nivel = 0;
		this.nombre = "";
	}

	public int getPuntosVida() {
		return this.puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Guerrero [puntosVida=" + this.puntosVida + ", nivel=" + this.nivel + ", nombre=" + this.nombre + "]";
	}

}
