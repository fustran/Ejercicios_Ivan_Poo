package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.mapas.ejercicio3;

public class AppTemperaturas {

    public static void main(String[] args) {

        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertar("Mutxamel",18.6);
        System.out.println(registro);
        registro.insertar("San Vicente",19.6);
        registro.actualizar("Mutxamel");
        System.out.println(registro);
        registro.consultar();
        registro.verTodas();

    }
}
