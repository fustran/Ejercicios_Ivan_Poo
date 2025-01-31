package com.poo.Biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante estudiantePrestamo;
    private Libro libroPrestamo;
    private final LocalDate fechaPrestamo;

    public Prestamo(Estudiante estudiante, Libro libro) {

        this.estudiantePrestamo = estudiante;
        this.libroPrestamo = libro;
        fechaPrestamo = LocalDate.now();
    }

    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Estudiante getEstudiantePrestamo() {
        return estudiantePrestamo;
    }

    public void setEstudiantePrestamo(Estudiante estudiantePrestamo) {
        this.estudiantePrestamo = estudiantePrestamo;
    }

    @Override
    public String toString() {
        return "Préstamo: [Nombre = " + getEstudiantePrestamo() +
        ", Pais = " + getLibroPrestamo() +
        ", Fecha = " + getFechaPrestamo() + "]";
    }
}