package com.poo.T5_Introduccion_Poo.Casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 50);
        casa.agregarHabitacion("Cocina", 70);
        casa.agregarHabitacion("Baño", 25);

        casa.mostrarHabitaciones();

        System.out.println("La habitación más grande es " + casa.getHabitacionMasGrande().getNombre());

        casa.agregarHabitacion("Garaje",20);
        casa.mostrarHabitaciones();

        casa.eliminarHabitacion("Baño");
        casa.mostrarHabitaciones();
        
        casa.agregarHabitacion("Salon", 40);
        casa.agregarHabitacion("Comedor", 90);

        casa.getHabitaciones().get(0).agregarElectrodomestico("Nevera", 40);
        casa.getHabitaciones().get(1).agregarElectrodomestico("Televisor", 20);

        casa.calcularHabitacionMasConsumo();

    }
}