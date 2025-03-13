package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import java.util.Scanner;

public class Cliente extends PizzaExpress implements AccionesPedido{

    final Scanner teclado = new Scanner(System.in);

    private String nombre;
    private int descuento;


    public Cliente(String nombre) {
        this.nombre = nombre;
        this.descuento = 20;
    }


    protected void pedir(){
        System.out.println();
        System.out.println("¿Qué te apete comer hoy, " + nombre + "?");
        System.out.println();
        System.out.println("========== CARTA ==========");

        for(CartaPizzas pizzas : CartaPizzas.values()){
            System.out.println(pizzas + ": " + pizzas.precioEuro()); // Metodo añadido para mostrar el € desde el enum
        }
        System.out.println("===========================");

    }



    protected void pagar(){

    }


    protected void recoger(){

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getDescuento() {
        return descuento;
    }


    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }


    @Override
    protected void obtenerDetalles() { // De Abstract class PizzaExpress

    }

    @Override
    public void cancelar(Pedido pedido) { // De Interfaz accionesPedido

    }
}