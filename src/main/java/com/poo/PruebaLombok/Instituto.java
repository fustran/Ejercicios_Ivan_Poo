package com.poo.PruebaLombok;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Data // Trae todos
public class Instituto {

    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;


    /*public Instituto(String nombre) {

        *//*this.nombre = Objects.requireNonNull(nombre);*//*
        *//*if (nombre == null){
            System.out.println("El nombre no puede ser nulo");
        }else {
            this.nombre = nombre;
        }*//*
    }*/
}
