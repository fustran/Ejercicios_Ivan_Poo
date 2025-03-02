package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

/**
 * Clase que maneja las acciones del Entrenador
 */
@Getter
@Setter
public class Entrenador extends MutxamielFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = Equipos.SENIOR;
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento() {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está planificando el entrenamiento...");
    }

    public void hacerCambios() {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está haciendo cambios de jugadores en el partido...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void concentrarse() {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está concentrándose antes del partido...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void viajar(String ciudad) {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está viajando a " + ciudad + ".");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void celebrarGol() {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }

    // INTERFAZ ACCIONES DEPORTIVAS
    @Override
    public void entrenar() {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está entrenando" + " al equipo " + Equipos.SENIOR.name() + "...");
    }

    // INTERFAZ ACCIONES DEPORTIVAS
    @Override
    public void jugarPartido(String rival) {
        System.out.println("EL ENTRENADOR: " + super.getNombre() + ", está jugando un partido contra el " + rival + ".");
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Equipo: " + getEquipo() +
                ", Formación: " + getFormacionPreferida();
    }
}