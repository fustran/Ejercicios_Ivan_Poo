package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

@Getter
@Setter
public class Jugador extends MutxamielFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;


    public Jugador(String nombre, int edad) {
        super(nombre, edad);
    }

    public void calentar() {
        System.out.println("Calentando antes del partido...");
    }

    public void descansar() {
        System.out.println("Descansando después del partido");
    }

    public void marcarGol() {
        System.out.println("Marcando gol...");
    }



    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes
        System.out.println(super.getNombre() +  "concentrándose antes del partido...");
    }

    @Override
    public void viajar(String ciudad) { // Interfaz FuncionesIntegrantes
        System.out.println("Viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() { // Interfaz FuncionesIntegrantes
        System.out.println("GOOOOOOOOOOOOOOOOOOL");
    }



    @Override
    public void entrenar() { // Interfaz AccionesDeportivas

    }

    @Override
    public void jugarPartido(String rival) { // Interfaz AccionesDeportivas

    }
}
