package com.poo.PruebaLombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}