package com.poo.Exs.UD6.I;

import java.util.Scanner;

public class AppPizzaExpress {
    public static void main(String[] args) {

        final Scanner teclado = new Scanner(System.in);

        //crear 2 empleados e imprimir info obtenerDetalles()
        System.out.println();
        System.out.println("====== BIENVENIDO/A A PIZZA EXPRESS =======");

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
        System.out.println("Hola, " + nombre + "!");


        //crear new Cliente con dicho nombre
        Cliente cliente1 = new Cliente(nombre);


        //crear new Pedido para el Cliente creado y estado = CREANDO
        Pedido pedido1 = new Pedido(cliente1);

        boolean opcionCorrecta = false;

        double total = 0.0;
        while (!opcionCorrecta){
            //pedir() preguntar qué le apetece hoy al Cliente y mostrar cartade pizzas
            cliente1.pedir();
            String pizza = teclado.nextLine().trim().toUpperCase();

            //Elegir pizza – si existe en la carta, añadir al ArrayList del pedido. Si no, saltará como inválido por no estar incluida enum
            try{
                CartaPizzas pizzas = CartaPizzas.valueOf(pizza);
                pedido1.insertarPizza(pizzas);
                opcionCorrecta = true;
                //preguntar si se quieren añadir más pizzas al pedido (S/N)
                System.out.println("El precio actual de la cuenta es: " + pizzas.getPrecio() + "€, "  + "¿Quieres añadir otra pizza al pedido? [S/N].");
                total = pizzas.getPrecio();

            }catch (IllegalArgumentException e){
                System.out.println("ERROR: La pizza elegida no existe.");
            }
        }

        boolean pedir = false;

        while (!pedir) {
            String respuesta = teclado.nextLine().trim().toUpperCase();
            switch (respuesta) {
                //S
                case "S":
                    total = 0.0;
                    emp1.mostrarCarta(cliente1);
                    String otraPizza = teclado.nextLine().trim().toUpperCase();
                    try {
                        CartaPizzas nuevaPizza = CartaPizzas.valueOf(otraPizza);
                        pedido1.insertarPizza(nuevaPizza);

                        for(CartaPizzas pizzasElegidas : pedido1.getListaPizzas()){
                            total += pizzasElegidas.getPrecio();
                        }
                        System.out.println("El precio actual de la cuenta es " + total + "€, " + "¿Quieres añadir otra pizza al pedido? [S/N].");

                    } catch (IllegalArgumentException e) {
                        System.out.println("ERROR: La pizza elegida no existe.");

                    }
                    break;

                //N
                case "N":
                    pedir = true;
                    continue;

                default:
                    System.out.println("Opcion incorrecta!");
                    System.out.println("¿Quieres añadir otra pizza al pedido? [S/N].");
            }
        }

        //modificar estado del Pedido a RECIBIDO
        pedido1.setEstadoPedido(Estado.RECIBIDO);

        //obetenerDetaller() Pedido
        pedido1.obtenerDetalles();

        //decir precio acumulado del pedido.
        System.out.println("Pedido " + Estado.RECIBIDO.name() + "." + " El total del pedido es: " + total + "€");

        //Mostrar “Pedido RECIBIDO" (Estado). Total pedido: importe. Descuento a aplicar: 20%. Total a pagar: importe-descuento
        System.out.println("Descuento a aplicar: " + cliente1.getDescuento() + "%." + " Total importe a pagar: " + (total - (total * pedido1.aplicarDescuento()) + "€."));

        //Mostrar “Pasa por caja para pagar y recoger tu pedido cuando esté LISTO. Muchas gracias nombre"
        System.out.println("Pasa por caja para pagar y recoger tu pedido cuando esté " + Estado.LISTO.name() + ", muchas gracias " + cliente1.getNombre() + "!");

        //avanzar estado a MONTANDO_PIZZA e imprimir
        emp1.siguienteEstado(pedido1);

        //avanzar estado a HORNEANDO e imprimir
        emp1.siguienteEstado(pedido1);

        //intento de entregar() pedido por alguno de los empleados
        try {
            emp2.entregarPedido(pedido1, cliente1);
        }catch (IntentoEntregaPedidoException e){
            System.out.println(e.getMessage());
        }

        //avanzar estado a PREPARANDO_PEDIDO e imprimir
        emp1.siguienteEstado(pedido1);

        //avanzar estado a LISTO e imprimir
        emp1.siguienteEstado(pedido1);

        //pagar() Pedido
        cliente1.pagar(pedido1);

        //entregar() Pedido
        emp1.entregarPedido(pedido1, cliente1);

        //recoger()
        cliente1.recoger(pedido1);

        //cancelar() Pedido
        cliente1.cancelar(pedido1);
    }
}