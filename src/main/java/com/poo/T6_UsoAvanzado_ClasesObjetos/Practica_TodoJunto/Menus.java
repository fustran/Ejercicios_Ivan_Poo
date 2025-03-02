package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

    // Metodo para el menú del caso 1 (MANTENIMIENTO DE JUGADORES)
    public static void menuCase1(Scanner teclado, ArrayList<Jugador> listaJugadores, ArrayList<Acompanyante> listaAcompanyantes) {
        while (true) {
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
                        while (!teclado.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            teclado.nextLine();
                        }
                        int edad = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce el dorsal: ");
                        while (!teclado.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            teclado.nextLine();
                        }
                        int dorsal = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce la posición: ");
                        String posicion = teclado.nextLine().trim().toUpperCase();

                        try {
                            Posiciones posiciones = Posiciones.valueOf(posicion);
                            for (Jugador jugadorDorsal : listaJugadores) {
                                if (jugadorDorsal.getDorsal() == dorsal) {
                                    throw new ComprobarDorsalException();
                                }
                            }
                            Jugador jugador = new Jugador(nombre, edad, dorsal, posiciones);
                            listaJugadores.add(jugador);
                            System.out.println("Jugador añadido...");

                        } catch (IllegalArgumentException e) { // Doble catch para la excepción genérica y la personalizada.
                            System.out.println("ERROR: La posición no existe");
                            continue;
                        } catch (ComprobarDorsalException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        System.out.println("Deseas añadir más jugadores? S/N");
                        String siNo = teclado.nextLine().trim().toUpperCase();

                        if (siNo.equals("N")) {
                            break;
                        }
                    }
                    break;

                // MODIFICAR JUGADOR EXISTENTE
                case "2":
                    System.out.println("=== Mantenimiento de jugadores. Modificar datos del jugador existente ===");
                    System.out.println();
                    System.out.println("De qué jugador quieres hacer cambios?");
                    System.out.println();

                    for (int i = 0; i < listaJugadores.size(); i++) {
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

                    try {
                        System.out.println("Modificando jugador: [" + listaJugadores.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (IndexOutOfBoundsException e) {
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

                            try {
                                Equipos categoriaElegida = Equipos.valueOf(categoria);
                                jugador.setCategoria(categoriaElegida);
                                System.out.println("Categoria modificada...");
                            } catch (
                                    IllegalArgumentException e) {
                                System.out.println("ERROR: La categoria elegida no existe");
                            }
                            break;

                        case "dorsal":
                            System.out.println("Nuevo dorsal -->");
                            int dorsal = teclado.nextInt();
                            teclado.nextLine();

                            try {
                                for (Jugador jugadorDorsal : listaJugadores) {
                                    if (jugadorDorsal.getCategoria().equals(jugador.getCategoria()) && jugadorDorsal.getDorsal() == dorsal) { // Añadido la comprobación de la categoria con el dorsal.
                                        throw new ComprobarDorsalException();
                                    }
                                }
                                jugador.setDorsal(dorsal);
                                System.out.println("Dorsal modificado...");

                            } catch (
                                    ComprobarDorsalException e) {
                                System.out.println(e.getMessage());
                                break;
                            }

                            break;

                        case "posicion":
                            System.out.println("Nueva posición -->");
                            String posicion = teclado.nextLine().toUpperCase();

                            try {
                                Posiciones posicionElegida = Posiciones.valueOf(posicion);
                                jugador.setPosicion(posicionElegida);
                            } catch (
                                    IllegalArgumentException e) {
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

                    for (int i = 0; i < listaJugadores.size(); i++) {
                        Jugador jugadorAcompanyante = listaJugadores.get(i);
                        System.out.println("[" + i + ", Nombre: " + jugadorAcompanyante.getNombre() + "]");
                    }

                    String acompanyanteJugador = teclado.nextLine();

                    boolean jugadorEncontrado = false;
                    for (Jugador jugadorAcompanyante : listaJugadores) {
                        if (jugadorAcompanyante.getNombre().equals(acompanyanteJugador)) {
                            acompanyante.setIntegrante(jugadorAcompanyante);
                            jugadorEncontrado = true;
                            break;
                        }
                    }

                    if (!jugadorEncontrado) {
                        System.out.println("ERROR: El jugador no existe en la lista...");
                    }

                    System.out.println();

                    for (int i = 0; i < listaAcompanyantes.size(); i++) {
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
        while (true) {
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
                // AÑADIR ENTRENADOR
                case "1":
                    System.out.println("=== Mantenimiento de entrenadores. Añadir nuevo entrenador ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = teclado.nextLine().trim().toLowerCase();

                        System.out.println("Introduce la edad: ");
                        while (!teclado.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            teclado.nextLine();
                        }
                        int edad = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce formación preferida: ");
                        String formacion = teclado.nextLine();

                        try {
                            if (!formacion.matches("^\\d-\\d-\\d$")) {
                                throw new ComprobarFormacionException();
                            }

                            Entrenador entrenador = new Entrenador(nombre, edad, formacion);
                            listaEntrenadores.add(entrenador);
                            System.out.println("Entrenador añadido...");

                        } catch (ComprobarFormacionException e) {
                            System.out.println(e.getMessage());
                            break;
                        }

                        System.out.println("Deseas añadir más entrenadores? S/N");
                        String siNo = teclado.nextLine().trim().toUpperCase();

                        if (siNo.equals("N")) {
                            break;
                        }
                    }
                    break;

                // MODIFICAR ENTRENADOR
                case "2":
                    System.out.println("=== Mantenimiento de Entrenadores. Modificar datos del entrenador existente ===");
                    System.out.println();
                    System.out.println("De qué entrenador quieres hacer cambios?");
                    System.out.println();

                    for (int i = 0; i < listaEntrenadores.size(); i++) {
                        System.out.println("[" + i + ", " + listaEntrenadores.get(i) + "]");
                    }

                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    int opcionCambio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println();

                    System.out.println("=== Mantenimiento de entrenadores. Modificar datos del entrenador existente ===");
                    System.out.println();

                    try {
                        System.out.println("Modificando entrenador: [" + listaEntrenadores.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (
                            IndexOutOfBoundsException e) {
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    Entrenador entrenador = listaEntrenadores.get(opcionCambio); //Mostrar el entrenador en ese indice

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Equipo, Formacion]:");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioEntrenador = teclado.nextLine().toLowerCase();

                    switch (opcionCambioEntrenador) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            entrenador.setNombre(teclado.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            entrenador.setEdad(teclado.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "equipo":
                            System.out.println("Nuevo equipo -->");
                            String equipo = teclado.nextLine().toUpperCase();

                            try {
                                Equipos equipos = Equipos.valueOf(equipo);
                                entrenador.setEquipo(equipos);
                                System.out.println("Equipo modificado...");
                            } catch (
                                    IllegalArgumentException e) {
                                System.out.println("ERROR: El equipo elegido no existe");
                            }
                            break;

                        case "formacion":
                            System.out.println("Nueva formación -->");
                            String formacion = teclado.nextLine().toLowerCase();

                            try {
                                if (!formacion.matches("^\\d-\\d-\\d$")) {
                                    throw new ComprobarFormacionException();
                                }

                                entrenador.setFormacionPreferida(formacion);
                                System.out.println("Formación modificada...");

                            } catch (
                                    ComprobarFormacionException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            break;

                        default:
                            System.out.println("Opción incorrecta...");

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


    // Metodo para el menu del caso 3 (MANTENIMIENTO DE MASAJISTAS)
    public static void menuCase3 (Scanner teclado, ArrayList < Masajista > listaMasajistas){
        while (true) {
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
                // AÑADIR MASAJISTA
                case "1":
                    System.out.println("=== Mantenimiento de masajistas. Añadir nuevo masajista ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = teclado.nextLine().trim().toLowerCase();

                        System.out.println("Introduce la edad: ");
                        while (!teclado.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            teclado.nextLine();
                        }
                        int edad = teclado.nextInt();
                        teclado.nextLine();

                        System.out.println("Introduce titulación: ");
                        String titulacion = teclado.nextLine();

                        System.out.println("Introduce los años de experiencia: ");
                        while (!teclado.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            teclado.nextLine();
                        }
                        int anyosExperiencia = teclado.nextInt();
                        teclado.nextLine();

                        Masajista masajista = new Masajista(nombre, edad, titulacion, anyosExperiencia);
                        listaMasajistas.add(masajista);

                        System.out.println("Deseas añadir más masajistas? S/N");
                        String siNo = teclado.nextLine().trim().toUpperCase();

                        if (siNo.equals("N")) {
                            break;
                        }
                    }
                    break;

                // MODIFICAR MASAJISTA
                case "2":
                    System.out.println("=== Mantenimiento de masajistas. Modificar datos del masajista existente ===");
                    System.out.println();
                    System.out.println("De qué masajista quieres hacer cambios?");
                    System.out.println();

                    for (int i = 0; i < listaMasajistas.size(); i++) {
                        System.out.println("[" + i + ", " + listaMasajistas.get(i) + "]");
                    }

                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    int opcionCambio = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println();

                    System.out.println("=== Mantenimiento de masajistas. Modificar datos del masajista existente ===");
                    System.out.println();

                    try {
                        System.out.println("Modificando masajista: [" + listaMasajistas.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    Masajista masajista = listaMasajistas.get(opcionCambio); //Mostrar el entrenador en ese indice

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Titulacion, anyosExp]");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioMasajista = teclado.nextLine().toLowerCase();

                    switch (opcionCambioMasajista) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            masajista.setNombre(teclado.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            masajista.setEdad(teclado.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "titulacion":
                            System.out.println("Nueva titulación -->");
                            masajista.setTitulacion(teclado.nextLine());
                            System.out.println("Titulación modificada...");
                            break;

                        case "anyosexp":
                            System.out.println("Nueva formación -->");
                            masajista.setAnyosExperiencia(teclado.nextInt());
                            System.out.println("Años de experiencia modificados...");
                            break;

                        default:
                            System.out.println("Opción incorrecta...");
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


    // LISTADO DE EQUIPOS
    public static void menuCase4 (Scanner teclado, Equipos[] listaEquipos){

        System.out.println("====== Listado de equipos del VILLAJOYOSA C.F ======");
        System.out.println();

        for (Equipos equipos : listaEquipos) {
            System.out.println(equipos.name());
        }
        System.out.println();

        System.out.println("Qué equipo quieres?");
        String equipo = teclado.nextLine().toUpperCase().trim();
        System.out.println();
        
        try {
            Equipos equipoElegido = Equipos.valueOf(equipo);
            System.out.println("Has elegido el equipo " + equipoElegido.name() + "!");
        }catch (IllegalArgumentException e) {
            System.out.println("ERROR: El equipo elegido no existe...");
        }
        System.out.println();
    }
}