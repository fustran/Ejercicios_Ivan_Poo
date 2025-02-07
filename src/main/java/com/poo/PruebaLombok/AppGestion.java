package com.poo.PruebaLombok;

import java.util.ArrayList;

public class AppGestion {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("IES MUTXAMIEL", "Alicante", new ArrayList<>(), new ArrayList<>());
        instituto.getNombre();
        
        //Crear cursos
        Curso cursoJava = new Curso("Java", 100);
        System.out.println(cursoJava);
        Curso cursoPython = new Curso("Python", 70);
        System.out.println(cursoPython);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);


        //crear estudiantes
       try {
            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);

            //intento de crear un estudiante con nombre nulo (esto lanza NullPointerException)
            Estudiante estudianteErroneo = new Estudiante(null, 20, cursoJava);
            System.out.println(estudianteErroneo);

        } catch (NullPointerException e) {
            System.out.println("No se puede agregar estudiante con nombre nulo");
        }


        //intento de añadir un estudiante nulo en la lista de estudiantes
        instituto.agregarEstudiante(null);
        //intento de añadir un curso nulo en la lista de cursos
        instituto.agregarCurso(null);

        //mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());

        //mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());

    }
}