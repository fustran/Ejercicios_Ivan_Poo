package com.poo.Estudiante;

import com.poo.Libro.Libro;
import java.util.ArrayList;

public class Estudiante {

    private static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private final int nia;
    private String email;
    private Libro libroPrestado; // Relación con la clase libro
    private ArrayList<Libro> LibrosPrestados = new ArrayList<>();


    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        nia = contadorEstudiantes; // al no ser pasado como atributo no hace falta el this.
        libroPrestado = null;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes; // al no ser pasado como atributo no hace falta el this.

    }

    public static Boolean validarEmail(String email) {
        return email.matches(CORREO_VALIDO);
    }

    public static int getContadorEstudiantes() {
        return contadorEstudiantes;
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getNia() {
        return nia;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString() {
        String libroInfo = (getLibroPrestado() != null) ? getLibroPrestado().getTitulo() : "Ninguno";
        return "Estudiante: [Nombre = " + getNombre() +
                ", Curso = " + getCurso() +
                ", NIA = " + getNia() +
                ", Email = " + getEmail() +
                ", Libro Prestado = " + libroInfo + "]";
    }
}