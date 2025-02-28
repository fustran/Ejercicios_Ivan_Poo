package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
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

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        ArrayList<Acompanyante> listaAcompanyantes = new ArrayList<>();
        ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
        ArrayList<Masajista> listaMasajistas = new ArrayList<>();


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
                        menuCase1(teclado, listaJugadores); // Llamada al metodo del caso 1
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
                        String opcion2 = teclado.nextLine().toUpperCase().trim();

                        menuCase2(opcion2, teclado, listaEntrenadores); // Llamada al metodo del caso 2

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
                        String opcion3 = teclado.nextLine().toUpperCase().trim();

                        menuCase3(opcion3, teclado, listaMasajistas); // Llamada al metodo del caso 3

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

    // Metodo para el menú del caso 1 (MANTENIMIENTO DE JUGADORES)
    public static void menuCase1(Scanner teclado, ArrayList<Jugador> listaJugadores) {
        while (true){
            System.out.println("=== Mantenimiento de jugadores ===");
            System.out.println();
            System.out.println("    [1]. Añadir nuevo jugador");
            System.out.println("    [2]. Modificar datos del jugador existente");
            System.out.println("    [3]. Crear acompañantes (sólo seniors) ");
            System.out.println("    [X]. Volver al menú principal");
            System.out.println();
            System.out.println("   =========================================   ");
            System.out.println();
            System.out.println("Selecciona una opción -->");

            String opcion = teclado.nextLine().toUpperCase().trim();

            switch (opcion) {
                case "1":
                    System.out.println("=== Mantenimiento de jugadores. Añadir nuevo jugador ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = teclado.nextLine().trim();

                        System.out.println("Introduce la edad: ");
                        int edad = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce el dorsal: ");
                        int dorsal = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce la posición: ");
                        String posicion = teclado.nextLine().trim().toUpperCase();

                        try {
                            Posiciones posiciones = Posiciones.valueOf(posicion);
                            Jugador nuevoJugador = new Jugador(nombre, edad, dorsal, posiciones);
                            listaJugadores.add(nuevoJugador);
                            System.out.println("Jugador añadido...");
                        }catch (IllegalArgumentException e){
                            System.out.println("ERROR: La posición no existe");
                            continue;
                        }

                        System.out.println("Deseas añadir más jugadores? S/N");
                        String siNo = teclado.nextLine().trim().toUpperCase();

                        if(siNo.equals("N")){
                            break;
                        }
                    }
                    break;

                case "2":
                    System.out.println("=== Mantenimiento de jugadores. Modificar datos del jugador existente ===");
                    System.out.println();
                    System.out.println("De qué jugador quieres hacer cambios?");

                    for (int i = 0; i < listaJugadores.size(); i++){
                        Jugador jugador = listaJugadores.get(i);
                        System.out.println("[" + i + ", Nombre: " + jugador.getNombre() +
                                ", Edad: " + jugador.getEdad() +
                                ", Categoría: " + jugador.getCategoria() +
                                ", Dorsal: " + jugador.getDorsal() +
                                ", Posición: " + jugador.getPosicion() + "]");
                    }

                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    int opcionCambio = teclado.nextInt();
                    teclado.nextLine();
                    listaJugadores.get(opcionCambio);

                    break;

                case "3":
                    System.out.println("=== Mantenimiento de jugadores. Crear acompañante ===");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    return;

                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
        }
    }

    // Metodo para el menu del caso 2
    public static void menuCase2(String opcion, Scanner teclado, ArrayList<Entrenador> listaEntrenadores) {
        while (true){
            switch (opcion) {
                case "1":
                    System.out.println(".");
                    break;

                case "2":
                    System.out.println("..");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    return;

                default:
                    System.out.println("Opción incorrecta...");
            }
        }
    }

    // Metodo para el menu del caso 3
    public static void menuCase3(String opcion, Scanner teclado, ArrayList<Masajista> listaMasajistas) {
        while (true){
            switch (opcion) {
                case "1":
                    System.out.println("Prueba 3");
                    break;

                case "2":
                    System.out.println("..");
                    break;

                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                  return;

                default:
                    System.out.println("Opción incorrecta...");
            }
        }
    }
}