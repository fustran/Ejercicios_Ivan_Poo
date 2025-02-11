package com.poo.concurso_programamelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {

    private final String sede = "MUTXAMIEL";
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipos;

    public Concurso() {
        this.listaEquipos = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }




    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public String getSede() {
        return sede;
    }


    @Override
    public String toString() {
        return "Concurso{" +
                "sede='" + sede + '\'' +
                ", fecha=" + fecha +
                ", listaEquipos=" + listaEquipos +
                '}';
    }



}
