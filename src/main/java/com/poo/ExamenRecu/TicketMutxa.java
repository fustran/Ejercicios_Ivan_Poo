package com.poo.ExamenRecu;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class TicketMutxa {

    static private Set<Usuario> usuariosRegistrados = new LinkedHashSet<>();
    static private Set<Evento> listaEventos = new HashSet<>();

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

    public static void generarUsuarios(int cantidad) {

    }

    public static void verEventos(){
        for(Evento eventos : listaEventos) {
            System.out.println(eventos);
            System.out.println();
        }

    }

    public static void getEvento(int posicion){

    }

    public static void setListaEventos(Set<Evento> listaEventos) {
        TicketMutxa.listaEventos = listaEventos;
    }

    public static void setUsuariosRegistrados(Set<Usuario> usuariosRegistrados) {
        TicketMutxa.usuariosRegistrados = usuariosRegistrados;
    }
}