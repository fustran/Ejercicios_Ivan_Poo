package com.poo.T5_Introduccion_Poo.PruebaLombok;

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