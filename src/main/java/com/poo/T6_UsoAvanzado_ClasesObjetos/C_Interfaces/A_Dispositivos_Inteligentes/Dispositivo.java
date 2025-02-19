package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

import lombok.*;

@Getter
@Setter
public abstract class Dispositivo {

    private String nombre;
    private boolean estado;


    protected abstract void encender();

}