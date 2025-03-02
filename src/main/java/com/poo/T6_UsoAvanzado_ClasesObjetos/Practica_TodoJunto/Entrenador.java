package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

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
        System.out.println("Planificando el entrenamiento...");
    }

    public void hacerCambios() {
        System.out.println("Haciendo cambios de jugadores en el partido...");
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
        System.out.println("Entrenandose con el equipo...");
    }

    @Override
    public void jugarPartido(String rival) { // Interfaz AccionesDeportivas
        System.out.println("jugando partido contra " + rival);
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Equipo: " + getEquipo() +
                ", Formación: " + getFormacionPreferida();
    }
}