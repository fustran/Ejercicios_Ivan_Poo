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

        // crear usuarios y mostrar el chivato
        TicketMutxa.generarUsuarios(4);
        TicketMutxa.mostrarUsuariosRegistrados();
        out.println();

        out.println("**** BIENVENIDO A TICKET MUTXA ****");
        out.println();

        boolean correcto;
        Usuario usuario; // Variable donde se guarda el usuario para usarlo luego
        do {
            out.println("Inicia Sesión");

            out.println("  Usuario:");
            String nombre = TECLADO.nextLine();

            out.println("  Contraseña:");
            String contrasenya = TECLADO.nextLine();

            usuario = new Usuario(nombre,contrasenya);
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

        // Menu de Bienvenida con los eventos
        Usuario usuarioReal = usuario.getUsuarioReal();
        out.println("Hola " + usuarioReal.getNombreUsuario() + ". Elige un evento para inciar la compra:");
        out.println();
        TicketMutxa.verEventos();

        int opcion;
        int cantidadEventos;
        do {
            opcion = TECLADO.nextInt();
            cantidadEventos = TicketMutxa.getListaEventos().size();
            if (opcion > 0 && opcion <= cantidadEventos){
                TicketMutxa.getEvento(opcion);
            }else {
                out.println("ERROR, Elige una opción correcta.");
                out.println("Vuelve a introducir una opción:");
            }
        }while (opcion <= 0 || opcion > cantidadEventos);

    }
}