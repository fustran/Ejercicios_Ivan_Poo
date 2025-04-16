package com.poo.ExamenRecu;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import lombok.*;

public class TicketMutxa {

    @Getter
    private static Set<Usuario> usuariosRegistrados = new LinkedHashSet<>();
    @Getter
    private static Set<Evento> listaEventos = new HashSet<>();

    public static void insertarEvento(String nombre, LocalDate fecha, double precio, String tipo){

        if (tipo.equalsIgnoreCase("Concierto")){
            Concierto concierto = new Concierto(nombre, fecha, precio, tipo);
            listaEventos.add(concierto);

        }else if (tipo.equalsIgnoreCase("Festival")){
            Festival festival = new Festival(nombre, fecha, precio, tipo);
            listaEventos.add(festival);

        }else{
            System.out.println("No existe el tipo de evento");
        }
    }


    static Random aleatorios = new Random();
    static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void generarUsuarios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            String nombre_usuario = "";

            while (nombre_usuario.length() < 8) {
                int indice = aleatorios.nextInt(CARACTERES.length());
                char caracter = CARACTERES.charAt(indice);

                if (nombre_usuario.indexOf(caracter) == -1) {
                    nombre_usuario += caracter;
                }
            }

            String contraseya = "";
            while (contraseya.length() < 8) {
                int indice = aleatorios.nextInt(CARACTERES.length());
                char caracter = CARACTERES.charAt(indice);

                if (contraseya.indexOf(caracter) == -1) {
                    contraseya += caracter;
                }
            }
            System.out.println("Chivato de Usuarios generados -- " + nombre_usuario + " " + contraseya);
            usuariosRegistrados.add(new Usuario(nombre_usuario, contraseya));
        }
    }

    public static void verEventos(){
        for(Evento eventos : listaEventos) {
            System.out.println(eventos);
            System.out.println();
        }
    }

    public static void getEvento(int posicion) {

    }

}