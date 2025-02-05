package com.poo.Practica_1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> empleado = null;
    private ArrayList<Invitado> invitado = null;
    private final Empleado director;

    public Programa(String nombre, Cadena cadena, Empleado director) {
        this.nombre = nombre;
        this.cadena = cadena;
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

    @Override
    public String toString() {
        return "Programa: " +
                    "[Nombre = " + getNombre() +
                    ", Cadena = " + getCadena() +
                    ", Temporadas = " + getTemporadas() +
                    ", Empleado = " + getEmpleado() +
                    ", Invitado = " + getInvitado() +
                    ", Director = " + Empleado.getCargo() +
                    "]";
    }

    public Empleado getDirector() {
        return director;
    }
}