package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

    // Metodo para el menú del caso 1 (MANTENIMIENTO DE JUGADORES)
    public static void menuCase1(Scanner teclado, ArrayList<Jugador> listaJugadores, ArrayList<Acompanyante> listaAcompanyantes) throws ComprobarDorsalException {
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
                // AÑADIR NUEVO JUGADOR
                case "1":
                    System.out.println("=== Mantenimiento de jugadores. Añadir nuevo jugador ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = teclado.nextLine().trim().toLowerCase();

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
                            Jugador jugador = new Jugador(nombre, edad, dorsal, posiciones);
                            listaJugadores.add(jugador);
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

                // MODIFICAR JUGADOR EXISTENTE
                case "2":
                    System.out.println("=== Mantenimiento de jugadores. Modificar datos del jugador existente ===");
                    System.out.println();
                    System.out.println("De qué jugador quieres hacer cambios?");

                    for (int i = 0; i < listaJugadores.size(); i++){
                        System.out.println("[" + i + ", " + listaJugadores.get(i) + "]");
                    }

                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    int opcionCambio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println();

                    System.out.println("=== Mantenimiento de jugadores. Modificar datos del jugador existente ===");
                    System.out.println();

                    try{
                        System.out.println("Modificando jugador: [" + listaJugadores.get(opcionCambio) + "]");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    Jugador jugador = listaJugadores.get(opcionCambio);

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Categoria, Dorsal, Posicion]:");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioJugador = teclado.nextLine().toLowerCase();

                    switch (opcionCambioJugador) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            jugador.setNombre(teclado.nextLine().trim());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            jugador.setEdad(teclado.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "categoria":
                            System.out.println("Nueva categoría -->");
                            String categoria = teclado.nextLine().toUpperCase();

                            try{
                                Equipos categoriaElegida = Equipos.valueOf(categoria);
                                jugador.setCategoria(categoriaElegida);
                                System.out.println("Categoria modificada...");
                            }catch (IllegalArgumentException e){
                                System.out.println("ERROR: La categoria elegida no existe");
                            }
                            break;

                        case "dorsal":
                            System.out.println("Nuevo dorsal -->");
                            int dorsal = teclado.nextInt();
                            teclado.nextLine();

                            try{
                                for (Jugador jugadorDorsal : listaJugadores) {
                                    if(jugadorDorsal.getCategoria().equals(jugador.getCategoria()) && jugadorDorsal.getDorsal() == dorsal){
                                        throw new ComprobarDorsalException();
                                    }
                                }
                                jugador.setDorsal(dorsal);
                                System.out.println("Dorsal modificado...");

                            }catch (ComprobarDorsalException e){
                                System.out.println(e.getMessage());
                            }
                            
                            break;

                        case "posicion":
                            System.out.println("Nueva posición -->");
                            String posicion = teclado.nextLine().toUpperCase();

                            try{
                                Posiciones posicionElegida = Posiciones.valueOf(posicion);
                                jugador.setPosicion(posicionElegida);
                            }catch (IllegalArgumentException e){
                                System.out.println("ERROR: La posicion elegida no existe");
                            }

                            break;

                        default:
                            System.out.println("ERROR: Opción incorrecta");
                    }
                    break;

                // CREAR ACOMPAÑANTE Y AÑADIR
                case "3":
                    System.out.println("=== Mantenimiento de jugadores. Crear acompañante ===");
                    Acompanyante acompanyante = new Acompanyante("David", 18, "Sobrino");
                    listaAcompanyantes.add(acompanyante);

                    System.out.println();

                    System.out.println("De qué jugador eres acompañante?");

                    for (int i = 0; i < listaJugadores.size(); i++){
                        Jugador jugadorAcompanyante = listaJugadores.get(i);
                        System.out.println("[" + i + ", Nombre: " + jugadorAcompanyante.getNombre() + "]");
                    }

                    String acompanyanteJugador = teclado.nextLine();

                    boolean jugadorEncontrado = false;
                    for (Jugador jugadorAcompanyante : listaJugadores) {
                        if (jugadorAcompanyante.getNombre().equals(acompanyanteJugador)){
                            acompanyante.setIntegrante(jugadorAcompanyante);
                            jugadorEncontrado = true;
                            break;
                        }
                    }

                    if(!jugadorEncontrado) {
                        System.out.println("ERROR: El jugador no existe en la lista...");
                    }

                    System.out.println();

                    for (int i = 0; i < listaAcompanyantes.size(); i++){
                        Acompanyante acompanyantes = listaAcompanyantes.get(i);
                        System.out.println("[" + i + ", Nombre: " + acompanyantes.getNombre() +
                                ", Edad: " + acompanyantes.getEdad() +
                                ", Integrante " + acompanyantes.getIntegrante().getNombre() +
                                ", Parentesco: " + acompanyantes.getParentesco() +
                                "]");
                    }
                    break;

                // SALIR AL MENU PRINCIPAL
                case "X":
                    System.out.println("Volviendo al menú principal...");
                    System.out.println();
                    return;

                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
            System.out.println();
        }
    }


    // Metodo para el menu del caso 2 (MANTENIMIENTO DE ENTRENADORES)
    public static void menuCase2(Scanner teclado, ArrayList<Entrenador> listaEntrenadores) {
        while (true){
            System.out.println("=== Mantenimiento de entrenadores ===");
            System.out.println();
            System.out.println("    [1]. Añadir nuevo entrenador");
            System.out.println("    [2]. Modificar datos del entrenador existente");
            System.out.println("    [X]. Volver al menú principal");

            System.out.println();
            System.out.println("=========================================");
            System.out.println();

            System.out.println("Selecciona una opción -->");
            String opcion = teclado.nextLine().toUpperCase().trim();
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


    // Metodo para el menu del caso 3 (MANTENIMIENTO DE MASAJUSTAS)
    public static void menuCase3(Scanner teclado, ArrayList<Masajista> listaMasajistas) {
        while (true){
            System.out.println("=== Mantenimiento de masajistas ===");
            System.out.println();
            System.out.println("    [1]. Añadir nuevo masajista");
            System.out.println("    [2]. Modificar datos del masajista existente");
            System.out.println("    [X]. Volver al menú principal");

            System.out.println();
            System.out.println("=========================================");
            System.out.println();

            System.out.println("Selecciona una opción -->");
            String opcion = teclado.nextLine().toUpperCase().trim();
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


    // LISTADO DE EQUIPOS
    public static void menuCase4(Equipos[] listaEquipos) {

        System.out.println("====== Listado de equipos del VILLAJOYOSA C.F ======");
        System.out.println();

        for(Equipos equipos : listaEquipos){
            System.out.println(equipos.name());
        }
        System.out.println();
    }
}