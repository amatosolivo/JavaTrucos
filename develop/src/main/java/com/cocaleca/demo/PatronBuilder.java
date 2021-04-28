package com.cocaleca.demo;

/**
 * 
 * @author amatos
 *
 * @category Practica de Patrones - Metodo que prueba el patron Builder en el
 *           ahorro de parametros en un constructor
 */
public class PatronBuilder {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private int radioEsquina;

    // La clase padre acepta un unico constructor con un objeto Builder
    public PatronBuilder(Builder builder) {
	// Y asignamos los valores del builder a las variables
	x = builder.x;
	y = builder.y;
	ancho = builder.ancho;
	alto = builder.alto;
	radioEsquina = builder.radioEsquina;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder(100);
	sb.append("Valor de x:").append(x).append("\n");
	sb.append("Valor de y:").append(y).append("\n");
	sb.append("Valor de ancho:").append(ancho).append("\n");
	sb.append("Valor de alto:").append(alto).append("\n");
	sb.append("Valor de radioEsquina:").append(radioEsquina).append("\n");
	return sb.toString();
    }

    // Clase estatica Builder dentro de la clase PatronBuilder
    public static class Builder {
	// Replicar las variables dentro del Builder
	// Solo inicializar las que tengan un valor por defecto
	private int x = 0;
	private int y = 0;
	private int ancho;
	private int alto;
	private int radioEsquina = 0;
	
	// Ahora creamos un constructor de nuestra clase Builder
	// con los parametros que son obligatorios
	public Builder(int ancho, int alto) {
	    this.ancho = ancho;
	    this.alto = alto;
	}

	// Ahora creamos un metodo que devuelva un objeto
	// Builder despues de haber asignado su valor a cada
	// variable privada
	public Builder x(int valor) {
	    x = valor;
	    return this;
	}

	public Builder y(int valor) {
	    y = valor;
	    return this;
	}

	public Builder alto(int valor) {
	    alto = valor;
	    return this;
	}

	public Builder ancho(int valor) {
	    ancho = valor;
	    return this;
	}

	public Builder radioEsquina(int valor) {
	    radioEsquina = valor;
	    return this;
	}

	// Todo patron Builder debe tener un metodo Build
	// que devuelve un nuevo objeto de la clase padre
	public PatronBuilder build() {
	    return new PatronBuilder(this);
	}
    }
}
