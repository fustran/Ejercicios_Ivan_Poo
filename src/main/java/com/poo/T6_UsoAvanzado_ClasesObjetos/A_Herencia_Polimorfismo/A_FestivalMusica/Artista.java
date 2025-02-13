package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

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

}
