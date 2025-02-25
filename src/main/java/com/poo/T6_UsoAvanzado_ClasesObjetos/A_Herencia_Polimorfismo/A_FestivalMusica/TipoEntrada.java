package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

import lombok.Getter;

@Getter
public enum TipoEntrada {

    GENERAL(50),
    PISTA(75),
    VIP(250);

    private final int precio;

    TipoEntrada(int precio) {
        this.precio = precio;
    }

}