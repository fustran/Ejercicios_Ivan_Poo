package com.poo.Exs.UD5.I;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final String SEDE_DEFAULT = "MUTXAMIEL";

    private String sede;
    private LocalDate fecha;
    ArrayList<Equipo> listaEquipos = new ArrayList<>(); // 20 equipos como máximo

    public Concurso() {
        preguntarFecha();
        this.sede = SEDE_DEFAULT;

    }

    public String getSEDE() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    // Asignar la fecha al concurso introducida por teclado
    public void preguntarFecha(){
        System.out.println("Cuándo se va a realizar el concurso?");

        System.out.println("Día: ");
        int dia = ENTRADA.nextInt();

        System.out.println("Mes: ");
        int mes = ENTRADA.nextInt();

        System.out.println("Año: ");
        int anyo = ENTRADA.nextInt();

        LocalDate fechaElegida = LocalDate.of(anyo, mes, dia);
        setFecha(fechaElegida);

    }

    // Inscribir equipos comprobando que la lista no exceda de 20
    public void inscribirEquipo(Equipo equipo) {
        if (comprobarCantidadEquipos() > 20) {
            System.out.println("ERROR: solo se pueden inscribir 20 equipos como máximo");
        }else {
            listaEquipos.add(equipo);
            System.out.println("Nuevo equipo " + equipo.getNombreEquipo() + " inscrito...");
        }

    }

    // Devolución de un entero con el tamaño de la lista
    public int comprobarCantidadEquipos(){
        return listaEquipos.size();
    }

    public void imprimirDatosEquipos(){
        System.out.println();
        System.out.println("Equipos inscritos: " + listaEquipos.size());
        for (Equipo equipos : listaEquipos){
            System.out.println("- " + equipos.getNombreEquipo() + ". " + equipos.getListaMiembros());
        }
    }

    public void equipoGanador(){
        Equipo equipoGanador = listaEquipos.getFirst();

        for (int i = 1; i < listaEquipos.size(); i++) {
            Equipo equipoActual = listaEquipos.get(i);
            if (equipoActual.getPuntuacion() > equipoGanador.getPuntuacion()) {
                equipoGanador = equipoActual;
            }
        }

        System.out.println("El equipo ganador es "
                + equipoGanador.getNombreEquipo()
                + " con " + equipoGanador.getPuntuacion() + " puntos.");
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "sede=" + sede +
                ", fecha=" + fecha +
                ", listaEquipos=" + listaEquipos +
                '}';
    }
}