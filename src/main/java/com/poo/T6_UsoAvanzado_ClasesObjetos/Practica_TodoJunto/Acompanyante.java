package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

/**
 * Clase que maneja las acciones del Acomañante
 */
@Getter
@Setter
public class Acompanyante extends MutxamielFC{

    private Jugador integrante; //Lo dejo sin inicializar para añadirlo yo
    private String parentesco;

    public Acompanyante(String nombre, int edad, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
    }

    public void animarEquipo() {
        System.out.println("EL ACOMPAÑANTE: " + super.getNombre() + ", del JUGADOR: " + getIntegrante().getNombre() + ", GRITA:" + " Vamooooooos EQUIPOOOOOO....");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void concentrarse() {
        System.out.println("EL ACOMPAÑANTE: " + super.getNombre() + ", del JUGADOR: "+ getIntegrante().getNombre() + ", está concentrándose antes del partido...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void viajar(String ciudad) {
        System.out.println("EL ACOMPAÑANTE: " + super.getNombre() + ", del JUGADOR: " + getIntegrante().getNombre() + ", está viajando a " + ciudad + ".");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void celebrarGol() {
        System.out.println("EL ACOMPAÑANTE: " + super.getNombre() + ", del JUGADOR: " + getIntegrante().getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }
}