package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

public class Masajista extends MutxamielFC{

    private String titulacion;
    private int anyosExperiencia;


    public Masajista(String nombre, int edad) {
        super(nombre, edad);
    }

    public void darMasaje(Jugador jugador) {
        System.out.println("Dando un masaje al jugador " + jugador);
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
}