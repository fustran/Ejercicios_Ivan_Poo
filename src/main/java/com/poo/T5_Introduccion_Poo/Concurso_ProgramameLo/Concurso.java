package com.poo.T5_Introduccion_Poo.Concurso_ProgramameLo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {

    private static final Scanner teclado = new Scanner(System.in);

    private final String sede = "MUTXAMIEL";
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipos;

    public Concurso() {
        this.listaEquipos = new ArrayList<>(20);
        setFecha();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha() {
        System.out.println("Fecha del concurso: ");
        System.out.println("Día: ");
        int dia = teclado.nextInt();
        System.out.println("Mes: ");
        int mes = teclado.nextInt();
        System.out.println("Año: ");
        int anyo = teclado.nextInt();

        this.fecha = LocalDate.of(anyo, mes, dia);
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public String getSede() {
        return sede;
    }

    public void inscribirEquipo(Equipo equipo) {
        listaEquipos.add(equipo);
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