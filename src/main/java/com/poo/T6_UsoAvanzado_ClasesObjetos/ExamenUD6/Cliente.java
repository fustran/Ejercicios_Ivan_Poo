package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

public class Cliente extends PizzaExpress implements AccionesPedido{


    private String nombre;
    private int descuento;


    public Cliente(String nombre) {
        this.nombre = nombre;
        this.descuento = 20;
    }


    protected void pedir(){

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