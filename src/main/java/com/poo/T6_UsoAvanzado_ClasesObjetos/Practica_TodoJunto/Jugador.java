package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

@Getter
@Setter
public class Jugador extends MutxamielFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;


    public Jugador(String nombre, int edad, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = Equipos.SENIOR;
        this.dorsal = dorsal;
        this.posicion = posicion;

    }

    public void calentar() {
        System.out.println("El jugador " + super.getNombre() + ": está calentando antes del partido...");
    }

    public void descansar() {
        System.out.println("El jugador " + super.getNombre() + ": está descansando después del partido...");
    }

    public void marcarGol() {
        System.out.println("El jugador " + super.getNombre() + ": ha marcando gol...");
    }



    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes
        System.out.println("El jugador " + super.getNombre() + ": está concentrándose antes del partido...");
    }

    @Override
    public void viajar(String ciudad) { // Interfaz FuncionesIntegrantes
        System.out.println("El jugador " + super.getNombre() + ": está viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() { // Interfaz FuncionesIntegrantes
        System.out.println("El jugador " + super.getNombre() + ": canta: " + "GOOOOOOOOOOOOOOOOOOL...");
    }



    @Override
    public void entrenar() { // Interfaz AccionesDeportivas
        System.out.println("El jugador " + super.getNombre() + " se está entrenando " + "con el equipo " + Equipos.SENIOR.name() + "...");
    }

    @Override
    public void jugarPartido(String rival) { // Interfaz AccionesDeportivas
        System.out.println("jugando partido contra " + rival + "...");
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Categoría: " + getCategoria() +
                ", Dorsal: " + getDorsal() +
                ", Posición: " + getPosicion();
    }

}