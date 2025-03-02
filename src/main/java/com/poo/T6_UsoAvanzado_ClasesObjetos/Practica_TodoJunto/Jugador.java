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
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está calentando antes del partido...");
    }

    public void descansar() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está descansando después del partido...");
    }

    public void marcarGol() {
        System.out.println("EL JUGADOR: " + super.getNombre() + ", ha marcando GOL...");
    }

    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está concentrándose antes del partido...");
    }

    @Override
    public void viajar(String ciudad) { // Interfaz FuncionesIntegrantes
        System.out.println("EL JUGADOR: " + super.getNombre() + ", está viajando a " + ciudad + ".");
    }

    @Override
    public void celebrarGol() { // Interfaz FuncionesIntegrantes
        System.out.println("EL JUGADOR: " + super.getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }

    @Override
    public void entrenar() { // Interfaz AccionesDeportivas
        System.out.println("EL JUGADOR: " + super.getNombre() + ", se está entrenando" + " con el equipo " + Equipos.SENIOR.name() + "...");
    }

    @Override
    public void jugarPartido(String rival) { // Interfaz AccionesDeportivas
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
}