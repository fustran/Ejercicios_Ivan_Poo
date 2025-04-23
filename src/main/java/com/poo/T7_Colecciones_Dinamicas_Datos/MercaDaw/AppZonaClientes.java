package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class AppZonaClientes {

    final Scanner teclado = new Scanner(System.in);
    private static Cliente cliente;

    public void autenticacion(List<Cliente> listaClientes) {
        out.println();
        out.println("*** COMPRA ONLINE DE MERCADAW ***");

        int intentos = 3;
        while(true){
            out.println();
            out.print("    Usuario: ");
            String usuario = teclado.nextLine();

            out.print("    Contraseña: ");
            String password = teclado.nextLine();

            for (Cliente clientes : listaClientes){
                if (clientes.getNombre().equals(usuario) && clientes.getPassword().equals(password)) {
                    AppZonaClientes.cliente = clientes;
                    out.println();
                    out.println("Bienvenid@, " + usuario);
                    iniciarCompra();
                    return;
                }
            }

            intentos--;
            if (intentos > 1) {
                out.println("Credenciales incorrectas, te quedan " + intentos + " intentos.");
            }else if (intentos == 1) {
                out.println("Credenciales incorrectas, te queda " + intentos + " intento.");
            }else {
                out.println("Credenciales incorrectas, has agotado todos tus intentos.");
                out.println("ERROR DE AUTENTICACIÓN.");
                System.exit(1);  // status 1 es para un código de salida de error
            }
        }
    }

    public void iniciarCompra() {
        cliente.crearPedido();
        imprimirProductos();
    }

    public void imprimirProductos() {
        out.println();
        out.println("Añade productos a tu lista de la compra...");
        out.println();
        for (Producto producto : Producto.values()) {
            out.printf("  %s: %.2f€%n", producto.name(), producto.getProductos());
            out.println();
        }

        out.println("========================================");
        out.println();
        out.println("   Elige un producto:");
    }

    public void imprimirDespedida() {
        out.println("Hasta Pronto, " + cliente.getNombre() + "!");
    }

    public void imprimirListaClientes() {
        for (Cliente clientes : MercaDaw.getListaClientes()){
            out.println();
            out.println(" Usurario: " + clientes.getNombre());
            out.println(" Contraeña: " + clientes.getPassword());
        }
    }

    public static void main(String[] args) {

        MercaDaw mercaDaw = new MercaDaw();
        List<Cliente> clientes = MercaDaw.getListaClientes();
        AppZonaClientes zonaClientes = new AppZonaClientes();
        zonaClientes.imprimirListaClientes();
        zonaClientes.autenticacion(clientes);

    }
}