package com.poo.PruebaLombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;


    public void agregarCurso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }
}
