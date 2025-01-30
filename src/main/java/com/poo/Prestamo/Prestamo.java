package com.poo.Prestamo;

import java.time.LocalDate;
import com.poo.Estudiante.Estudiante;
import com.poo.Libro.Libro;

public class Prestamo {

    private Estudiante estudiantePrestamo;
    private Libro libroPrestamo;
    private final LocalDate fechaPrestamo;

    public Prestamo(Estudiante estudiante, Libro libro) {

        this.estudiantePrestamo = estudiante;
        this.libroPrestamo = libro;
        fechaPrestamo = LocalDate.now();
    }

    public Estudiante getEstudiantePrestamo() {
        return estudiantePrestamo;
    }

    public void setEstudiantePrestamo(Estudiante estudiantePrestamo) {
        this.estudiantePrestamo = estudiantePrestamo;
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

    @Override
    public String toString() {
        return "Préstamo: [Nombre = " + getEstudiantePrestamo() +
        ", Pais = " + getLibroPrestamo() +
        ", Fecha = " + getFechaPrestamo() + "]";
    }
}