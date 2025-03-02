package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGestionFutbol {
    public static void main(String[] args) throws ComprobarDorsalException, ComprobarFormacionException{

        final Scanner teclado = new Scanner(System.in);

        System.out.println("=== App de mantenimiento del VILLAJOYOSA FC === :D");
        System.out.println();

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        ArrayList<Acompanyante> listaAcompanyantes = new ArrayList<>();
        ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
        ArrayList<Masajista> listaMasajistas = new ArrayList<>();


        while (true) {
            System.out.println("    [1]. Mantenimiento de jugadores"); // Añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).
            System.out.println("    [2]. Mantenimiento de entrenadores"); // Añadir entrenadores y modificar sus datos.
            System.out.println("    [3]. Mantenimiento de masajistas"); // Añadir masajistas y modificar sus datos.
            System.out.println("    [4]. Consultar equipos"); // Se deben listar los quipos del club y elegir uno.
            System.out.println("    [X]. Salir");

            System.out.println();
            System.out.println("=========================================");
            System.out.println();

            System.out.println("Selecciona una opción -->");
            String opcion = teclado.nextLine().toUpperCase().trim();

            System.out.println();

            boolean entradaValidaPrincipal = false;
            while (!entradaValidaPrincipal) {
                switch (opcion){
                    case "1":
                        Menus.menuCase1(teclado, listaJugadores, listaAcompanyantes); // Llamada al metodo del caso 1
                        break;

                    case "2":
                        Menus.menuCase2(teclado, listaEntrenadores); // Llamada al metodo del caso 2
                        break;

                    case "3":
                        Menus.menuCase3(teclado, listaMasajistas); // Llamada al metodo del caso 3
                        break;

                    case "4":
                        Menus.menuCase4(teclado, Equipos.values()); // Llamada al metodo del caso 4
                        break;

                    case "X":
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opción incorrecta...");
                }
                entradaValidaPrincipal = true;
            }
        }
    }
}