package com.poo.T7_Colecciones_Dinamicas_Datos.Practica_1;

import lombok.*;

@Getter
@Setter
public class Cliente {

    private static final String DIRECCION  = "Calle Falsa, 123";

    private String usuario;
    private String password;
    private Pedido pedido;
    boolean promociones; // siempre tienen 3x2 y 10% e indica si ya han sido aplicadas o no.

    public Cliente(String usuario, String password) {
        this.usuario = usuario;
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
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", direccion='" + DIRECCION + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}