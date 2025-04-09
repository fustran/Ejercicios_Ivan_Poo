package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.LAMBDAS;

public class Prueba {

    public static void main(String[] args) {

        Profesores patri = new Profesores() {
            @Override
            public boolean calificar(int nota) {
                System.out.println("comparando para: " + nota);
                if (nota>10){
                    return true;
                }else{
                    return false;
                }
            }
        };

        System.out.println(patri.calificar(11));

        Profesores paco = (nota) -> {
            System.out.println("comparando para: " + nota);
            if (nota>10){
                return true;
            }else{
                return false;
            }
        };

        System.out.println(paco.calificar(0));


        VerificadorVoto verificar = (profesor) -> profesor.getEdad()>=18;

        System.out.println(verificar.puedeVotar(new Profesor("Patri","programación",25)));
        System.out.println(verificar.puedeVotar(new Profesor("Paco","sistemas",14)));

    }
}
