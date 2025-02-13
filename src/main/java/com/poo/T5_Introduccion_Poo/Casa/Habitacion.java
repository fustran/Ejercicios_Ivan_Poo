package com.poo.T5_Introduccion_Poo.Casa;

import java.util.ArrayList;

class Habitacion {

    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos; // COMPOSICIÓN: la habitación tiene electrodomésticos

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        electrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public void agregarElectrodomestico(String nombre, double consumo) {

        for(Electrodomestico electrodomestico: electrodomesticos){
            if(electrodomestico.getNombre().equals(nombre)){
                System.out.println("El electrodoméstico " + nombre + " ya existe");
                return;
            }
        }

        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);
        electrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos() {
        System.out.println("La habitación " + nombre + ":" + " tiene" + electrodomesticos.size() + " electrodomésticos");

        for (Electrodomestico electrodomestico : electrodomesticos){
            System.out.println("Nombre: " + electrodomestico.getNombre() + " consumo: " + electrodomestico.getConsumo() + " (kWh)");
        }
    }

    public double calcularConsumo() {

        double consumo = 0;

        for(Electrodomestico electrodomestico: electrodomesticos){
            consumo += electrodomestico.getConsumo();
        }
        return consumo;
    }

    @Override
    public String toString() {
        return "Habitación: [Nombre = " + getNombre() +
                ", Metros = " + getMetrosCuadrados()  + "Electrodomésticos = " + electrodomesticos  + "]";
    }
}