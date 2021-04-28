package com.cocaleca.demo.wrappers;

public class PrimitivosVsWrappers {
    private static long[] numeros = new long[10_000_000]; // Intercambiar long por Long y medir los recursos y tiempo

    // Todo esto para ver el costo de memoria
    public void ejecuta() throws InterruptedException {
	long antes = System.currentTimeMillis();
	for (int i = 0; i < numeros.length; i++) {
	    numeros[i] = i;
	}
	long ahora = System.currentTimeMillis();
	System.out.println("Tiempo transcurrido: " + (ahora - antes));

	// System.out.println("Finalizado");
	// Thread.sleep(300000);
    }
}
