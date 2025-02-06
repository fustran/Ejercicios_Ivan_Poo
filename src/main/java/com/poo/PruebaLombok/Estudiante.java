package com.poo.PruebaLombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private String curso;
}
