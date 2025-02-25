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

    }

    public void descansar() {

    }

    public void marcarGol() {

    }



    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes

    }

    @Override
    public void viajar(String ciudad) { // Interfaz FuncionesIntegrantes

    }

    @Override
    public void celebrarGol() { // Interfaz FuncionesIntegrantes

    }



    @Override
    public void entrenar() { // Interfaz AccionesDeportivas

    }

    @Override
    public void jugarPartido(String rival) { // Interfaz AccionesDeportivas

    }
}
