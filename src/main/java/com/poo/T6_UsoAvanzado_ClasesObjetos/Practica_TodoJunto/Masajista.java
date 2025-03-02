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
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", está dando un masaje al Jugador --> " + jugador.getNombre() + ".");
    }

    @Override
    public void concentrarse() { // Interfaz FuncionesIntegrantes
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", se está concentrando antes del partido...");
    }

    @Override
    public void viajar(String ciudad) { // Interfaz FuncionesIntegrantes
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", está viajando a " + ciudad + ".");
    }

    @Override
    public void celebrarGol() { // Interfaz FuncionesIntegrantes
        System.out.println("EL MASAJISTA: " + super.getNombre() + ", CANTA: " + "GOOOOOOOOOOOOOOOOOOL...");
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Totilación: " + getTitulacion() +
                ", Años experiencia: " + getAnyosExperiencia();
    }
}