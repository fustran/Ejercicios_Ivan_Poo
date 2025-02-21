package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.A_FestivalMusica;

import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Artista;
import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Asistente;
import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Organizador;
import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona;

public class AppConcierto {

    public static void main(String[] args) {

        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Asistente asistente1 = new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Asistente("Carlos", 25, "VIP");
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Artista artista1 = new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Artista("Dua Lipa", 28, "Pop");
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Organizador organizador1 = new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Organizador("Iván", 40, "Seguridad");

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
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona[] personas = {
                new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Asistente("Lucas", 18, "VIP"),
                new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Artista("Sofía", 25, "Rock Alternativo"),
                new com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Organizador("Martín", 30, "Producción")
        };

        for (com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona persona : personas) {
            System.out.println();
            persona.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase
        }

        System.out.println();

        // Creación de los objetos de cada tipo.
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona artista2 = new Artista("Sofía", 25, "Rock Alternativo");
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona asistente2 = new Asistente("Lucas", 18, "VIP");
        com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona organizador2 = new Organizador("Martín", 30, "Producción");

        // Usar el metodo con polimorfismo.
        mostrarAcceso(artista2);      //Accediendo como Artista: Preparando el show.
        mostrarAcceso(asistente2);    //Accediendo como Asistente: Buscando su asiento.
        mostrarAcceso(organizador2);  //Accediendo como Organizador: Coordinando el evento.

    }

    public static void mostrarAcceso(Persona persona) {
        persona.accederEvento();

    }
}