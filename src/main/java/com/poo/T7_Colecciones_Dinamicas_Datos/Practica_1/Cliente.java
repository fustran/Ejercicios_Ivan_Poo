package com.poo.T7_Colecciones_Dinamicas_Datos.Practica_1;

import lombok.*;

@Getter
@Setter
public class Cliente {

    private String usuario;
    private String password;
    private String direccion;
    private Pedido pedido;
    boolean promociones; // siempre tienen 3x2 y 10% e indica si ya han sido aplicadas o no.

    public Cliente(String usuario, String password, String direccion, Pedido pedido, boolean promociones) {
        this.usuario = usuario;
        this.password = password;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
    }

    public void crearPedido() {

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
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}