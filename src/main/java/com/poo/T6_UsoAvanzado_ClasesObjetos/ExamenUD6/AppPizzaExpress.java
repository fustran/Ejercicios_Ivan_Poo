package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import java.util.Scanner;

public class AppPizzaExpress {
    public static void main(String[] args) {

        final Scanner teclado = new Scanner(System.in);

        //crear 2 empleados e imprimir info obtenerDetalles()
        System.out.println();
        System.out.println("====== Bienvenido a Pizza Express=======");

        Empleado emp1 = new Empleado("Iván");
        emp1.obtenerDetalles();

        Empleado emp2 = new Empleado("Sarita");
        emp2.obtenerDetalles();


        //iniciar pedido preguntando nombre
        System.out.println();
        System.out.println("Haz tú pedido, ¿Cómo te llamas?");
        String nombre = teclado.nextLine().trim();


        //responder un nombre
        System.out.println();
        System.out.println("Hola, " + nombre + ".");


        //crear new Cliente con dicho nombre
        Cliente cliente1 = new Cliente(nombre);


        //crear new Pedido para el Cliente creado y estado = CREANDO
        Pedido pedido1 = new Pedido(cliente1);


        //pedir() preguntar qué le apetece hoy al Cliente y mostrar cartade pizzas
        cliente1.pedir();
        String pizza = teclado.nextLine().trim().toUpperCase();

        try{
            CartaPizzas pizzas = CartaPizzas.valueOf(pizza);
            pedido1.insertarPizza(pizzas);
            System.out.println("Pizza " + pizzas.name() + " añadida a tu cuenta");
        }catch (IllegalArgumentException e){
            System.out.println("La pizza elegida no existe");
        }


        //elegir pizza – si existe en la carta, añadir al ArrayList del pedido. Si no, saltará como inválido por no estar incluida enum

        //decir precio acumulado del pedido y preguntar si se quieren añadir más pizzas al pedido (S/N)

        //N

        //modificar estado del Pedido a RECIBIDO

        //mostrar “Pedido RECIBIDO" (Estado). Total pedido: importe. Descuento a aplicar: 20%. Total a pagar: importe-descuento

        //mostrar “Pasa por caja para pagar y recoger tu pedido cuando esté LISTO. Muchas gracias nombre"

        //avanzar estado a MONTANDO_PIZZA e imprimir

        //avanzar estado a HORNEANDO e imprimir

        //intento de entregar() pedido por alguno de los empleados

        //avanzar estado a PREPARANDO_PEDIDO e imprimir

        //avanzar estado a LISTO e imprimir

        //pagar() Pedido

        //entregar() Pedido

        //recoger()

    }
}