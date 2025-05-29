package com.poo.Exs.Rec_567_2.I;

import java.util.Scanner;

public class AppParking {

    static final Scanner TECLADO = new Scanner(System.in);
    static Parking parking = new Parking("Alicante",1000, 0.10);

    public static void main(String[] args) {

        parking.generarClientesAleatorios();
        parking.mostrarClientesActuales();

        Ticket ticket = new Ticket("", 1, Estado.PENDIENTE);
        ticket.generar();
        gestionParking();
        app2();


    }

    public static void gestionParking(){

        int plazas = parking.getPlazasTotales();
        int clientes = parking.getClientesActuales().size();
        int espacioLibre = 0;

        System.out.println("APP Parking");

        espacioLibre = plazas - clientes;

        System.out.println("Plazas libres " + espacioLibre);


    }

    public static void app2(){
        System.out.println("=== PAGO DE TICKETS ===");
        System.out.println("Introduce la matrícula:");
        String matricula = TECLADO.nextLine().trim().toUpperCase();
        System.out.println("Validando...");
        parking.validarTicket(matricula);

    }
}