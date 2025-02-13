package com.poo.T5_Introduccion_Poo.Equipo;

import com.poo.T5_Introduccion_Poo.Persona.Persona;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Persona> integrantes;

    public Equipo(String nombre) {
        this.nombre = nombre;
        integrantes = new ArrayList<>();
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }

    public void eliminarIntegrante(Persona persona) {
        integrantes.remove(persona);
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + getNombre() +
                ", integrantes=" + getIntegrantes() + '}';
    }
}