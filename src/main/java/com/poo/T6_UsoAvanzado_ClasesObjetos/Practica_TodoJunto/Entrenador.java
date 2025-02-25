package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

@Getter
@Setter
public class Entrenador extends MutxamielFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;


    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
    }

    public void planificarEntrenamiento() {

    }

    public void hacerCambios() {

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