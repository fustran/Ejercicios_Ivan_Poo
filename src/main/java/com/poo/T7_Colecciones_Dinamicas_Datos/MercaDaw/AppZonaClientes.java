package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
/**
 * Clase que gestiona la zona de clientes.
 */
public class AppZonaClientes {

    final Scanner teclado = new Scanner(in);
    private static Cliente cliente;

    /**
     * Metodo para autenticar a un cliente comparando usuario y contraseña con los datos almacenados en la lista de clientes.
     * @param listaClientes La lista de clientes que recibe desde MercaDaw y es llamada desde la app principal.
     */
    public void autenticacion(List<Cliente> listaClientes) {
        out.println();
        out.println("*** BIENVENIDO A LA COMPRA ONLINE EN MERCADAW ***");

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
                    out.println("Bienvenid@, " + usuario + "!");
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
                exit(1);
            }
        }
    }

    /**
     * Metodo para iniciar una compra comprobando que se escojan los productos existentes en el ENUM, añadir productos, mostrar importes acumulados.
     */
    public void iniciarCompra() {
        cliente.crearPedido();
        boolean seguirComprando = true;

        while (seguirComprando) {
            String productoElegido;
            boolean productoValido = false;

            while (!productoValido) {
                imprimirProductos();
                productoElegido = teclado.nextLine().trim().toUpperCase();

                try {
                    Producto producto = Producto.valueOf(productoElegido);
                    cliente.insertarProducto(productoElegido);
                    productoValido = true;

                    double precio = producto.getProductos();
                    double total = cliente.importePedido();
                    out.printf("Has añadido %s con un precio de %.2f€. Importe total del carrito: %.2f€. ", productoElegido, precio, total);

                    boolean salir = true;

                    do {
                        mensajeSeguirComprando();
                        String respuesta = teclado.nextLine().trim();

                        if (respuesta.equalsIgnoreCase("S")) {
                            salir = true;
                        } else if (respuesta.equalsIgnoreCase("N")) {
                            cliente.mostrarResumenCompra();
                            seguirComprando = false;
                        } else {
                            out.println("ERROR: Opción incorrecta...");
                            salir = false;
                        }
                    }while (!salir);

                } catch (IllegalArgumentException e) {
                    out.println();
                    out.println("ERROR: El producto elegido no existe! Elige otro.");
                }
            }
        }

        menuClientes();
    }

    /**
     * Metodo para mostrar un submenú al cliente con 4 opciones, aplicar promociones, ordenar productos, eliminar productos, mostrar resumen de compra.
     */
    public void menuClientes() {
        while (true) {
            out.println();
            out.println("================================");
            out.println();
            out.println("¿QUÉ DESEA HACER?");
            out.println();

            out.println("    [1]. Aplicar promo.");
            out.println("    [2]. Mostrar resumen ordenados por uds.");
            out.println("    [3]. Eliminar productos.");
            out.println("    [X]. Terminar pedido.");
            out.println();
            out.println("==================================");
            out.println();
            out.print("    Elige una opción: ");

            String opcion = teclado.nextLine().trim().toUpperCase();

            switch (opcion) {
                case "1":
                    if (!cliente.promociones) {
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);

                        out.println();
                        out.println("=================================");
                        out.println();
                        out.println("PROMO 3x2 + 10 % DESCUENTO APLICADA.");
                    } else {
                        out.println();
                        out.println("YA HAS APLICADO TUS PROMOS.");
                    }
                    cliente.mostrarResumenCompra();
                    break;

                case "2":
                    cliente.productosOrdenadosUds();
                    break;

                case "3":
                    out.print("Escriba el producto que desea eliminar: ");
                    String opcionElegida = teclado.nextLine().trim().toUpperCase();
                    cliente.eliminarUnaUnidad(opcionElegida);
                    break;

                case "X":
                    out.println();
                    out.println("GRACIAS POR SU PEDIDO. Se lo enviaremos a la dirección " + Cliente.getDIRECCION());
                    System.exit(0);
                    return;

                default:
                    out.println("ERROR: Opción incorrecta");

            }
        }
    }

    /**
     * Metodo para mostrar un mensaje al cliente mientras compra.
     */
    public void mensajeSeguirComprando(){
        out.println("¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
    }

    /**
     * Metodo para imprimir los productos del ENUM.
     */
    public void imprimirProductos() {
        out.println();
        out.println("===========================================");
        out.println();
        out.println("Añade productos a tu lista de la compra...");
        out.println();
        for (Producto producto : Producto.values()) {
            out.printf("  %s: %.2f€%n", producto.name(), producto.getProductos());
            out.println();
        }

        out.println("=========================================");
        out.println();
        out.print("Elige un producto: ");
    }

    /**
     * Metodo para mostrar un mensaje de despedida al cliente.
     */
    public void imprimirDespedida() {
        out.println("Hasta Pronto, " + cliente.getNombre() + "!");
    }

    /**
     * Metodo para imprimir la lista de clientes almacenados en una linkedList y poder usarlos de prueba.
     */
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
        zonaClientes.imprimirDespedida();
    }
}