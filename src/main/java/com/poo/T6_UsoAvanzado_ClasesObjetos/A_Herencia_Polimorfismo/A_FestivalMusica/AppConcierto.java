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

        for (Persona persona : personas) {
            System.out.println();
            persona.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase
        }

        System.out.println();

        // Creación de los objetos de cada tipo.
        Persona artista2 = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente2 = new Asistente("Lucas", 18, "VIP");
        Persona organizador2 = new Organizador("Martín", 30, "Producción");

        // Usar el metodo con polimorfismo.
        mostrarAcceso(artista2);      //Accediendo como Artista: Preparando el show.
        mostrarAcceso(asistente2);    //Accediendo como Asistente: Buscando su asiento.
        mostrarAcceso(organizador2);  //Accediendo como Organizador: Coordinando el evento.

    }

    public static void mostrarAcceso(Persona persona) {
        persona.accederEvento();

    }
}