package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    private static final Scanner TECLADO = new Scanner(System.in);

    private static final ArrayList<Jugador> LISTA_JUGADORES = new ArrayList<>();
    private static final ArrayList<Acompanyante> LISTA_ACOMPANYANTES = new ArrayList<>();
    private static final ArrayList<Entrenador> LISTA_ENTRENADORES = new ArrayList<>();
    private static final ArrayList<Masajista> LISTA_MASAJISTAS = new ArrayList<>();


    public static ArrayList<Jugador> getListaJugadores() {
        return LISTA_JUGADORES;
    }

    public static ArrayList<Acompanyante> getListaAcompanyantes() {
        return LISTA_ACOMPANYANTES;
    }

    public static ArrayList<Entrenador> getListaEntrenadores() {
        return LISTA_ENTRENADORES;
    }

    public static ArrayList<Masajista> getListaMasajistas() {
        return LISTA_MASAJISTAS;
    }

    public static void iniciarMenus() {

        System.out.println("=== App de mantenimiento del VILLAJOYOSA FC === :D");
        System.out.println();

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
            String opcion = TECLADO.nextLine().toUpperCase().trim();

            System.out.println();

            boolean entradaValidaPrincipal = false;
            while (!entradaValidaPrincipal) {
                switch (opcion){
                    case "1":
                        menuCase1(LISTA_JUGADORES, LISTA_ACOMPANYANTES); // Llamada al metodo del caso 1
                        break;

                    case "2":
                        menuCase2(LISTA_ENTRENADORES); // Llamada al metodo del caso 2
                        break;

                    case "3":
                        menuCase3(LISTA_MASAJISTAS); // Llamada al metodo del caso 3
                        break;

                    case "4":
                        menuCase4(Equipos.values()); // Llamada al metodo del caso 4
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
    public static void menuCase1(ArrayList<Jugador> listaJugadores, ArrayList<Acompanyante> listaAcompanyantes) {
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

            String opcion = TECLADO.nextLine().toUpperCase().trim();

            switch (opcion) {
                // AÑADIR NUEVO JUGADOR
                case "1":
                    System.out.println("=== Mantenimiento de jugadores. Añadir nuevo jugador ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = TECLADO.nextLine().trim().toLowerCase();

                        System.out.println("Introduce la edad: ");
                        while (!TECLADO.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int edad = TECLADO.nextInt();
                        TECLADO.nextLine();

                        System.out.println("Introduce el dorsal: ");
                        while (!TECLADO.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int dorsal = TECLADO.nextInt();
                        TECLADO.nextLine();

                        System.out.println("Introduce la posición: ");
                        String posicion = TECLADO.nextLine().trim().toUpperCase();

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
                            jugador.concentrarse();

                        } catch (IllegalArgumentException e) { // Doble catch para la excepción genérica y la personalizada.
                            System.out.println("ERROR: La posición no existe");
                            continue;
                        } catch (ComprobarDorsalException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }

                        System.out.println("Deseas añadir más jugadores? S/N");
                        String siNo = TECLADO.nextLine().trim().toUpperCase();

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
                    int opcionCambio = TECLADO.nextInt();
                    TECLADO.nextLine();

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
                    String opcionCambioJugador = TECLADO.nextLine().toLowerCase();

                    switch (opcionCambioJugador) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            jugador.setNombre(TECLADO.nextLine().trim());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            jugador.setEdad(TECLADO.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "categoria":
                            System.out.println("Nueva categoría -->");
                            String categoria = TECLADO.nextLine().toUpperCase();

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
                            int dorsal = TECLADO.nextInt();
                            TECLADO.nextLine();

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
                            String posicion = TECLADO.nextLine().toUpperCase();

                            try {
                                Posiciones posicionElegida = Posiciones.valueOf(posicion);
                                jugador.setPosicion(posicionElegida);
                                System.out.println("Posición modificada....");
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

                    String acompanyanteJugador = TECLADO.nextLine();

                    boolean jugadorEncontrado = false;
                    for (Jugador jugadorAcompanyante : listaJugadores) {
                        if (jugadorAcompanyante.getNombre().equals(acompanyanteJugador)) {
                            acompanyante.setIntegrante(jugadorAcompanyante);
                            System.out.println("Acompañante añadido...");
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
    public static void menuCase2(ArrayList<Entrenador> listaEntrenadores) {
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
            String opcion = TECLADO.nextLine().toUpperCase().trim();
            switch (opcion) {
                // AÑADIR ENTRENADOR
                case "1":
                    System.out.println("=== Mantenimiento de entrenadores. Añadir nuevo entrenador ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = TECLADO.nextLine().trim().toLowerCase();

                        System.out.println("Introduce la edad: ");
                        while (!TECLADO.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int edad = TECLADO.nextInt();
                        TECLADO.nextLine();

                        System.out.println("Introduce formación preferida: ");
                        String formacion = TECLADO.nextLine();

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
                        String siNo = TECLADO.nextLine().trim().toUpperCase();

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
                    int opcionCambio = TECLADO.nextInt();
                    TECLADO.nextLine();

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
                    String opcionCambioEntrenador = TECLADO.nextLine().toLowerCase();

                    switch (opcionCambioEntrenador) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            entrenador.setNombre(TECLADO.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            entrenador.setEdad(TECLADO.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "equipo":
                            System.out.println("Nuevo equipo -->");
                            String equipo = TECLADO.nextLine().toUpperCase();

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
                            String formacion = TECLADO.nextLine().toLowerCase();

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
    public static void menuCase3 (ArrayList < Masajista > listaMasajistas){
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
            String opcion = TECLADO.nextLine().toUpperCase().trim();
            switch (opcion) {
                // AÑADIR MASAJISTA
                case "1":
                    System.out.println("=== Mantenimiento de masajistas. Añadir nuevo masajista ===");
                    System.out.println();

                    while (true) {
                        System.out.println("Introduce el nombre: ");
                        String nombre = TECLADO.nextLine().trim().toLowerCase();

                        System.out.println("Introduce la edad: ");
                        while (!TECLADO.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int edad = TECLADO.nextInt();
                        TECLADO.nextLine();

                        System.out.println("Introduce titulación: ");
                        String titulacion = TECLADO.nextLine();

                        System.out.println("Introduce los años de experiencia: ");
                        while (!TECLADO.hasNextInt()){
                            System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int anyosExperiencia = TECLADO.nextInt();
                        TECLADO.nextLine();

                        Masajista masajista = new Masajista(nombre, edad, titulacion, anyosExperiencia);
                        listaMasajistas.add(masajista);

                        System.out.println("Deseas añadir más masajistas? S/N");
                        String siNo = TECLADO.nextLine().trim().toUpperCase();

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
                    int opcionCambio = TECLADO.nextInt();
                    TECLADO.nextLine();

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
                    String opcionCambioMasajista = TECLADO.nextLine().toLowerCase();

                    switch (opcionCambioMasajista) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            masajista.setNombre(TECLADO.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Nueva edad -->");
                            masajista.setEdad(TECLADO.nextInt());
                            System.out.println("Edad modificada...");
                            break;

                        case "titulacion":
                            System.out.println("Nueva titulación -->");
                            masajista.setTitulacion(TECLADO.nextLine());
                            System.out.println("Titulación modificada...");
                            break;

                        case "anyosexp":
                            System.out.println("Nueva formación -->");
                            masajista.setAnyosExperiencia(TECLADO.nextInt());
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
    public static void menuCase4 (Equipos[] listaEquipos){

        System.out.println("====== Listado de equipos del VILLAJOYOSA C.F ======");
        System.out.println();

        for (Equipos equipos : listaEquipos) {
            System.out.println(equipos.name());
        }
        System.out.println();

        System.out.println("Qué equipo quieres?");
        String equipo = TECLADO.nextLine().toUpperCase().trim();
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