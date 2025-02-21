package com.poo.T6_UsoAvanzado_ClasesObjetos.D_Enums;

import lombok.Getter;

@Getter
public enum JuegoDificultad {

    FACIL(2),
    MEDIO(4),
    DIFICIL(6),
    EXPERTO(8)
    ;

    private final int multiplicador;

    JuegoDificultad(int multiplicador) {
        this.multiplicador = multiplicador;
    }
}