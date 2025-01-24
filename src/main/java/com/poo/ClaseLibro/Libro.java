package com.poo.ClaseLibro;

/**
 * Clase Libro que contiene los atributos y métodos de un libro.
 * @autor <b>Poo</b>
 * @version 1.0, 29/09/2021
 */
public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private final String id;
    private boolean disponible;


    /**
     * Constructor de la clase Libro
     * @param titulo recibe el título del libro para asignarlo al objeto.
     * @param autor recibe el autor del libro para asignarlo al objeto.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        this.id = generarIdLibro();
    }

    /**
     * Metodo para generar un ID para el libro llamando a la constante ID_LIBROS y concatenando un número con la variable que pertenece a la clase.
     * @return El ID generado.
     */
    private String generarIdLibro() {
       return ID_LIBROS + String.format("%03d", cantidadLibros);
    }

    /**
     * Metodo estático que devuelve la cantidad de libros que se han creado a nivel de clase.
     * @return El total de libros que se han creado.
     */
    public static int getTotalLibros() {
        return cantidadLibros;
    }

    /**
     * Metodo estático que devuelve la cantidad de libros disponibles a nivel de clase.
     * @return El total de libros disponibles.
     */
    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    /**
     * @return retorna el título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo recibe el título del libro para asignarlo al objeto.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor recibe el autor del libro para asignarlo al objeto.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return El ID del libro.
     */
    public String getId() {
        return id;
    }

    /**
     * @return El libro disponible.
     */
    public boolean getDisponible() {
        return disponible;
    }

    /**
     * @param disponible Recibe un booleano para asignar si el libro está disponible o no.
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @override Es una anotación que indica que estás sobrescribiendo un metodo de la clase padre (en este caso, toString de Object).
     * @return retorna un mensaje con la información del libro.
     */
    @Override
    public String toString(){
        return "Libro :  [Título = " + getTitulo() + ", Autor = " + getAutor() + ", ID = " + getId() + ", Disponible = " + getDisponible() + "]";
    }
}