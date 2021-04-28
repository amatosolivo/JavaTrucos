package com.cocaleca.demo.genericas;

public class Billete {
    private int valor;
    private String nombre;

    public Billete(int valor, String nombre) {
	super();
	this.valor = valor;
	this.nombre = nombre;
    }

    public int getValor() {
	return valor;
    }

    public void setValor(int valor) {
	this.valor = valor;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }
}
