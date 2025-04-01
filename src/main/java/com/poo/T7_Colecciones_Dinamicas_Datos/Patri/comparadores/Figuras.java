package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.comparadores;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Figuras implements Comparable<Figuras>{

    private String nombre;
    private Double superficie;

    public Figuras (String nombre, Double superficie){
        this.nombre=nombre;
        this.superficie=superficie;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "nombre='" + nombre + '\'' +
                ", superficie=" + superficie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figuras figuras = (Figuras) o;
        return Double.compare(superficie, figuras.superficie) == 0 && Objects.equals(nombre, figuras.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, superficie);
    }

    @Override
    public int compareTo(Figuras figura) {

        int resultadoCompararNombre = nombre.compareTo(figura.getNombre());

        if (resultadoCompararNombre!=0){
            return resultadoCompararNombre;
        }

        return superficie.compareTo(figura.getSuperficie());
    }
}
