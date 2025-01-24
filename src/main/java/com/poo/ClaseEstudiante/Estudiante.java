package com.poo.ClaseEstudiante;

public class Estudiante {

    private static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private final int nia;
    private String email;

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        nia = contadorEstudiantes; // al no ser pasado como atributo no hace falta el this.
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes; // al no ser pasado como atributo no hace falta el this.
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

    @Override
    public String toString() {
        return "Estudiante : [nombre = " + getNombre() + ", Curso = " + getCurso() + ", NIA = " + getNia() + ", Email = " + getEmail() + "]";
    }

    public static Boolean validarEmail(String email) {
        return email.matches(CORREO_VALIDO);
    }
}
