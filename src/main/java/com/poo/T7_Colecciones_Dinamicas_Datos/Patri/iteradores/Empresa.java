package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.iteradores;

import lombok.Getter;

@Getter
public class Empresa {

    private String nombre;
    private int empleados;

    public Empresa(String nombre,int empleados){
        this.nombre=nombre;
        this.empleados=empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }

}
