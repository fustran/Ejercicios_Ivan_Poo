package com.poo.T5_Introduccion_Poo.Practica_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    private static final Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        setFechaVisita(); // a) Modifica el constructor de Invitados para que llame al set de fecha_visita
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

    // a.1) Fecha que levamos a preguntar al usuario para guardar cuándo tienen que ir al Programa.
    public void setFechaVisita() {
        System.out.println("Introduce el año en el que acudirá el invitado " + getNombre() + ":");
        int anyo = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        int mes = teclado.nextInt();

        System.out.println("Introduce el día: ");
        int dia = teclado.nextInt();

        this.fechaVisita = LocalDate.of(anyo, mes, dia);
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    @Override
    public String toString() {
        return "\nInvitado: " +
                        "[Nombre = " + getNombre() +
                        ", Profesión = " + getProfesion() +
                        ", FechaVisita = " + getFechaVisita() +
                        ", Temporada = " + getTemporada() +
                        "]";
    }
}