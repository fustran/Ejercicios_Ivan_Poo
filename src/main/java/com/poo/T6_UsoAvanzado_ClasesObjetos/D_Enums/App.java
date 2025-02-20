package com.poo.T6_UsoAvanzado_ClasesObjetos.D_Enums;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final Scanner teclado = new Scanner(System.in);

        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);

        for (Asignaturas asignatura : Asignaturas.values()) {
            System.out.println("Asignatura " + asignatura + ": " +  "tiene " + asignatura.getHoras() + " horas anuales." );
        }

        System.out.println("Introduce un módulo " + Arrays.toString(Asignaturas.values()));
        String modulo = teclado.next();
        Asignaturas moduloEnum = Asignaturas.valueOf(modulo);
        System.out.println(modulo + " tiene " + moduloEnum.getHoras() + " horas anuales.");

        String ipe_String = ipe.name();
        System.out.println(ipe_String + " como String");

        int posicion = Asignaturas.BBDO.ordinal();
        Asignaturas posicion1 = Asignaturas.BBDO ;
        System.out.println(posicion1 + " tiene la posición " + posicion + " en el enum.");
    }
}