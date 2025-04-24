package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import lombok.*;
import java.util.HashMap;

@Getter
@Setter
public class Cliente {

    private static final String DIRECCION  = "Calle Falsa, 123";

    private String nombre;
    private String password;
    private Pedido pedido;
    boolean promociones; // siempre tienen 3x2 y 10% e indica si ya han sido aplicadas o no.

    public Cliente(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;

    }

    public void crearPedido() {
        this.pedido = new Pedido(0.0);
        this.promociones = false;
    }

    public void insertarProducto(String producto) {
        Producto productoEnum = Producto.valueOf(producto);
        HashMap<Producto, Integer> pedidoMapa = pedido.getPedido();

        pedidoMapa.put(productoEnum, pedidoMapa.getOrDefault(productoEnum, 0) + 1);

        double nuevoImporte = pedido.getImporteTotal() + productoEnum.getProductos();
        pedido.setImporteTotal(nuevoImporte);
    }

    public double importePedido() {
        return pedido.getImporteTotal();
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