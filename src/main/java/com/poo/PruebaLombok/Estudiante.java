package com.poo.PruebaLombok;

import lombok.*;

public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private String curso;
}
