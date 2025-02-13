package com.poo.T5_Introduccion_Poo.Practica_1;

import java.util.ArrayList;
import java.time.LocalDate;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;

        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        this.director = new Empleado(director, "director", null);
        listaEmpleados.add(this.director);

        cadena.agregarPrograma(this);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        if (director == null) {
            director = this.director;
        }
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }


    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }


    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    public void invitadosTemporada(int temporada) {

        int  contador = 0;
        System.out.println();

        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                   System.out.println("Nombre: " + invitado.getNombre() + ", Profesión: " + invitado.getProfesion());
                   contador++;
            }
            if (contador == 0) {
                System.out.println("No ha habido invitad@s a: " + getNombre());
            }
        }

        System.out.println(getNombre() + ", " + "Temporada: " + temporada + ", " + "Invitad@s: " + contador);
    }


    public int vecesInvitado(String nombre) {

        int contador = 0;

        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                contador++;
            }else {
                System.out.println(nombre + " no ha ido nunca a: " + getNombre());
            }
        }

        return contador;
    }


    public void rastrearInvitado(String nombre) {

        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                System.out.println(invitado.getNombre() + ":" + " Ha sido invitad@ " + vecesInvitado(nombre) + " vez/es" + " a: " + getNombre() + ", Con fecha: " + invitado.getFechaVisita() + ", En la temporada: " + invitado.getTemporada());
            }else{
                System.out.println(nombre + " no ha sido invitado nunca");
            }
        }
    }


    public boolean buscarInvitado(String nombre) {

        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                return true;
            }
        }

        return false;
    }


    public void invitadoAntes(String nombre) {

        Programa primerPrograma = this;
        LocalDate fechaMasAntigua = null;

        for (Programa programa : cadena.getListaProgramas()) {

            if (programa.buscarInvitado(nombre)) {
                for (Invitado invitado : programa.getListaInvitados()) {

                    if (invitado.getNombre().equals(nombre)) {
                        LocalDate fechaActual = invitado.getFechaVisita();

                        if (fechaMasAntigua == null || fechaActual.isBefore(fechaMasAntigua)) {
                            fechaMasAntigua = fechaActual;
                            primerPrograma = programa;
                        }
                    }
                }
            }
        }

        System.out.println("Búsqueda = " + nombre + " estuvo primero en " + primerPrograma.getNombre() + " el " + fechaMasAntigua);
    }


    @Override
    public String toString() {
        return "Programa: " +
                        "[Nombre = " + getNombre() +
                        ", Cadena = " + cadena.getNombre() +
                        ", Director = " + getDirector()  +
                        ", Temporada = " + getTemporadas()  +
                        ", ListaEmpleados = " + getListaEmpleados()  +
                        ", ListaInvitados = " + getListaInvitados()  +
                        "]";
    }
}