package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class AppZonaClientes {

    final Scanner teclado = new Scanner(in);
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

        boolean opcionCorrecta;
        do {
            out.print("    Elige una opción: ");
            out.println();
            String opcion = teclado.nextLine();

            opcionCorrecta = true;

            switch (opcion) {
                case "1":
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);
                        out.println();
                        out.println("=================================");
                        out.println();
                        out.println("PROMO 2X3 APLICADA + 10% DESCUENTO.");
                        cliente.mostrarResumenCompra();
                    break;
                case "2":
                        cliente.productosOrdenadosUds();
                    break;
                case "3":
                        out.println("Eliminando productos...");
                    break;
                case "X":
                        out.println("GRACIAS POR SU PEDIDO. Se lo enviaremos a la dirección " + Cliente.getDIRECCION());
                    break;
                default:
                    out.println("ERROR: Opción incorrecta");
                    out.println();
                    opcionCorrecta = false;
            }

        } while (!opcionCorrecta);

        out.println();
        out.println("==================================");
        out.println();

    }

    public void mensajeSeguirComprando(){
        out.println("¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
    }

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