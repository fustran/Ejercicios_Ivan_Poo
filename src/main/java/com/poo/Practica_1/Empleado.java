package com.poo.Practica_1;

public class Empleado {

    private static final String ID_EMPLEADO = "EP";
    private String nombre;
    private static String cargo;
    private Empleado director;

    public Empleado(String nombre, Empleado director) {
        this.nombre = nombre;
        this.director = director;
    }

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String cargo) {
        Empleado.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                    "[Nombre = " + getNombre() +
                    ", Cargo = " + getCargo() +
                    ", Director = " + getDirector() +
                    "]";
    }
}