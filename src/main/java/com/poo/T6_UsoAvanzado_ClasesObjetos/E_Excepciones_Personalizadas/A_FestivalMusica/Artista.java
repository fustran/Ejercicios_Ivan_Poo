package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.A_FestivalMusica;

import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona;

//SUBCLASE QUE TAMBIÉN HEREDA DE PERSONA (EXTENDS)
public class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como artista: Preparando el show.");
    }
}
