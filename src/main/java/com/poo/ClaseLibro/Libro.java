package com.poo.ClaseLibro;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String ID_LIB = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        this.id = generarIdLibro();
    }

   private String generarIdLibro() {
//        if (cantidadLibros < 10) {
//            return ID_LIB + "00" + cantidadLibros;
//        } else if (cantidadLibros < 100) {
//            return ID_LIB + "0" + cantidadLibros;
//        } else {
//            return ID_LIB + cantidadLibros;
//        }
       return ID_LIB + String.format("%03d", cantidadLibros);
   }

   public String toString(){
        return "Libro :  [Título = "]
   }
}