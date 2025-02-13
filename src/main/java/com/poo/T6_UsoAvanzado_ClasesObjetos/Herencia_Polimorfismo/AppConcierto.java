package com.poo.T6_UsoAvanzado_ClasesObjetos.Herencia_Polimorfismo;

public class AppConcierto {

    public static void main(String[] args) {

        Asistente asistente1 = new Asistente("Carlos", 25, "VIP");
        Artista artista1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador organizador1 = new Organizador("Iván", 40, "Seguridad");

        System.out.println();

        System.out.println("Información del asistente:");
        asistente1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        artista1.mostrarInfo();

        System.out.println();

        System.out.println("Información del organizador:");
        organizador1.mostrarInfo();



    }
}