package com.poo.T5_Introduccion_Poo.PruebaLombok;

public class AppGestion {
    public static void main(String[] args) {

        Instituto instituto = new Instituto(null,"Alicante");
        instituto.getNombre();
        /*instituto.setNombre();*/

        //Crear cursos
        Curso cursoJava = new Curso("Java", 100);
        System.out.println(cursoJava);

        Curso cursoPython = new Curso("Python", 70);
        System.out.println(cursoPython);

        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);
        instituto.agregarCurso(cursoJava);

        Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
        instituto.agregarEstudiante(estudiante1);

        Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
        instituto.agregarEstudiante(estudiante2);


        //Añadir un estudiante nulo en la lista de estudiantes
        try {
            instituto.agregarEstudiante(null);
        }catch (NullPointerException e) {
            System.out.println("Error: Estudiante no puede ser Nulo");
        }

        //Añadir un curso nulo en la lista de cursos
        try {
            instituto.agregarCurso(null);
        }catch (NullPointerException e) {
            System.out.println("Error: Curso no puede ser Nulo");
        }

        //mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());

        //mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
    }
}