package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import lombok.*;
import java.util.*;

@Getter
public class MercaDaw {

    private static final Random ALEATORIOS = new Random();
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final List<Cliente> listaClientes = new LinkedList<>();


    public MercaDaw() {
        generarClientes();
    }


    // Metodo para generar clientes
    public static void generarClientes(){

        StringBuilder nombreUsuario = new StringBuilder();
        StringBuilder password = new StringBuilder();

        while (nombreUsuario.length() < 8) {
            int indice = ALEATORIOS.nextInt(CARACTERES.length());
            char caracter = CARACTERES.charAt(indice);

            if (nombreUsuario.toString().indexOf(caracter) == -1) {
                nombreUsuario.append(caracter);
            }
        }

        while (password.length() < 8) {
            int indice = ALEATORIOS.nextInt(CARACTERES.length());
            char caracter = CARACTERES.charAt(indice);

            if (password.toString().indexOf(caracter) == -1) {
                password.append(caracter);
            }
        }

        listaClientes.add(new Cliente(nombreUsuario.toString(), password.toString()));
    }


    public static List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }
}