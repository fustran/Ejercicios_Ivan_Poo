package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import lombok.*;

@Getter
@Setter
public class Cliente extends PizzaExpress implements AccionesPedido {

    private String nombre;
    private int descuento;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.descuento = 20;
    }

    protected void pedir() {
        System.out.println();
        System.out.println("¿Qué te apete comer hoy, " + getNombre() + "?");
        System.out.println();
        System.out.println("========== CARTA ==========");

        for (CartaPizzas pizzas : CartaPizzas.values()) {
            System.out.println(pizzas + ": " + pizzas.precioEuro()); // Metodo añadido para mostrar el € desde el enum
        }
        System.out.println("===========================");

    }

    protected void pagar(Pedido pedido) {
        System.out.println(getNombre() + " está realizando el pago del pedido: " + pedido.getListaPizzas());
    }

    protected void recoger(Pedido pedido) {
        System.out.println(getNombre() + " está recogiendo su pedido de " + pedido.getListaPizzas().size() + " pizza/s: " + pedido.getListaPizzas());
    }


    @Override
    protected void obtenerDetalles() { // De Abstract class PizzaExpress
        System.out.println("Cliente " + getNombre() + ": " + " esta haciendo un pedido." );
    }

    @Override
    public void cancelar(Pedido pedido) { // De Interfaz accionesPedido
        pedido.setEstadoPedido(Estado.CANCELADO);
        System.out.println("El pedido de " + getNombre() + ", ha sido " + Estado.CANCELADO.name() + ".");
    }
}