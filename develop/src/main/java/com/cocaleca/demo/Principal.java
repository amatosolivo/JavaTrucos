package com.cocaleca.demo;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {
	/*
	 * // Probando el patron Builder para reducir constructores de muchos parametros
	 * PatronBuilder pb = new PatronBuilder.Builder(100,
	 * 100).y(5).radioEsquina(10).build(); System.out.println(pb.toString());
	 * 
	 * // Objetos Inmutables Direccion dir = new Direccion("Circunvalacion", "C11",
	 * "Santo Domingo Norte"); Empleado empleado = new Empleado(1010, "Alexander",
	 * dir); System.out.println(empleado.getDireccion());
	 * 
	 * // Luego proteger el objeto direccion dentro de empleado este cambio no debe
	 * // afectar la inmutabilidad inicial de mi objeto Empleado
	 * dir.setNumero("40"); System.out.println(empleado.getDireccion());
	 * 
	 * // Probando el cambio de nombre Empleado empleado2 =
	 * empleado.cambiarNombre("Pedro"); System.out.println(empleado.toString());
	 * System.out.println(empleado2.toString());
	 * 
	 * Direccion nuevaDireccion = empleado.getDireccion();
	 * nuevaDireccion.setNumero("999"); System.out.println(empleado.getDireccion());
	 * 
	 * // Probando la falla al usar un Generico RAW ArrayList monedas = new
	 * ArrayList(); // <-- Esto deberia ser ArrayList<Moneda> monedas.add(new
	 * Moneda(1, "Euro"));
	 * 
	 * // El generico raw no distingue al momento de insertar un objeto // que no
	 * concuerda con el tipo de lleva la coleccion monedas.add(new Billete(5,
	 * "Euro"));
	 * 
	 * for (int i = 0; i < monedas.size(); i++) { Moneda m = (Moneda)
	 * monedas.get(i); System.out.println("Moneda :" + m.toString()); }
	 * 
	 * 
	 * // Provocando que se muestren las excepciones pre-programadas Fecha fecha =
	 * new Fecha(1, 1, 2021, null); fecha.setDia(33);
	 * System.out.println(fecha.toString());
	 * 
	 * 
	 * // Evitar float y double cuando se necesitan resultados exactos // usa
	 * BigDecimal en su lugar
	 * 
	 * System.out.println(1.0 / 3.0); double n = 1.0 / 10.0; String stringBinario =
	 * Long.toBinaryString(Double.doubleToLongBits(n));
	 * System.out.println(stringBinario); System.out.println(3 * 0.10); // Observar
	 * como sigue cortando el decimal y esta mal para precision
	 * 
	 * BigDecimal dobleString = new BigDecimal("0.1"); BigDecimal dobleDouble = new
	 * BigDecimal(0.1); // Ojo dobleString y dobleDouble no son lo mismo aunque
	 * podamos sumarlos BigDecimal suma = dobleString.add(dobleDouble);
	 * System.out.println(suma.toString()); System.out.println(dobleDouble.scale());
	 * System.out.println(dobleString.scale());
	 * 
	 * 
	 * // Como evitar las NullPointerException String cadena = null; //
	 * System.out.println(cadena.toLowerCase());
	 * System.out.println("Algo".equals(cadena)); // Si colocamos la referencia
	 * delante no hay problema System.out.println(cadena.equals("Algo")); // Si
	 * colocamos la referencia despues si hay problema
	 * 
	 * 
	 * PrimitivosVsWrappers pvw = new PrimitivosVsWrappers(); try { pvw.ejecuta(); }
	 * catch (Exception e) { // TODO: handle exception }
	 */

	// Generacion de Aleatorios
	Random generador = new Random();
	DecimalFormat df = new DecimalFormat("0.##");
	IntStream intStream = generador.ints(10, 15, 100);
	// System.out.println(df.format(generador.nextDouble()));
	// System.out.println(df.format(Math.random()));

	
	int c = 0;
	String a, b;
	do {
	    a = df.format(generador.nextDouble());
	    b = df.format(Math.random());
	    c++;
	    System.out.println("A=" + a + ", B=" + b);
	} while (a != b);
	System.out.println(c);
    }
}
