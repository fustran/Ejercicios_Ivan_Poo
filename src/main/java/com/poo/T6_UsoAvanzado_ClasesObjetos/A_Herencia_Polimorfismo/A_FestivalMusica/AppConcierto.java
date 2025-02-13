package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

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

        System.out.println();

        System.out.println("Información de Personas:");
        Persona[] personas = {
                new Asistente("Lucas", 18, "VIP"),
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Organizador("Martín", 30, "Producción")
        };

        for (Persona p : personas) {
            System.out.println();
            p.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase
        }

    }
}