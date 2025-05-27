package com.poo.Exs.UD6.P;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Cliente extends PizzaExpress implements AccionesPedido{

    static Scanner teclado = new Scanner(System.in);
    private static final int DESCUENTO_DEF=20;

    private String nombre;
    private int descuento;

    public Cliente(String nombre){
        this.nombre=nombre;
        descuento=DESCUENTO_DEF;
    }

    public void obtenerDetalles() {
        System.out.println("Cliente: " + nombre + " al que aplica un descuento del " + descuento + "% en sus pedidos.");
    }

    public void pedir(){
        System.out.println("¿Qué te apetece hoy, " +  nombre + "?");
        System.out.println("======CARTA======" );
        for (CartaPizzas pizza : CartaPizzas.values()){
            System.out.println(pizza + ": " + pizza.getPrecio() + "€");
        }
        System.out.println("=================" );
    }

    public void pagar(){
        System.out.println(nombre + " realizando pago en caja...");
    }

    public void recoger(){
        System.out.println("Pedido recogido por "+ nombre);
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.setEstadoPedido(Estado.CANCELADO);
        System.out.println("El pedido ha sido cancelado por el cliente " + nombre);
    }

}
