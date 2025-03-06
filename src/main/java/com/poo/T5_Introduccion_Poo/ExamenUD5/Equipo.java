package com.poo.T5_Introduccion_Poo.ExamenUD5;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    private static final int PROBLEMAS_RESUELTOS = 0;
    private static final int PUNTUACION = 0;

    private String nombreEquipo;
    ArrayList<String> listaMiembros = new ArrayList<>();
    private int problemasResueltos;
    private int puntuacion;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.problemasResueltos = PROBLEMAS_RESUELTOS;
        this.puntuacion = PUNTUACION;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public int getProblemasResueltos() {
        return problemasResueltos;
    }

    public void setProblemasResueltos(int problemasResueltos) {
        this.problemasResueltos = problemasResueltos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void calcularPuntuacion() {

    }



    // Insertar miembros mediante una lista de tipo string comprobando que no se exceda la lista de 4 miembros por equipo
    public void insertarMiembros(String ... nombres) {
        if (comprobarCantidadMiembrosEquipo() + nombres.length > 4){
            System.out.println("ERROR: " + Arrays.toString(Arrays.stream(nombres).toArray()) + " no pueden ser inscritos en el equipo " + nombreEquipo + ", porque solo puede haber 4 miembros por equipo y ya están inscritos:  " + listaMiembros);
        }else {
            listaMiembros.addAll(Arrays.asList(nombres));
            System.out.println(Arrays.toString(Arrays.stream(nombres).toArray()) + " añadidos al equipo " + nombreEquipo + "...");
        }

    }

    // Metodo para devolver la longitud de la lista de miembros
    public int comprobarCantidadMiembrosEquipo(){
        return listaMiembros.size();
    }


    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", problemasResueltos=" + problemasResueltos +
                ", puntuacion=" + puntuacion +
                '}';
    }

}