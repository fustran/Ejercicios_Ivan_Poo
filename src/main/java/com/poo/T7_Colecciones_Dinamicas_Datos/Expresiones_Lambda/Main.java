package com.poo.T7_Colecciones_Dinamicas_Datos.Expresiones_Lambda;

public class Main {
    public static void main(String[] args) {
    /*    Ejecutor patri = new Ejecutor() { // Se puede cambiar por una lambda
            @Override
            public boolean ejecutar(int nota) {
                System.out.println("Aprobado general!" + nota);
                if
            }
        };*/
        //patri.ejecutar(5);

        Ejecutor paco = (nota) -> {
            System.out.println("Suspendidos todos! " + nota);
            if (nota > 10){
                return true;
            }else {
                return false;
            }
        };

        System.out.println(paco.ejecutar(5));

        VerificarVoto verificar = (profesor) -> profesor.getEdad() >= 18;



        System.out.println(verificar.puedeVotar(new Profesor("Patri", "Programación", 34)));
        System.out.println(verificar.puedeVotar(new Profesor("Paco", "Sistemas", 50)));

    }
}