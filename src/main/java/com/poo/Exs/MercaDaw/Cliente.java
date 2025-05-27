package com.poo.Exs.MercaDaw;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;
/**
 * Clase Cliente donde se almacenan todos los datos del cliente
 */
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

    /**
     * Metodo que crea el pedido con un importe default de 0 € y promociones sin aplicar.
     */
    public void crearPedido() {
        this.pedido = new Pedido(0.0);
        this.promociones = false;
    }

    /**
     * Metodo para insertar productos en el mapa de tipo pedido, habiendo sido comprobado su existencia en el ENUM previamente.
     * @param productoElegido El producto a insertar.
     */
    public void insertarProducto(String productoElegido) {

        Producto producto = Producto.valueOf(productoElegido);
        Map<Producto,Integer> mapa = pedido.getPedido();

        mapa.put(producto, mapa.getOrDefault(producto, 0) + 1);

        double nuevoImporte = pedido.getImporteTotal() + producto.getProductos();
        pedido.setImporteTotal(nuevoImporte);
    }

    /**
     * Metodo que gestiona el importe del pedido.
     * @return El importe total del pedido.
     */
    public double importePedido() {
        return pedido.getImporteTotal();
    }

    /**
     * Metodo para mostrar un resumen de compra recorriendo el mapa Pedido vinculado al cliente.
     */
    public void mostrarResumenCompra() {
        out.println();
        out.println("=======================================");
        out.println();
        out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        out.println();

        recorrerMap();
    }

    /**
     * Metodo para ordenar los productos por unidades descentente usando un metodo que implementa la interfaz Comparator.
     */
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

        //Recorremos la lista ordenada
        for (Map.Entry<Producto, Integer> entry : listaProductos) {
            Producto producto = entry.getKey();
            int unidades = entry.getValue();
            double precioUnidad = producto.getProductos();

            out.printf("%d %s %.2f€\n", unidades, producto.name(), precioUnidad);
        }

        out.println();
        out.printf("IMPORTE TOTAL: %.2f€\n", pedido.getImporteTotal());

    }

    /**
     * Metodo para recorrer el mapa Pedido, su clave, valor y el precio de cada producto.
     */
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

    /**
     * Metodo para elimiar productos del mapa Pedido y mostrar el resumen del pedido actualizado.
     * @param opcionElegida El producto a eliminar del mapa.
     */
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