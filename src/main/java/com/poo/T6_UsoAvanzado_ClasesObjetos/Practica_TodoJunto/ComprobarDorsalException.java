package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

/**
 * Excepción personalizada para controlar repeticiones de dorsales
 */
public class ComprobarDorsalException extends Exception{

    public ComprobarDorsalException() {

        super("ERROR: El dorsal elegido no está disponible...");
    }
}