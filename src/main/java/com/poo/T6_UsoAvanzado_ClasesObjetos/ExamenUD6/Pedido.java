package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import lombok.Getter;
import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    @Getter
    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    @Getter
    private Estado estadoPedido;


    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        estadoPedido = Estado.CREANDO;
        listaPizzas = new ArrayList<>();

    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<CartaPizzas> getListaPizza() {
        return listaPizzas;
    }

    public void setListaPizza(ArrayList<CartaPizzas> listaPizza) {
        this.listaPizzas = listaPizza;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    protected double aplicarDescuento(){
        return cliente.getDescuento() * 0.01;
    }

    public void insertarPizza(CartaPizzas pizza){
        listaPizzas.add(pizza);
        System.out.println("Pizza " + pizza.name() + " añadida a tu cuenta.");
    }

    @Override
    protected void obtenerDetalles() {
        if (listaPizzas.isEmpty()){
            System.out.println(cliente.getNombre() + " no tiene ningún pedido.");
        }else if (listaPizzas.size() == 1){
            System.out.println(cliente.getNombre() + ", tiene un pedido de " + listaPizzas.size() + " pizza: " + getListaPizza() + " y el estado del pedido es: " + getEstadoPedido() + ".");
        }else {
            System.out.println(cliente.getNombre() + ", tiene un pedido de " + listaPizzas.size() + " pizzas: " + getListaPizza() + " y el estado del pedido es: " + getEstadoPedido() + ".");
        }
    }
}