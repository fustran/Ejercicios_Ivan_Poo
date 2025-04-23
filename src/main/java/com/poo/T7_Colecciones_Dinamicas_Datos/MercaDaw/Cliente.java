package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import lombok.*;

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

    public void insertarProducto() {

    }

    public double importePedido() {
        return 0.0;
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