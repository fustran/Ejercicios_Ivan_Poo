package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {

    private static final Scanner TECLADO = new Scanner(System.in);

    // LISTAS ESTÁTICAS PARA PODER LLAMARLAS DEL MAIN
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

    /**
     * Metodo del menú principal para pasarle las listas a los metodos de los submenús
     */
    public static void iniciarMenus() {

        System.out.println("=== App de mantenimiento del MUTXAMIEL FC === ");
        System.out.println();

        while (true) {
            System.out.println("    [1]. Mantenimiento de jugadores"); // Añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).
            System.out.println("    [2]. Mantenimiento de entrenadores"); // Añadir entrenadores y modificar sus datos.
            System.out.println("    [3]. Mantenimiento de masajistas"); // Añadir masajistas y modificar sus datos.
            System.out.println("    [4]. Consultar equipos"); // Se deben listar los quipos del club y elegir uno.
            System.out.println("    [X]. Ejecutar la APP y Salir");

            System.out.println();
            System.out.println("=========================================");
            System.out.println();

            System.out.println("Selecciona una opción -->");
            String opcion = TECLADO.nextLine().toUpperCase().trim();

            System.out.println();

            boolean entradaValidaPrincipal = false;
            while (!entradaValidaPrincipal) {
                switch (opcion){
                    // LLAMADA AL SUBMENÚ 1
                    case "1":
                        menuCase1(LISTA_JUGADORES, LISTA_ACOMPANYANTES);
                        break;

                    // LLAMADA AL SUBMENÚ 2
                    case "2":
                        menuCase2(LISTA_ENTRENADORES);
                        break;

                    // LLAMADA AL SUBMENÚ 3
                    case "3":
                        menuCase3(LISTA_MASAJISTAS);
                        break;

                    // LLAMADA AL SUBMENÚ 4
                    case "4":
                        menuCase4(Equipos.values());
                        break;

                    // CASO PARA PODER SALIR DE LOS MENÚS Y EJECUTAR LAS INSTRUCCIONES DEL MAIN
                    case "X":
                        System.out.println("Ejecutando la aplicación...");
                        return;

                    default:
                        System.out.println("Opción incorrecta...");
                }
                entradaValidaPrincipal = true;
            }
        }
    }

    /**
     * Metodo para el menú del caso 1 (MANTENIMIENTO DE JUGADORES)
     * @param listaJugadores La lista de jugadores que recibe del menú principal
     * @param listaAcompanyantes La lista de acompañantes que recibe del menú principal
     */
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

                    // BUCLE PARA SEGUIR PIDIENDO EL NOMBRE MIENTRAS NO SE INTRODUZCAN DATOS CORRECTOS
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

                        // COMPROBACIÓN DE LA POSICIÓN EN EL ENUM Y QUE EL DORSAL NO SE REPITA EN EN ALGÚN JUGADOR DE LA LISTA
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

                        // DOBLE CATCH PARA LAS 2 COMPROBACIONES, LA GENÉRICA Y LA PERSONALIZADA
                        } catch (IllegalArgumentException e) {
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

                    // MUESTRA LA LISTA DE JUGADORES CON SU ÍNDICE
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

                    //COMPROBACION DE QUE EXISTE EL ÍNDICE QUE SE INTRODUCE
                    try {
                        System.out.println("Modificando jugador: [" + listaJugadores.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    // Coger el jugador con el índice que se ha introducido
                    Jugador jugador = listaJugadores.get(opcionCambio);

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Categoria, Dorsal, Posicion]:");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioJugador = TECLADO.nextLine().toLowerCase();

                    // SWITCH PARA LA ELECCÓN QUE SE HAYA ESCOGIDO Y PODER CAMBIAR SUS DATOS
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

                            // COMPROBACIÓN PARA NO REPETIR UN DORSAL RECORRIENDO LA LISTA DE JUGADORES
                            try {
                                for (Jugador jugadorDorsal : listaJugadores) {
                                    if (jugadorDorsal.getCategoria().equals(jugador.getCategoria()) && jugadorDorsal.getDorsal() == dorsal) {
                                        throw new ComprobarDorsalException();
                                    }
                                }
                                jugador.setDorsal(dorsal);
                                System.out.println("Dorsal modificado...");

                            } catch (ComprobarDorsalException e) {
                                System.out.println(e.getMessage());
                                break;
                            }
                            break;

                        case "posicion":
                            System.out.println("Nueva posición -->");
                            String posicion = TECLADO.nextLine().toUpperCase();

                            // COMPROBACIÓN PARA COMPRAR QUE EXISTE LA POSICIÓN EN EL ENUM
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

                // CREAR ACOMPAÑANTE Y VINCULARLO A UN JUGADOR
                case "3":
                    // AÑADIR NUEVO ACOMPAÑANTE
                    System.out.println("=== Mantenimiento de jugadores. Crear acompañante ===");
                    System.out.println();

                    // BUCLE PARA SEGUIR PIDIENDO EL NOMBRE MIENTRAS NO SE INTRODUZCAN DATOS CORRECTOS
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

                        System.out.println("Introduce el parentesco: ");
                        String parentesco = TECLADO.nextLine();

                        Acompanyante acompanyante = new Acompanyante(nombre, edad, parentesco);
                        listaAcompanyantes.add(acompanyante);

                        System.out.println();
                        System.out.println("De qué jugador eres acompañante?");

                        // FOR PARA RECORRER LOS JUGADORES DE LA LISTA
                        for (int i = 0; i < listaJugadores.size(); i++) {
                            Jugador jugadorAcompanyante = listaJugadores.get(i);
                            System.out.println("[" + i + ", Nombre: " + jugadorAcompanyante.getNombre() + "]");
                        }

                        String acompanyanteJugador = TECLADO.nextLine();

                        //FOR PARA RECORRER COMPROBAR QUE EL NOMBRE ELEGIDO EXISTE DENTRO DE LOS NOMBRES DE LA LISTA
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

                        //FOR PARA MOSTRAR EN FORMA DE STRING LOS DATOS DE LA LISTA DE ACOMPAÑANTES Y SU INTEGRANTE
                        for (int i = 0; i < listaAcompanyantes.size(); i++) {
                            Acompanyante acompanyantes = listaAcompanyantes.get(i);
                            System.out.println("[" + i + ", Nombre: " + acompanyantes.getNombre() +
                                    ", Edad: " + acompanyantes.getEdad() +
                                    ", Integrante " + acompanyantes.getIntegrante().getNombre() +
                                    ", Parentesco: " + acompanyantes.getParentesco() +
                                    "]");
                        }
                        System.out.println("Deseas añadir más acompañantes? S/N");
                        String siNo = TECLADO.nextLine().trim().toUpperCase();

                        if (siNo.equals("N")) {
                            break;
                        }
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

    /**
     * Metodo para el menu del caso 2 (MANTENIMIENTO DE ENTRENADORES)
     * @param listaEntrenadores La lista de entrenadores que es recibida del menú principal
     */
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

                    // BUCLE PARA SEGUIR PIDIENDO EL NOMBRE MIENTRAS NO SE INTRODUZCAN DATOS CORRECTOS
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

                        // COMPROBACION DEL FORMATO DE LA ALINEACIÓN
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

                // MODIFICAR ENTRENADOR EXISTENTE
                case "2":
                    System.out.println("=== Mantenimiento de Entrenadores. Modificar datos del entrenador existente ===");
                    System.out.println();
                    System.out.println("De qué entrenador quieres hacer cambios?");
                    System.out.println();

                    // MUESTRA LA LISTA DE ENTRENADORES CON SU ÍNDICE
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

                    //COMPROBACION DE QUE EXISTE EL ÍNDICE QUE SE INTRODUCE
                    try {
                        System.out.println("Modificando entrenador: [" + listaEntrenadores.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (
                            IndexOutOfBoundsException e) {
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    // Coger el entrenador con el índice que se ha introducido
                    Entrenador entrenador = listaEntrenadores.get(opcionCambio);

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Equipo, Formacion]:");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioEntrenador = TECLADO.nextLine().toLowerCase();

                    // SWITCH PARA LA ELECCÓN QUE SE HAYA ESCOGIDO Y PODER CAMBIAR SUS DATOS
                    switch (opcionCambioEntrenador) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            entrenador.setNombre(TECLADO.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Introduce la edad: ");
                            while (!TECLADO.hasNextInt()){
                                System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                                TECLADO.nextLine();
                            }
                            entrenador.setEdad(TECLADO.nextInt());
                            System.out.println("Edad modificada...");
                            TECLADO.nextLine();
                            break;

                        case "equipo":
                            System.out.println("Nuevo equipo -->");
                            String equipo = TECLADO.nextLine().toUpperCase();

                            // COMPROBACIÓN DE LOS EQUIPOS EN EL ENUM
                            try {
                                Equipos equipos = Equipos.valueOf(equipo);
                                entrenador.setEquipo(equipos);
                                System.out.println("Equipo modificado...");
                            } catch (IllegalArgumentException e) {
                                System.out.println("ERROR: El equipo elegido no existe");
                            }
                            break;

                        case "formacion":
                            System.out.println("Nueva formación -->");
                            String formacion = TECLADO.nextLine().toLowerCase();

                            // COMPROBACION DEL FORMATO DE LA ALINEACIÓN
                            try {
                                if (!formacion.matches("^\\d-\\d-\\d$")) {
                                    throw new ComprobarFormacionException();
                                }

                                entrenador.setFormacionPreferida(formacion);
                                System.out.println("Formación modificada...");

                            } catch (ComprobarFormacionException e) {
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

    /**
     * Metodo para el menu del caso 3 (MANTENIMIENTO DE MASAJISTAS)
     * @param listaMasajistas La lista de masajistas recibidas del menú principal
     */
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

                    // BUCLE PARA SEGUIR PIDIENDO EL NOMBRE MIENTRAS NO SE INTRODUZCAN DATOS CORRECTOS
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

                    // MUESTRA LA LISTA DE MASAJISTAS CON SU ÍNDICE
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

                    //COMPROBACION DE QUE EXISTE EL ÍNDICE QUE SE INTRODUCE
                    try {
                        System.out.println("Modificando masajista: [" + listaMasajistas.get(opcionCambio) + "]");
                        System.out.println();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("ERROR: El índice que has elegido no existe");
                    }

                    // Coger el masajista con el índice que se ha introducido
                    Masajista masajista = listaMasajistas.get(opcionCambio);

                    System.out.println("Qué quieres modificar? [Nombre, Edad, Titulacion, anyosExp]");
                    System.out.println();
                    System.out.println("=================================================");
                    System.out.println();
                    System.out.println("Selecciona una opción -->");
                    String opcionCambioMasajista = TECLADO.nextLine().toLowerCase();

                    // SWITCH PARA LA ELECCÓN QUE SE HAYA ESCOGIDO Y PODER CAMBIAR SUS DATOS
                    switch (opcionCambioMasajista) {
                        case "nombre":
                            System.out.println("Nuevo nombre -->");
                            masajista.setNombre(TECLADO.nextLine().trim().toLowerCase());
                            System.out.println("Nombre modificado...");
                            break;

                        case "edad":
                            System.out.println("Introduce la edad: ");
                            while (!TECLADO.hasNextInt()){
                                System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                                TECLADO.nextLine();
                            }
                            masajista.setEdad(TECLADO.nextInt());
                            System.out.println("Edad modificada...");
                            TECLADO.nextLine();
                            break;

                        case "titulacion":
                            System.out.println("Nueva titulación -->");
                            masajista.setTitulacion(TECLADO.nextLine());
                            System.out.println("Titulación modificada...");
                            break;

                        case "anyosexp":
                            System.out.println("Nuevos años de experiencia -->");
                            while (!TECLADO.hasNextInt()){
                                System.out.println("ERROR: Solo puedes introducir números. Vuelve a intentarlo...");
                                TECLADO.nextLine();
                            }
                            masajista.setAnyosExperiencia(TECLADO.nextInt());
                            System.out.println("Años de experiencia modificados...");
                            TECLADO.nextLine();
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

    /**
     * LISTADO DE EQUIPOS
     * @param listaEquipos La lista de equipos que existen dentro del enum
     */
    public static void menuCase4 (Equipos[] listaEquipos){

        System.out.println("====== Listado de equipos del MUTXAMIEL C.F ======");
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