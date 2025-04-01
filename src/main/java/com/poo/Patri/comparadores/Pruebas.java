package com.poo.Patri.comparadores;

import java.util.*;

public class Pruebas {

    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(1,5,4,12,45,3));

        Collections.sort(numeros);
        Collections.reverse(numeros);
        System.out.println(numeros);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patricia","Iván","Izan","Mauro"));

        Collections.sort(nombres);
        System.out.println(nombres);

        List<Figuras> figuritas = new ArrayList<>();
        figuritas.add(new Figuras ("Cuadrado",20.0));
        figuritas.add(new Figuras("Triangulo",30.5));
        figuritas.add(new Figuras("Hectágono",12.63));
        figuritas.add(new Figuras("Tricontakaiheptágono",89.54));
        figuritas.add(new Figuras ("Cuadrado",15.0));

//        Collections.sort(figuritas, new CompararPorNombre());
//        Collections.sort(figuritas, new CompararPorNombre().reversed());
        Collections.sort(figuritas, Collections.reverseOrder());
        System.out.println(figuritas);










    }


}
