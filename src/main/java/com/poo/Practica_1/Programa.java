package com.poo.Practica_1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> empleado = null;
    private ArrayList<Invitado> invitado = null;
    private ArrayList<Empleado> director;


    public Programa(String nombre, Cadena cadena, int temporadas, ArrayList<Empleado> empleado, ArrayList<Invitado> invitado, ArrayList<Empleado> director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.empleado = empleado;
        this.invitado = invitado;
        this.director = director;
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

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Invitado> getInvitado() {
        return invitado;
    }

    public void setInvitado(ArrayList<Invitado> invitado) {
        this.invitado = invitado;
    }

    public ArrayList<Empleado> getDirector() {
        return director;
    }

    public void setDirector(ArrayList<Empleado> director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa: " +
                    "[Nombre = " + getNombre() +
                    ", Cadena = " + getCadena() +
                    ", Temporadas = " + getTemporadas() +
                    ", Empleado = " + getEmpleado() +
                    ", Invitado = " + getInvitado() +
                    ", Director = " + getDirector() +
                    "]";
    }
}