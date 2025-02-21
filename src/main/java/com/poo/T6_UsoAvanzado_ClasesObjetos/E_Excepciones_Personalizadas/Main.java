package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas;

public class Main {

    public static void main(String[] args) {

        int nivel = 150;

        if(nivel > 100) {
            throw new NivelMaximoException();
        }
    }
}