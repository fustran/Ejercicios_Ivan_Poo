package com.poo.Libro;

import com.poo.Editorial.Editorial;
import com.poo.Estudiante.Estudiante;
import com.poo.Prestamo.Prestamo;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private final String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorialLibro;

    public Libro(String titulo, String autor, Editorial editorialLibro) {
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        this.id = generarIdLibro(); //calcular ID libro.
        estudiantePrestado = null;
        this.editorialLibro = editorialLibro;
    }

    private String generarIdLibro() {
        return ID_LIBROS + String.format("%03d", cantidadLibros);
    }

    public void prestar(Estudiante estudiante) {

        if(disponible && estudiante.getLibroPrestado() == null) {
            disponible = false;
            System.out.println("El libro: " + getTitulo() + " ha sido prestado con éxito a: " + estudiante.getNombre());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibroPrestado(this);

            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha registrado el préstamo con fecha: " + prestamo);

        }else if(estudiante.getLibroPrestado() != null){
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado.");

        }else{
            System.out.println("El libro: " + getTitulo() + " no se puede prestar (No disponible).");
        }
    }

    public void devolver(Estudiante estudiante) {
        if(!disponible) {
            disponible = true;
            System.out.println("El libro: " + getTitulo() + " ha sido devuelto con éxito por " + estudiantePrestado.getNombre());
            librosDisponibles++;
            estudiantePrestado = null;
            estudiante.setLibroPrestado(null);
        }else {
            System.out.println("El libro: " + getTitulo() + " no se puede devolver. Está disponible");
        }
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void estaDisponible() {
        if(getDisponible()) {
            System.out.println("El libro " + getDisponible() + "está disponible");
        }else{
            System.out.println("El libro " + getDisponible() + "no está disponible");
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Editorial getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(Editorial editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    @Override
    public String toString() { //Ternaria para comprar la condición, si es true or false.
        String estudianteInfo = (getEstudiantePrestado() != null) ? getEstudiantePrestado().getNombre() : "Ninguno";
        return "Libro: [Título = " + getTitulo() +
                ", Autor = " + getAutor() +
                ", ID = " + getId() +
                ", Disponible = " + getDisponible() +
                ", Estudiante Prestado = " + estudianteInfo + "]";
    }
}