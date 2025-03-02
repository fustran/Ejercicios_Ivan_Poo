package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;
/**
 * Clase Abstracta de la que se va a heredar en nombre y la edad
 */
@Getter
@Setter
public abstract class MutxamielFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;


    protected  MutxamielFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}