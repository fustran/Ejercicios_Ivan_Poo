package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;

/**
 * Clase principal donde ejecutar cada metodo de la APP de mantenimiento
 */
public class AppMutxamielFC {
    public static void main(String[] args) {

        // INICIAR EL MENÚ
        AppMantenimiento.iniciarMenus();

        // PASAR LA LISTA DESDE LA CLASE APP PARA PODER USAR LOS METODOS DE CADA INSTANCIA DE LA CLASE, SINO NO PODIA ACCEDER A ELLOS.
        ArrayList<Jugador> jugadores = AppMantenimiento.getListaJugadores();
        ArrayList<Acompanyante> acompanyantes = AppMantenimiento.getListaAcompanyantes();
        ArrayList<Entrenador> entrenadores = AppMantenimiento.getListaEntrenadores();
        ArrayList<Masajista> masajistas = AppMantenimiento.getListaMasajistas();


        // CONCENTRARSE
        for (Jugador jugador : jugadores) {
            jugador.concentrarse();
        }

        for (Acompanyante acompanyante : acompanyantes) {
            acompanyante.concentrarse();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.concentrarse();
        }

        for (Masajista masajista : masajistas) {
            masajista.concentrarse();
        }


        // ENTRENAR
        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.entrenar();
        }


        // DAR MASAJE
        for (Masajista masajista : masajistas) {
            masajista.darMasaje(jugadores.getFirst()); // Dar masaje al primero de la lista
        }


        // VIAJAR A (MADRID)
        for (Jugador jugador : jugadores) {
            jugador.viajar("Madrid");
        }

        for (Acompanyante acompanyante : acompanyantes) {
            acompanyante.viajar("Madrid");
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.viajar("Madrid");
        }

        for (Masajista masajista : masajistas) {
            masajista.viajar("Madrid");
        }


        // PLANIFICAR ENTRENAMIENTO
        for (Entrenador entrenador : entrenadores) {
            entrenador.planificarEntrenamiento();
        }


        // ENTRENAR
        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.entrenar();
        }


        // DESCANSAR
        for (Jugador jugador : jugadores) {
            jugador.descansar();
        }


        // CALENTAR
        for (Jugador jugador : jugadores) {
            jugador.calentar();
        }


        // JUGAR PARTIDO
        for (Jugador jugador : jugadores) {
            jugador.jugarPartido("Real Madrid");
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.jugarPartido("Real Madrid");
        }


        // ANIMAR EQUIPO
        for (Acompanyante acompanyante : acompanyantes) {
            acompanyante.animarEquipo();
        }


        // HACER CAMBIOS
        for (Entrenador entrenador : entrenadores) {
            entrenador.hacerCambios();
        }


        // MARCAR GOL
        for (Jugador jugador : jugadores) {
            jugador.marcarGol();
        }


        // CELEBRAR GOL
        for (Jugador jugador : jugadores) {
            jugador.celebrarGol();
        }

        for (Acompanyante acompanyante : acompanyantes) {
            acompanyante.celebrarGol();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.celebrarGol();
        }

        for (Masajista masajista : masajistas) {
            masajista.celebrarGol();
        }


        // DAR MASAJE (VARIOS JUGADORES) Cada masajista le da un masaje a cada jugador, el primer masajista le da a todos los jugadores, si hubiese un 2º masajista, se volveria a iterar para darle a todos los jugaodores.
        for (Masajista masajista : masajistas) {
            for (Jugador jugador : jugadores) {
                masajista.darMasaje(jugador);
            }
        }


        // VIAJAR A (MUTXAMIEL)
        for (Jugador jugador : jugadores) {
            jugador.viajar("Mutxamiel");
        }

        for (Acompanyante acompanyante : acompanyantes) {
            acompanyante.viajar("Mutxamiel");
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.viajar("Mutxamiel");
        }

        for (Masajista masajista : masajistas) {
            masajista.viajar("Mutxamiel");
        }


        // DESCANSAR
        for (Jugador jugador : jugadores) {
            jugador.descansar();
        }

        System.out.println("SALIENDO DEL PROGRAMA...");
    }
}