package com.poo.T6_UsoAvanzado_ClasesObjetos.D_Enums;

public enum Semaforo {

    ROJO(),
    VERDE(),
    AMARILLO()
    ;

    public Semaforo siguiente(Semaforo estado) {
        if (estado == Semaforo.ROJO) {
            return Semaforo.VERDE;
        } else if (estado == Semaforo.VERDE) {
            return Semaforo.AMARILLO;
        } else if (estado == Semaforo.AMARILLO) {
            return Semaforo.ROJO;
        }
        return AMARILLO;
    }
}