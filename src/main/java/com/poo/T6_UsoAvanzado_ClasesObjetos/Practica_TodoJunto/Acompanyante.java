package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

public class Acompanyante extends MutxamielFC{

    private Jugador integrante;
    private String parentesco;


    public Acompanyante(String nombre, int edad) {
        super(nombre, edad);
    }

    public void animarEquipo() {

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