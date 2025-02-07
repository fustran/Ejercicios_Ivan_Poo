package com.poo.PruebaLombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}