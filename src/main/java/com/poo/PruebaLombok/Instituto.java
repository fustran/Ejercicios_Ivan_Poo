package com.poo.PruebaLombok;

import lombok.*;
import java.util.ArrayList;
import java.util.Objects;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private ArrayList<Estudiante> listaEstudiantes;
    @Setter
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre, String poblacion) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion = poblacion;
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
    }


    public void agregarEstudiante(@NonNull Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(@NonNull Curso curso) {

        for (Curso cursos : listaCursos) {
            if (cursos.getNombre().equals(curso.getNombre())) {
                System.out.println("El curso de " + curso.getNombre() + " no se puede añadir, ya existe.");
                return;
            }
        }
        this.listaCursos.add(curso);
    }
}

