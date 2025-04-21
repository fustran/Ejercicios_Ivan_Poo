package com.poo.ExamenRecu;

import java.time.LocalDate;
import java.util.Scanner;
import static java.lang.System.*;

public class AppComprarEntradas {

    public static void main(String[] args) {

        final Scanner TECLADO = new Scanner(System.in);

        // Crear eventos
        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");

        out.println();

        TicketMutxa.verEventos();

        // crear usuarios y mostrar el chivato
        TicketMutxa.generarUsuarios(4);
        TicketMutxa.mostrarUsuariosRegistrados();
        out.println();

        out.println("**** BIENVENIDO A TICKET MUTXA ****");
        out.println();

        boolean correcto;
        do {
            out.println("Inicia Sesión");

            out.println("  Usuario:");
            String nombre = TECLADO.nextLine();

            out.println("  Contraseña:");
            String contrasenya = TECLADO.nextLine();

            Usuario usuario = new Usuario(nombre,contrasenya);
            correcto = usuario.autenticarse(TicketMutxa.getUsuariosRegistrados());

            if(correcto){
                out.println();
                out.println("BIENVENID@");
                out.println("-----------------");
            }else{
                out.println();
                out.println("Credenciales no válidad. Inténtalo de nuevo...");
                out.println("------------------------------------------------------");
            }

        }while (!correcto);




    }
}