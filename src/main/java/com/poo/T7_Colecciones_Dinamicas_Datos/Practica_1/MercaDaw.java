package com.poo.T7_Colecciones_Dinamicas_Datos.Practica_1;

import java.util.Collections;
import java.util.List;

public class MercaDaw {

    private static List<Cliente> clientes;

    public MercaDaw() { //Constructor

    }

    public static void generarClientes(){

    }

    public static List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    public static void setClientes(List<Cliente> clientes) {
        MercaDaw.clientes = clientes;
    }

    @Override
    public String toString() {
        return "MercaDaw{}";
    }
}