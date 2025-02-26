package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

public class ComprobarFormacionException extends Exception{

    public ComprobarFormacionException(){

        super("ERROR: El formato de la formación NO es válido...");
    }
}