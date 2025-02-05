package com.poo.Practica_1;

import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;

    public Invitado(String nombre, String profesion, LocalDate fechaVisita, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fechaVisita = fechaVisita;
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado: " +
                    "[Nombre = " + getNombre() +
                    ", Profesión = " + getProfesion() +
                    ", Fecha Visita = " + getFechaVisita() +
                    ", Temporada = " + getTemporada() +
                    "]";
    }
}