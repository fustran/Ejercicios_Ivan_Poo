package com.poo.concurso_programamelo;

import java.util.ArrayList;

public class Equipo {

    private String nombre_equipo;
    private ArrayList<String> listaMiembros;
    private int problemas_resueltos = 0;
    private int puntuacion = 0;

    public Equipo(String nombre_equipo) {
        this.problemas_resueltos = problemas_resueltos;
        this.puntuacion = puntuacion;
        this.nombre_equipo = nombre_equipo;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public int getProblemas_resueltos() {
        return problemas_resueltos;
    }

    public void setProblemas_resueltos(int problemas_resueltos) {
        this.problemas_resueltos = problemas_resueltos;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void agregarMiembro() {

        listaMiembros.add("");
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre_equipo='" + nombre_equipo + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", problemas_resueltos=" + problemas_resueltos +
                ", puntuacion=" + puntuacion +
                '}';
    }





}
