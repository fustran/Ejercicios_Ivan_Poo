package com.poo.PruebaLombok;

import lombok.*;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    @NonNull
    private ArrayList<Curso> cursos = new ArrayList<>();


}