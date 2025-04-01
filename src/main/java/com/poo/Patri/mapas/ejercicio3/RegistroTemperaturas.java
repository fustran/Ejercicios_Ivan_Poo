package com.poo.Patri.mapas.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner teclado = new Scanner(System.in);
    private Map<String,Double> mapaTemperaturas;

    public RegistroTemperaturas(){
        mapaTemperaturas =  new HashMap<>();
    }

    public void insertar (String ciudad, Double temperatura){

        mapaTemperaturas.put(ciudad,temperatura);
        System.out.println("Temperatura de " + temperatura + "º registrados para " + ciudad);
    }

    public void actualizar (String ciudad){

        System.out.println("¿Qué temperatura hace en " + ciudad + "?");
        mapaTemperaturas.put(ciudad,teclado.nextDouble());
        System.out.println("Temperatura actualizada en " + ciudad);

    }

    public void consultar (){

        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = teclado.next();

        if (!mapaTemperaturas.containsKey(ciudad)){
            System.out.println("No existen registros para la ciudad de " + ciudad);
        }else{
            System.out.println("Temperatura en " + ciudad + ": " + mapaTemperaturas.get(ciudad) + "º.");
        }

    }

    public void verTodas (){

        System.out.println("TEMPERATURAS REGISTRADAS:");

        for (Map.Entry<String,Double> mapita : mapaTemperaturas.entrySet()){
            System.out.println(mapita.getKey() + ": " + mapita.getValue() + "º");
        }

    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }

}
