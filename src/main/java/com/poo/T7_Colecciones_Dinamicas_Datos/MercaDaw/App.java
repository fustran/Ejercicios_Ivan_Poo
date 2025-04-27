package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.List;
/**
 * Clase principal del programa para ejecutar la aplicación.
 */
public final class App {

    public static void main(String[] args) {

        MercaDaw mercaDaw = new MercaDaw();
        List<Cliente> clientes = MercaDaw.getListaClientes();
        AppZonaClientes zonaClientes = new AppZonaClientes();
        zonaClientes.imprimirListaClientes();
        zonaClientes.autenticacion(clientes);
        zonaClientes.imprimirDespedida();
    }
}