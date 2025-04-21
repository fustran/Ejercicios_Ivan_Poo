package com.poo.ExamenRecu;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import lombok.*;
import static java.lang.System.*;

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
            out.println("No existe el tipo de evento");
        }
    }


    static Random aleatorios = new Random();
    static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void generarUsuarios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            StringBuilder nombreUsuario = new StringBuilder();

            while (nombreUsuario.length() < 8) {
                int indice = aleatorios.nextInt(CARACTERES.length());
                char caracter = CARACTERES.charAt(indice);

                if (nombreUsuario.toString().indexOf(caracter) == -1) {
                    nombreUsuario.append(caracter);
                }
            }

            StringBuilder contraseya = new StringBuilder();
            while (contraseya.length() < 8) {
                int indice = aleatorios.nextInt(CARACTERES.length());
                char caracter = CARACTERES.charAt(indice);

                if (contraseya.toString().indexOf(caracter) == -1) {
                    contraseya.append(caracter);
                }
            }
            usuariosRegistrados.add(new Usuario(nombreUsuario.toString(), contraseya.toString()));
        }
    }

    public static void verEventos(){
        for(Evento eventos : listaEventos) {
            out.println(eventos);
            out.println();
        }
    }

    public static void getEvento(int posicion) {

    }

    public static void mostrarUsuariosRegistrados(){
        for (Usuario usuariosRegistrados : usuariosRegistrados){
            out.println(usuariosRegistrados);
        }
    }

}