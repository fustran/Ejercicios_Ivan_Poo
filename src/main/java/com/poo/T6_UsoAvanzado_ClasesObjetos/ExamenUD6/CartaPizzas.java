package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

public enum CartaPizzas {

    BBQ(9),
    CARBONARA(8),
    JAMON_YORK(6),
    ATUN(7.5),
    HAWAIANA(7),
    VEGGIE(10);

    private final double precio;

    CartaPizzas(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}