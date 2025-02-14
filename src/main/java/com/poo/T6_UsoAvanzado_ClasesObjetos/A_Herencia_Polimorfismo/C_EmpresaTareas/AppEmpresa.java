package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.C_EmpresaTareas;

public class AppEmpresa {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Desarrollador(),
                new Diseñador(),
                new Gerente()
        };

        System.out.println();

        System.out.println("=== Usando el array polimórfico ===");
        for(Empleado empleado : empleados) {
            empleado.realizarTarea();
        }

        Empleado gerente = new Gerente();
        Empleado desarrolador = new Desarrollador();

        System.out.println();

        System.out.println("=== Usando el metodo asignarTarea() ===");
        asignarTarea(gerente);
        asignarTarea(desarrolador);

    }

    public static void asignarTarea(Empleado empleado) {
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();

    }
}