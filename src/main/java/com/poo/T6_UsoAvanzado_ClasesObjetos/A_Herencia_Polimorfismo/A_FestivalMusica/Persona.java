package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

import lombok.Getter;

//SUPERCLASE
@Getter
public class Persona {

    private static final int EDAD_MIN = 18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) throws EdadValidaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento...");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws EdadValidaException {
        if(edad < EDAD_MIN) {
            throw new EdadValidaException();
        }
        this.edad = edad;
    }
}