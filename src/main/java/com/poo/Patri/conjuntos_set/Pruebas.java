package com.poo.Patri.conjuntos_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {

    public static void main(String[] args) {

        Set<String> conjunto =  new HashSet<>();

        conjunto.add("Agost FC");
        conjunto.add("Monnegre FC");
        conjunto.add("Socarrats FC");
        conjunto.add("Gimnatic de San Vicente");
        conjunto.add("Agost FC");
        conjunto.add("Agosto FC");

        System.out.println(conjunto);

        System.out.println("-----------");

        Set<Integer> conjunto_adds = new LinkedHashSet<>();
        conjunto_adds.add(10);
        conjunto_adds.add(5);
        conjunto_adds.add(8);
        conjunto_adds.add(34);
        conjunto_adds.add(8);
        conjunto_adds.remove(34);

        System.out.println(conjunto_adds);

        System.out.println("-----------");

        Set<String> conjuntos_orden = new TreeSet<>();

        conjuntos_orden.add("Solan de Cabras");
        conjuntos_orden.add("Font Vella");
        conjuntos_orden.add("Bezoya");
        conjuntos_orden.add("Lanjarón");
        conjuntos_orden.add("Bezoya");
        conjuntos_orden.remove("Bezoya");
        conjuntos_orden.add("1");
        conjuntos_orden.add("font Vella");

        System.out.println(conjuntos_orden);



    }




}
