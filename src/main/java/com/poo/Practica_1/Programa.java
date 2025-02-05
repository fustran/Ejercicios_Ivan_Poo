package com.poo.Practica_1;

import java.util.ArrayList;

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

        this.director = new Empleado("Director1", "director", null);
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