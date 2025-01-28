package com.poo.Televisor;

public class AplicacionTv {

    public static void main(String[] args) {

        Televisor televisor1 = new Televisor();
        Televisor televisor2 = new Televisor(5, 10);

        System.out.println("Televisor 1 - Canal inicial: " + televisor1.getCanal() + ", Volumen inicial: " + televisor1.getVolumen());
        System.out.println("Televisor 2 - Canal inicial: " + televisor2.getCanal() + ", Volumen inicial: " + televisor2.getVolumen());

        televisor1.setCanal(20);
        televisor1.setVolumen(30);

        televisor2.setCanal(50);
        televisor2.setVolumen(60);

        System.out.println("Televisor 1 - Nuevo canal: " + televisor1.getCanal() + ", Nuevo volumen: " + televisor1.getVolumen());
        System.out.println("Televisor 2 - Nuevo canal: " + televisor2.getCanal() + ", Nuevo volumen: " + televisor2.getVolumen());

        televisor1.subirCanal();
        televisor1.bajarVolumen();
        televisor2.bajarCanal();
        televisor2.subirVolumen();

        System.out.println("Televisor 1 - Canal final: " + televisor1.getCanal() + ", Volumen final: " + televisor1.getVolumen());
        System.out.println("Televisor 2 - Canal final: " + televisor2.getCanal() + ", Volumen final: " + televisor2.getVolumen());

        System.out.println(televisor1);
        System.out.println(televisor2);
    }
}