package com.poo.ExamenRecu;

import java.time.LocalDate;

public class AppComprarEntradas {

    public static void main(String[] args) {

        //crear eventos
        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");

        System.out.println();

        TicketMutxa.verEventos();

        // crear usuarios
        TicketMutxa.generarUsuarios(4);

    }
}