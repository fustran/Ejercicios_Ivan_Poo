package com.poo.T7_Colecciones_Dinamicas_Datos.Expresiones_Lambda;

import lombok.Getter;

@Getter
public class Producto {


    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

}