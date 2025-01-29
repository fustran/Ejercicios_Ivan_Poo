package com.poo.Prestamo;

import java.time.LocalDateTime;
import com.poo.Estudiante.Estudiante;
import com.poo.Libro.Libro;

public class Prestamo {

    private Estudiante estudiantePrestamo;
    private Libro libroPrestamo;
    private LocalDateTime fechaPrestamo;

    public Prestamo(Estudiante estudiante, Libro libro, LocalDateTime fecha) {

        this.estudiantePrestamo = estudiante;
        this.libroPrestamo = libro;
        this.fechaPrestamo = fecha;
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

    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

   /* @Override
    public String toString() {
        return "Préstamo: [Nombre = " + getEstudiantePrestamo() + ", Pais = " + getLibroPrestamo() + ", Fecha = " + getFechaPrestamo() + "]";
    }*/
}