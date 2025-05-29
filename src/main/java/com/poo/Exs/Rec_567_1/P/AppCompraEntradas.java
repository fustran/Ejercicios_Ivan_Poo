package com.poo.Exs.Rec_567_1.P;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppCompraEntradas {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        // crear eventos
        TicketMutxa.insertarEvento("Paellas", LocalDate.of(2025, 4, 16),20,"festival");
        TicketMutxa.insertarEvento("Concierto Estopa", LocalDate.of(2025, 4, 21),40,"concierto");

        // crear usuarios
        TicketMutxa.generarUsuarios(4);

        // empieza el flujo del programa
        System.out.println("**** BIENVENIDO A TICKETMUTXA ****");
        System.out.println();

        // autenticarse
        System.out.println("Inicia sesión");

        Usuario comprador;
        do {
            System.out.println("    Usuario: ");
            String usuario = teclado.nextLine();
            System.out.println("    Contraseña: ");
            String contrasenya = teclado.nextLine();

            comprador = new Usuario(usuario, contrasenya);

        } while (!comprador.autenticarse(TicketMutxa.getUsuariosRegistrados()));

        System.out.println("---------------------");

        // flujo compra de entradas
        System.out.println("Hola " + comprador.getNombreUsuario() + ". Elige un evento para iniciar la compra: ");
        TicketMutxa.verEventos();
        System.out.println("---------------------");

        int opcion;
        Evento evento;

        do{
            opcion = teclado.nextInt();
            teclado.nextLine();
            evento = TicketMutxa.getEvento(opcion);

        }while(evento == null);

        System.out.println();
        System.out.println("Estás comprando entradas para el evento " + evento.getNombre());
        System.out.println("Espera tu turno...");

        // generar cola virtual
        Queue<Usuario> colaUsuarios = new LinkedList<>();
        for (Usuario usuario : TicketMutxa.getUsuariosRegistrados()){

            if (!usuario.equals(comprador)){
                colaUsuarios.offer(usuario);
            }
        }
        colaUsuarios.offer(comprador);

        while (!colaUsuarios.isEmpty()){
            System.out.println(" -- Estás en la posición " + colaUsuarios.size() + " de la cola virtual.");
            colaUsuarios.poll();
            Thread.sleep(3000);
        }

        System.out.println("¡Es tu turno!");
        System.out.println("¿Cuántas entradas quieres? (máximo 7): ");
        System.out.println("-------------------------------------------");

        int entradas;
        do {
            entradas = teclado.nextInt();
            teclado.nextLine();
            comprador.anyadirAlCarrito(evento,entradas);

        }while(entradas > 7);

        while (true) {
            comprador.verCarrito();

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1, 2:
                    System.out.println("¿cuántas?");
                    entradas = teclado.nextInt();
                    teclado.nextLine();
                    if (opcion == 1) {
                        comprador.setCarrito(evento, entradas);
                    } else {
                        comprador.setCarrito(evento, -entradas);
                    }
                    break;
                case 3:
                    comprador.pagar();
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

}