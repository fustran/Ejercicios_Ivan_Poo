package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.comparadores;

import java.util.*;

public class Mapitas {

    public static void main(String[] args) {

        HashMap<String,Double> carta_cubatas = new HashMap<>();
        carta_cubatas.put("Wichinau",7.0);
        carta_cubatas.put("Ron cola",8.0);
        carta_cubatas.put("Gintonic",10.5);

        List<Map.Entry<String,Double>> listaMapita = new ArrayList<>(carta_cubatas.entrySet());

        listaMapita.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String,Double> mapita : listaMapita){
            System.out.println("Cubalitres: " +  mapita.getKey() + " con precio: " + mapita.getValue());
        }

    }
}
