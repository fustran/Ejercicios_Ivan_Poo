package com.poo.Casa;

import java.util.ArrayList;
import java.util.Scanner;

class Casa {

    private static final Scanner teclado = new Scanner(System.in);

    private final String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
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

        Habitacion mayor = habitaciones.get(0);

        for (Habitacion habitacion : habitaciones) {
            if(habitacion.getMetrosCuadrados() > mayor.getMetrosCuadrados()){
                mayor = habitacion;
            }

        }
        return mayor;
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

    public void calcularHabitacionMasConsumo(){

        double aux = 0;
        Habitacion mayor = habitaciones.get(0);

        for (Habitacion habitacion : habitaciones){
            double consumoActual = habitacion.calcularConsumo();
            if(consumoActual > aux){
                aux = consumoActual;
                mayor = habitacion;
            }
        }

        System.out.println("La habitación que más consume es: " +  mayor.getNombre() + " con " + mayor.calcularConsumo() + "kWh");
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}