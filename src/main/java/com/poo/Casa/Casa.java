package com.poo.Casa;

import java.util.ArrayList;
import java.util.Scanner;

class Casa {

    private static final Scanner teclado = new Scanner(System.in);

    private final String direccion;
    private final ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario(); //Propietario

    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {

        for(Habitacion habitacion : habitaciones) {
            if(habitacion.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones.");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetrosCuadrados() + " m2)");
        }
        System.out.println("Propietario: " + propietario.getNombre() + ", Edad: " + propietario.getEdad());
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion aux = habitaciones.getFirst();

        for (Habitacion habitacion : habitaciones) {
            if(habitacion.getMetrosCuadrados() > aux.getMetrosCuadrados()){
                aux = habitacion;
            }
        }
        return aux;
    }

    public void eliminarHabitacion(String nombre) {

        for(Habitacion habitacion : habitaciones) {
            if(habitacion.getNombre().equals(nombre)) {
                habitaciones.remove(habitacion);
                break;
            }
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce propietario/a");
        String nombre = teclado.nextLine();
        System.out.println("Edad del propietario/a");
        int edad = teclado.nextInt();
        propietario = new Propietario(nombre, edad);
    }
}