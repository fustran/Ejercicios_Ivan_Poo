package com.poo.Exs.Rec_567_2.I;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppParking {

    static final Scanner TECLADO = new Scanner(System.in);
    static Parking parking = new Parking("Alicante",1000, 0.015);

    public static void main(String[] args) {

        System.out.println("=== PARKING MUTXAMIEL===");

        parking.generarClientesAleatorios();
        parking.mostrarClientesActuales();

        app1();

        Ticket ticket = new Ticket("", 1, Estado.PENDIENTE);
        ticket.generar();
        parking.anyadirClientes(ticket);
        ticket.recoger();
        parking.mostrarClientesActuales();

        app2();
        parking.mostrarClientesActuales();

        app3();

    }

    public static void app1() {
        int plazasTotales = parking.getPlazasTotales();
        int clientes = parking.getClientesActuales().size();
        int plazasLibres = 0;

        System.out.println("APP ACCESO");

        plazasLibres = plazasTotales - clientes;

        System.out.println("Plazas libres " + "(" + plazasLibres + ")");

    }

    public static void app2(){
        System.out.println("=== PAGO DE TICKETS ===");
        System.out.println("Introduce la matrícula:");
        String matricula = TECLADO.nextLine().trim().toUpperCase();
        parking.validarTicket(matricula);

    }

    public static void app3() {

        List<Ticket> ordenados = new ArrayList<>(parking.getClientesActuales());

        ordenados.sort(Comparator.comparingInt(Ticket::getMinutos));

        System.out.println();
        System.out.println("            === TICKETS ORDENADOS ===");

        int i = 1;
        for (Ticket ticket : ordenados) {
            System.out.printf("%d. Matrícula: %s - minutos: %d - estado: %s%n", i++,
                    ticket.getMatricula(),
                    ticket.getMinutos(),
                    ticket.getEstado());
        }
    }
}