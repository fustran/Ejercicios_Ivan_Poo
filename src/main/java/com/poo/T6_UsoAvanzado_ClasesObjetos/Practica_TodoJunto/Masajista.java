package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;


import lombok.*;

@Getter
@Setter
public class Masajista extends MutxamielFC{

    private String titulacion;
    private int anyosExperiencia;


    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
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

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Totilación: " + getTitulacion() +
                ", Años experiencia: " + getAnyosExperiencia();
    }
}