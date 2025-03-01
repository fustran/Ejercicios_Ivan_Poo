package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import lombok.*;

@Getter
@Setter
public class Acompanyante extends MutxamielFC{

    private Jugador integrante; //Lo dejo sin inicializar para añadirlo yo
    private String parentesco;


    public Acompanyante(String nombre, int edad, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
    }



    public void animarEquipo() {
        System.out.println("Vamooooooos EQUIPOOOOOO....");
    }



    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes
        System.out.println(super.getNombre() +  "Concentrándose antes del partido...");
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