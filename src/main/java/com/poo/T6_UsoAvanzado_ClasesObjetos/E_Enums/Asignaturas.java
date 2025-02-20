package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Enums;

import lombok.Getter;

public enum Asignaturas {

    PROGRAMACION(256), IPE(96), BBDO(224), LENGUAJE_MARCAS(96), SISTEMAS_INFORMATICOS(160), PROYECTO_INTERMODULAR(32), ENTORNOS_DESARROLLO(96);

    @Getter
    private int horas;

    Asignaturas(int horas){
        this.horas = horas;
    }
}