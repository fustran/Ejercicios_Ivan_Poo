package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import lombok.*;
import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class Pedido extends PizzaExpress{

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    private Estado estadoPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        estadoPedido = Estado.CREANDO;
        listaPizzas = new ArrayList<>();

    }

    protected double aplicarDescuento(){
        return cliente.getDescuento() * 0.01;
    }

    protected void insertarPizza(CartaPizzas pizza){
        listaPizzas.add(pizza);
        System.out.println();
        System.out.println("Pizza " + "'" + pizza.name() + "'" + " añadida a tu cuenta.");
    }

    @Override
    protected void obtenerDetalles() {
        if (listaPizzas.isEmpty()){
            System.out.println(cliente.getNombre() + " no tiene ningún pedido.");
        }else if (listaPizzas.size() == 1){
            System.out.println(cliente.getNombre() + ", tiene un pedido de " + listaPizzas.size() + " pizza: " + getListaPizzas() + " y el estado del pedido es: " + getEstadoPedido() + ".");
        }else {
            System.out.println(cliente.getNombre() + ", tiene un pedido de " + listaPizzas.size() + " pizzas: " + getListaPizzas() + " y el estado del pedido es: " + getEstadoPedido() + ".");
        }
    }
}