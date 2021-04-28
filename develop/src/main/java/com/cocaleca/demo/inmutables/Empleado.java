package com.cocaleca.demo.inmutables;

public final class Empleado {
    private final int id;
    private final String nombre;
    private final Direccion direccion;

    public Empleado(int id, String nombre, Direccion direccion) {
	this.id = id;
	this.nombre = nombre;
	// En esta punto protegemos la inmutabilidad de Empleado al no tomar directamente la direccion y 
	// asignandola sino que instanciamos un objeto Direccion solo en el constructor
	this.direccion = new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

    public int getId() {
	return id;
    }

    public String getNombre() {
	return nombre;
    }

    public Direccion getDireccion() {
	// Aqui otro punto de proteccion para evitar que puedan acceder al puntero en
	// memoria de la direccion del objeto actual
	return new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad());
    }

    public Empleado cambiarNombre(String nuevoNombre) {
	return new Empleado(this.id, nuevoNombre, this.direccion);
    }

    @Override
    public String toString() {
	return "Datos del empleado: Id: " + id + ", Nombre: " + nombre + ", Direccion: " + direccion.toString();
    }
}
