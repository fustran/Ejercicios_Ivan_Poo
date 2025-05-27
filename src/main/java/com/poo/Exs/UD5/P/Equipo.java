package com.poo.Exs.UD5.P;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    private static final int PUNTUACION_POR_PROBLEMA = 10;
    private static final int EQUIPOS_MAX = 4;

    private String nombre_equipo;
    private ArrayList<String> listaMiembros;
    private int problemas_resueltos;
    private int puntuacion;

    public Equipo (String nombre_equipo){
        this.nombre_equipo=nombre_equipo;
        listaMiembros =  new ArrayList<>();
        problemas_resueltos = 0;
        puntuacion = 0;
    }

    public void insertarMiembros (String...miembro){
        if(listaMiembros.size()+miembro.length>EQUIPOS_MAX){
            System.out.println("No se pueden insertar " + miembro.length + " miembros más en el equipo " + nombre_equipo + ". Ya tiene " + listaMiembros.size() + " miembros.");
        }else{
            System.out.println("Insertados nuevos miembros para el equipo " + nombre_equipo);
            listaMiembros.addAll(Arrays.asList(miembro));
        }

    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void calcularPuntuacion(){
        setPuntuacion(problemas_resueltos*PUNTUACION_POR_PROBLEMA);
        System.out.println("Puntuación calculada para el equipo " + nombre_equipo + ": " + puntuacion + " puntos.");
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
