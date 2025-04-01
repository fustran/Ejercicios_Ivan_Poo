package com.poo.Patri.mapas;

import java.util.HashMap;
import java.util.Map;

public class Olimpiada152 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        int num = in.nextInt();
        in.nextLine();
        if (num==0)
            return false;
        else {
            String numeros = in.nextLine();
            String[] numeros_vector = numeros.split(" ");
            Map<String,Integer> mapa = new HashMap<>();

            Integer max = 0;
            String clave_max = "0";

            for (String k_numero : numeros_vector){

                if (mapa.containsKey(k_numero)){
                    mapa.put(k_numero,mapa.get(k_numero)+1);
                }else{
                    mapa.put(k_numero,1);
                }

                Integer v_actual = mapa.get(k_numero);
                if (v_actual>max){
                    max=v_actual;
                    clave_max = k_numero;
                }

            }

            System.out.println(clave_max);

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}
