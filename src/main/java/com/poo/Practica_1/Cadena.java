package com.poo.Practica_1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public void agregarPrograma(Programa programa) {
            listaProgramas.add(programa);

    }

    @Override
    public String toString() {
        return "Cadena: " +
                        "[Nombre = " + getNombre() +
                        ", ListaProgramas = " + getListaProgramas() +
                        "]";
    }
}