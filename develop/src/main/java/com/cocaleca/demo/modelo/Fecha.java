package com.cocaleca.demo.modelo;

import java.util.Objects;

/**
 * Validar siempre la captura de informacion de los parametros
 * 
 * @author amatos
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    DiaDeLaSemana diaDeLaSemana;

    public Fecha(int dia, int mes, int anio, DiaDeLaSemana diaDeLaSemana) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.anio = anio;

	// No permitir nulos
	this.diaDeLaSemana = Objects.requireNonNull(diaDeLaSemana, "El diaDeLaSemana no puede ser nulo");
    }

    /**
     * Establece el dia del mes
     * 
     * @param dia es el dia del mes. Este debe estar comprendido entre 1 y 31
     * @throws IllegalArgumentException si dia es menor a 1 o mayor a 31
     */
    public void setDia(int dia) {
	if (dia < 1 || dia > 31) {
	    throw new IllegalArgumentException("Dia: " + dia + " no valido, El dia debe estar entre 1 y 31");
	}
	this.dia = dia;
    }

    public void setMes(int mes) {
	this.mes = mes;
    }

    public void setAnio(int anio) {
	this.anio = anio;
    }

    public void setDiaDeLaSemana(DiaDeLaSemana diaDeLaSemana) {
	this.diaDeLaSemana = diaDeLaSemana;
    }

    // El usar assert es ventajoso ya que lo podemos inhabilitar en tiempo de
    // ejecucion
    private int cuantosDiasTieneElMes(int mes, int anio) {
	assert mes >= 1 && mes <= 12;
	return 1; // no lo implementamos porque lo que queriamos ver es como se usa el assert
    }

}
