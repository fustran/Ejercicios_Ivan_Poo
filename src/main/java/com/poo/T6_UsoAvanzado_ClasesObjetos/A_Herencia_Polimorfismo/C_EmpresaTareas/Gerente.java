package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.C_EmpresaTareas;

public class Gerente extends Empleado {

    @Override
    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }

}