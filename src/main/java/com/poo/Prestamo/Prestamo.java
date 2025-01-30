package com.poo.Prestamo;

import java.time.LocalDate;
import com.poo.Estudiante.Estudiante;
import com.poo.Libro.Libro;

public class Prestamo {

    private Estudiante estudiantePrestamo;
    private Libro libro;
    private final LocalDate fecha;

    public Prestamo(Estudiante estudiante, Libro libro) {

        this.estudiantePrestamo = estudiante;
        this.libro = libro;
        fecha = LocalDate.now();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
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
        ", Pais = " + getLibro() +
        ", Fecha = " + getFecha() + "]";
    }
}