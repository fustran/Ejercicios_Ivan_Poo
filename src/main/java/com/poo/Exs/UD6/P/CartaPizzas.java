package com.poo.Exs.UD6.P;

import lombok.Getter;

public enum CartaPizzas {

    BBQ(9),CARBONARA(8),JAMON_YORK(6),ATUN(7.5),HAWAIANA(7),VEGGIE(10);

    @Getter
    private double precio;

    CartaPizzas(double precio){
        this.precio=precio;
    }

}
