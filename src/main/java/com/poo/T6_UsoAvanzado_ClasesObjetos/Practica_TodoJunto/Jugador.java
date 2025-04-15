package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

import java.util.Objects;

/**
 * Clase que maneja las acciones del Jugador
 */
@Getter
@Setter
public class Jugador extends MutxamielFC implements AccionesDeportivas, Comparable<Jugador>{

    private Equipos categoria;
    private Integer dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = Equipos.SENIOR;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public void calentar() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está calentando antes del partido...");
    }

    public void descansar() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está descansando después del partido...");
    }

    public void marcarGol() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", ha marcando GOL...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void concentrarse() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está concentrándose antes del partido...");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void viajar(String ciudad) {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está viajando a " + ciudad + ".");
    }

    // INTERFAZ FUNCIONES INTEGRANTES
    @Override
    public void celebrarGol() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }

    // INTERFAZ ACCIONES DEPORTIVAS
    @Override
    public void entrenar() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", se está entrenando" + " con el equipo " + Equipos.SENIOR.name() + "...");
    }

    // INTERFAZ ACCIONES DEPORTIVAS
    @Override
    public void jugarPartido(String rival) {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está jugando un partido contra el " + rival + ".");
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Categoría: " + getCategoria() +
                ", Dorsal: " + getDorsal() +
                ", Posición: " + getPosicion();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Jugador jugador = (Jugador) o;
        return dorsal == jugador.dorsal && categoria == jugador.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, dorsal);
    }

    @Override
    public int compareTo(Jugador o) {
        int compararPorDorsal = this.dorsal.compareTo(o.getDorsal());
        if (compararPorDorsal!=0){
            return compararPorDorsal;
        }
        return this.getCategoria().compareTo(o.getCategoria());
    }
}