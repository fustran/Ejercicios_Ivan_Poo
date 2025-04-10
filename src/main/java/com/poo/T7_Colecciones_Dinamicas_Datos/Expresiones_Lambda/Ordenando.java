package com.poo.T7_Colecciones_Dinamicas_Datos.Expresiones_Lambda;

import java.util.*;

public class Ordenando {

    public static void main(String[] args) {

        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicante", "Albatera", "Campello", "Agost"));

        //Collections.sort(listaCiudades, (ciudad1,ciudad2) -> ciudad1.compareTo(ciudad2));

        listaCiudades.sort(Comparator.comparing(s -> s));
        System.out.println(listaCiudades);


        Profesor Patri = new Profesor("Patricia", "Programación", 33);
        Profesor Paco = new Profesor("Francisco", "Sistemas", 50);

        List<Profesor> listaProfesores = new ArrayList<>(Arrays.asList(Patri, Paco));

        listaProfesores.sort(Comparator.comparing(profesor -> profesor.getNombre()));
        listaProfesores.sort(Comparator.comparing(Profesor::getNombre).thenComparing(Profesor::getEdad)); // Otra forma
        System.out.println(listaProfesores);

        Collections.sort(listaProfesores, (profe1, profe2 ) -> profe1.getNombre().compareTo(profe2.getNombre()));
        System.out.println(listaProfesores);

    }
}