package com.poo.PruebaLombok;

import lombok.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Estudiante> listaEstudiantes;
    @NonNull
    private ArrayList<Curso> listaCursos;

    public void agregarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }
}