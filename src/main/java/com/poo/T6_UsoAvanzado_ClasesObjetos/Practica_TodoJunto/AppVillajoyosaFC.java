package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.ArrayList;

public class AppVillajoyosaFC {
    public static void main(String[] args) {

        // INICIAR EL MENÚ
        AppMantenimiento.iniciarMenus();

        // PASAR LA LISTA DESDE LA CLASE APP PARA PODER USAR LOS METODOS DE CADA INSTANCIA DE LA CLASE, SINO NO PODIA ACCEDER A ELLOS.
        ArrayList<Jugador> jugadores = AppMantenimiento.getListaJugadores();
        ArrayList<Acompanyante> acompanyantes = AppMantenimiento.getListaAcompanyantes();
        ArrayList<Entrenador> entrenadores = AppMantenimiento.getListaEntrenadores();
        ArrayList<Masajista> masajistas = AppMantenimiento.getListaMasajistas();


        // CONCENTRARSE
        for (Jugador jugador : jugadores){
            jugador.concentrarse();
        }

        for (Acompanyante acompanyante : acompanyantes){
            acompanyante.concentrarse();
        }

        for (Entrenador entrenador : entrenadores){
            entrenador.concentrarse();
        }

        for(Masajista masajista : masajistas){
            masajista.concentrarse();
        }



        // ENTRENAR
        for(Jugador jugador : jugadores){
            jugador.entrenar();
        }

        for (Entrenador entrenador : entrenadores){
            entrenador.entrenar();
        }



        // DAR MASAJE
        String nombreJugador = "Ivan";
        for (Masajista masajista : masajistas) {
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombreJugador)) {
                    masajista.darMasaje(jugador);
                    break;
                }else{
                    System.out.println("El jugador no existe...");
                }
            }
        }


        // VIAJAR A (MADRID)
        for (Jugador jugador : jugadores){
            jugador.viajar("Madrid");
        }

        for (Acompanyante acompanyante : acompanyantes){
            acompanyante.viajar("Madrid");
        }

        for (Entrenador entrenador : entrenadores){
            entrenador.viajar("Madrid");
        }

        for(Masajista masajista : masajistas){
            masajista.viajar("Madrid");
        }


        // PLANIFICAR ENTRENAMIENTO


        // ENTRENAR


        // DESCANSAR


        // CALENTAR


        // JUGAR PARTIDO


        // ANIMAR EQUIPO


        // HACER CAMBIOS


        // MARCAR GOL


        // CELEBRAR GOL


        // DAR MASAJE (VARIOS JUGADORES)


        // VIAJAR A (MUTXAMIEL)


        // DESCANSAR
    }
}