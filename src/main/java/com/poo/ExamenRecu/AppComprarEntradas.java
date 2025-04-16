package com.poo.ExamenRecu;

import java.time.LocalDate;

public class AppComprarEntradas {

    public static void main(String[] args) {

        //crear eventos
        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");

        System.out.println();

        TicketMutxa.verEventos();

        // crear usuarios y mostrar el chivato
        TicketMutxa.generarUsuarios(4);
        System.out.println();

        System.out.println("**** BIENVENIDO A TICKET MUTXA ****");
        System.out.println();


        System.out.println("Inicia Sesión");
        System.out.println("  Usuario:");
        System.out.println("  Contraseña:");




    }
}