package com.poo.T7_Colecciones_Dinamicas_Datos.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsss {

    public static void main(String[] args) {

        List<String> perfumes = new ArrayList<>(Arrays.asList("Khamra", "Mercedes", "Yatory", "PepikodelosPalotes"));

        Stream<String> streamito = Stream.of("Khamra", "Mercedes");

        perfumes.stream()
                    .filter(marca -> marca.endsWith("y"))
                    .filter(marca -> marca.length() > 6)
                    .map(String::toUpperCase)
                    .forEach(System.out::println);
    }
}