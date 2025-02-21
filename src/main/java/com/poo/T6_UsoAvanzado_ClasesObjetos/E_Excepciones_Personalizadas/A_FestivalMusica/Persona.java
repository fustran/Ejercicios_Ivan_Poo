package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.A_FestivalMusica;

//SUPERCLASE
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento...");
    }

}