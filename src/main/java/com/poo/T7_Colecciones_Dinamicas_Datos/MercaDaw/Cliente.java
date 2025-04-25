package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import lombok.*;
import java.util.*;
import static java.lang.System.*;

@Getter
@Setter
public class Cliente {

    @Getter
    private static final String DIRECCION = "Calle +FalsaQueUnBilleteDe3000Pts, 123.";

    private String nombre;
    private String password;
    private Pedido pedido;
    boolean promociones;

    public Cliente(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }


    public void crearPedido() {
        this.pedido = new Pedido(0.0);
        this.promociones = false;
    }


    public void insertarProducto(String productoElegido) {

        Producto producto = Producto.valueOf(productoElegido);
        Map<Producto,Integer> mapa = pedido.getPedido();

        mapa.put(producto, mapa.getOrDefault(producto, 0) + 1);

        double nuevoImporte = pedido.getImporteTotal() + producto.getProductos();
        pedido.setImporteTotal(nuevoImporte);
    }


    public double importePedido() {
        return pedido.getImporteTotal();
    }


    public void mostrarResumenCompra() {
        out.println();
        out.println("=======================================");
        out.println();
        out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        out.println();

        recorrerMap();
    }


    public void productosOrdenadosUds() {
        out.println();
        out.println("=======================================");
        out.println();
        out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        out.println();
        out.println("Productos ordenados por unidades:");
        out.println();

        List<Map.Entry<Producto,Integer>> listaProductos = new ArrayList<>(pedido.getPedido().entrySet());
        listaProductos.sort(new OrdenarDescentente());
        recorrerMap();
    }

    // Metodo para recorrer el mapa, clave-valor y los precios
    public void recorrerMap() {

        for (Map.Entry<Producto,Integer> entry : pedido.getPedido().entrySet()) {
            Producto producto = entry.getKey();
            int unidades = entry.getValue();
            double precioUnidad = producto.getProductos();

            out.printf("%d %s %.2f€\n", unidades, producto.name(), precioUnidad);
        }

        out.println();
        out.printf("IMPORTE TOTAL: %.2f€\n", pedido.getImporteTotal());
    }

    // Metodo para eliminar productos del mapa en el pedido
    public void eliminarUnaUnidad(String opcionElegida) {

        if (pedido.getPedido().isEmpty()) {
            out.println();
            out.println("Tu carrito está vacío.");
            return;
        }

        mostrarResumenCompra();

        Producto producto;
        try {
            producto = Producto.valueOf(opcionElegida);
        } catch (IllegalArgumentException e) {
            out.println();
            out.println("Ese producto no existe.");
            return;
        }

        Map<Producto,Integer> carritoPedido = pedido.getPedido();
        Integer unidadesActuales = carritoPedido.get(producto);

        if (unidadesActuales == null) {
            out.println();
            out.println("No tienes " + producto.name() + " en tu carrito.");
            return;
        }

        double precioUnidad = producto.getProductos();
        pedido.setImporteTotal(pedido.getImporteTotal() - precioUnidad);

        if (unidadesActuales == 1) {
            carritoPedido.remove(producto);
        } else {
            carritoPedido.put(producto, unidadesActuales - 1);
        }

        out.println();
        out.printf("Se ha eliminado 1 unidad de %s. Importe actualizado: %.2f€\n", producto.name(), pedido.getImporteTotal());
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", direccion='" + DIRECCION + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}