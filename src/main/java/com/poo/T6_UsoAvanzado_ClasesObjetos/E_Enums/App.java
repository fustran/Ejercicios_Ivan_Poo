package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Enums;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);

        for (Asignaturas asignatura : Asignaturas.values()) {
            System.out.println("Asignatura " + asignatura + ": " +  "tiene " + asignatura.getHoras() + " anuales." );
        }

        System.out.println("Introduce un módulo " + Arrays.toString(Asignaturas.values()));
        String modulo = teclado.next();
        Asignaturas moduloEnum = Asignaturas.valueOf(modulo);
        System.out.println(moduloEnum);

        String ipe_String = ipe.name();
        System.out.println(ipe_String + " Como String");

        int posicion = Asignaturas.BBDO.ordinal();
        System.out.println(posicion + " para base de datos en el enum.");
    }
}