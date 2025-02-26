package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.Scanner;

public class AppGestionFutbol {
    public static void main(String[] args) {

        final Scanner teclado = new Scanner(System.in);

        // crear varios jugadores para el equipo SENIOR
        // crear al entrenador del equipo SENIOR
        // crear a los masajistas del club
        // crear a algún acompañante para un par de jugadores
        // concentrarse()
        // entrenar()
        // darMasaje() a algún jugador
        // viajar() a Madrid
        // planificarEntrenamiento()
        // entrenar()
        // descansar()
        // calentar()
        // jugarPartido()
        // animarEquipo()
        // hacerCambios()
        // marcarGol()
        // celebrarGol()
        // darMasaje() a varios jugadores
        // viajar() a Mutxamel
        // descansar()


        System.out.println("=== App de mantenimiento del VILLAJOYOSA FC === :D");
        System.out.println();

        while (true) {
            System.out.println("    [1]. Mantenimiento de jugadores"); // Añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).
            System.out.println("    [2]. Mantenimiento de entrenadores"); // Añadir entrenadores y modificar sus datos.
            System.out.println("    [3]. Mantenimiento de masajistas"); // Añadir masajistas y modificar sus datos.
            System.out.println("    [4]. Consultar equipos"); // Se deben listar los quipos del club y elegir uno.
            System.out.println("    [x]. Salir");

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
                        System.out.println("=== Mantenimiento de jugadores ===");
                        System.out.println();
                        System.out.println("    [1]. Añadir nuevo jugador");
                        System.out.println("    [2]. Modificar datos del jugador existente");
                        System.out.println("    [3]. Crear acompañantes (sólo seniors) ");
                        System.out.println("    [X]. Volver al menú principal");

                        System.out.println();
                        System.out.println("=========================================");
                        System.out.println();

                        System.out.println("Selecciona una opción -->");
                        String opcionCase1 = teclado.nextLine().toUpperCase().trim();

                        boolean entradaValidaCase1 = false;
                        menuCase1(opcionCase1, entradaValidaCase1); // Llamada al metodo del caso 1
                        break;

                    case "2":
                        System.out.println("=== Mantenimiento de entrenadores ===");
                        System.out.println();
                        System.out.println("    [1]. Añadir nuevo entrenador");
                        System.out.println("    [2]. Modificar datos del entrenador existente");
                        System.out.println("    [X]. Volver al menú principal");

                        System.out.println();
                        System.out.println("=========================================");
                        System.out.println();

                        System.out.println("Selecciona una opción -->");
                        String opcionCase2 = teclado.nextLine().toUpperCase().trim();

                        boolean entradaValidaCase2 = false;
                        menuCase2(opcionCase2, entradaValidaCase2); // Llamada al metodo del caso 2
                        break;

                    case "3":
                        System.out.println("=== Mantenimiento de masajistas ===");
                        System.out.println();
                        System.out.println("    [1]. Añadir nuevo masajista");
                        System.out.println("    [2]. Modificar datos del masajista existente");
                        System.out.println("    [X]. Volver al menú principal");

                        System.out.println();
                        System.out.println("=========================================");
                        System.out.println();

                        System.out.println("Selecciona una opción -->");
                        String opcionCase3 = teclado.nextLine().toUpperCase().trim();

                        boolean entradaValidaCase3 = false;
                        menuCase3(opcionCase3, entradaValidaCase3); // Llamada al metodo del caso 3
                        break;

                    case "4":
                        System.out.println("...."); // Pendiente de crear el listado de equipos
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

    // Metodo para el menú del caso 1
    public static void menuCase1(String opcionCase1, boolean entradaValidaCase1) {
        while (!entradaValidaCase1){
            switch (opcionCase1) {
                case "1":
                    System.out.println("prueba menu");
                    break;

                case "2":
                    System.out.println("..");
                    break;

                case "3":
                    System.out.println("...");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    entradaValidaCase1 = true;
                    break;

                default:
                    System.out.println("Opción incorrecta...");
                    return;
            }
        }
    }

    // Metodo para el menu del caso 2
    public static void menuCase2(String opcionCase2, boolean entradaValidaCase2) {
        while (!entradaValidaCase2){
            switch (opcionCase2) {
                case "1":
                    System.out.println(".");
                    break;

                case "2":
                    System.out.println("..");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    entradaValidaCase2 = true;
                    break;

                default:
                    System.out.println("Opción incorrecta...");
                    return;
            }
        }
    }

    // Metodo para el menu del caso 3
    public static void menuCase3(String opcionCase3, boolean entradaValidaCase3) {
        while (!entradaValidaCase3){
            switch (opcionCase3) {
                case "1":
                    System.out.println("Prueba 3");
                    break;

                case "2":
                    System.out.println("..");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    entradaValidaCase3 = true;
                    break;

                default:
                    System.out.println("Opción incorrecta...");
                    return;
            }
        }
    }
}