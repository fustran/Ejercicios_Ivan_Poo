package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import lombok.*;
import java.util.*;
/**
 * Clase que gestiona la creacion aleatoria de clientes y la lista de clientes.
 */
@Getter
public class MercaDaw {

    private static final Random ALEATORIOS = new Random();
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final List<Cliente> listaClientes = new LinkedList<>();

    public MercaDaw() {
        generarClientes();
    }

    /**
     * Metodo para generar clientes con usuario y passwords aleatorios dentro de un rango de caracteres concretos.
     */
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

    /**
     * Metodo estático para obtener la lista de clientes y que no pueda ser modificada, solo se permite lectura.
     * @return La lista de clientes.
     */
    public static List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }
}