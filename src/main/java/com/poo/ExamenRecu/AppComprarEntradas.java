package com.poo.ExamenRecu;

import java.time.LocalDate;
import static java.lang.System.*;

public class AppComprarEntradas {

    public static void main(String[] args) {

        //crear eventos
        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");

        out.println();

        TicketMutxa.verEventos();

        // crear usuarios y mostrar el chivato
        TicketMutxa.generarUsuarios(4);
        out.println();

        out.println("**** BIENVENIDO A TICKET MUTXA ****");
        out.println();


        out.println("Inicia Sesión");
        out.println("  Usuario:");
        out.println("  Contraseña:");




    }
}