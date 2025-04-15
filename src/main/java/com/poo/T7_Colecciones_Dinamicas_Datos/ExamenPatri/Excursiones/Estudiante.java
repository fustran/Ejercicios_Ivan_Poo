package com.poo.T7_Colecciones_Dinamicas_Datos.ExamenPatri.Excursiones;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Scanner;

@Getter
@Setter
public class Estudiante implements Comparable<Estudiante>{

    static Scanner teclado = new Scanner(System.in);

    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    public Estudiante(){
        System.out.println("\nCreando estudiante...");
        setApellidos();
        setNombre();
        setCurso();
        setEdad();
        teclado.nextLine();
    }

    private void setEdad() {
        System.out.println("Inserta su edad: ");
        this.edad = teclado.nextInt();
    }

    private void setCurso() {
        System.out.println("Inserta el curso: ");
        this.curso = teclado.next();
    }

    private void setNombre() {
        System.out.println("Inserta el nombre: ");
        this.nombre = teclado.next();
    }

    private void setApellidos() {
        System.out.println("Inserta los apellidos: ");
        this.apellidos = teclado.nextLine();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(apellidos, that.apellidos) && Objects.equals(nombre, that.nombre) && Objects.equals(curso, that.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, nombre, curso);
    }

    @Override
    public int compareTo(Estudiante o) {

        int comparacionCurso = curso.compareTo(o.getCurso());

        if (comparacionCurso!=0){
            return comparacionCurso;
        }

        return apellidos.compareTo(o.getApellidos());

    }

}