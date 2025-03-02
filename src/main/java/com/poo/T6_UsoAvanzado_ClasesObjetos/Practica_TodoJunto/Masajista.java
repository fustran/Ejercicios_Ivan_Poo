package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;
/**
 * Clase que maneja las acciones del Masajista
 */
@Getter
@Setter
public class Masajista extends MutxamielFC{

    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
    }

    public void darMasaje(Jugador jugador) {
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", está dando un masaje al Jugador --> " + jugador.getNombre() + ".");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void concentrarse() {
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", se está concentrando antes del partido...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void viajar(String ciudad) {
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", está viajando a " + ciudad + ".");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void celebrarGol() {
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Totilación: " + getTitulacion() +
                ", Años experiencia: " + getAnyosExperiencia();
    }
}