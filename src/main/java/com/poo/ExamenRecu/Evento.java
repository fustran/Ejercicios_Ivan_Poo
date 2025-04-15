package com.poo.ExamenRecu;

import java.time.LocalDate;

public abstract class Evento {

    private String nombre;
    private LocalDate fecha;
    private double precio;

    public Evento(String nombre, LocalDate fecha, double precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

}