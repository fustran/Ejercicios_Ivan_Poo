package com.poo.Exs.UD6.P;

import java.util.Scanner;

public class AppPizzaExpress {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean valido=true;
        String respuesta="N";
        int cont=0;

        //crear 2 empleados e imprimir info obtenerDetalles()
        System.out.println("*** BIENVENIDO A PIZZAEXPRESS DE MUTXAMEL ***");
        Empleado empleado1 = new Empleado("Carlos");
        empleado1.obtenerDetalles();
        Empleado empleado2 = new Empleado("Sabrina");
        empleado2.obtenerDetalles();

        //iniciar pedido preguntando nombre
        //responder un nombre
        System.out.println("Haz tu pedido...¿cómo te llamas?");
        String nombre = teclado.next();

        //crear new Cliente con dicho nombre
        Cliente cliente = new Cliente(nombre);

        //crear new Pedido para el Cliente creado y estado = CREANDO
        Pedido pedido = new Pedido(cliente);

        //pedir() preguntar qué le apetece hoy al Cliente y mostrar carta de pizzas
        //elegir pizza
        //decir precio de la pizza elegida y preguntar si quiere añadir más pizzas al pedido (S/N)
        //N
        do{
            cliente.pedir();
            String pizza = teclado.next();
            try{
                CartaPizzas pizza_elegida = CartaPizzas.valueOf(pizza.toUpperCase());
                pedido.insertarProducto(pizza_elegida);
                valido=true;
                cont++;
            }catch (IllegalArgumentException e){
                System.out.println("El producto escogido no está disponible.");
                valido=false;
            }

            System.out.println("El precio actual de la cuenta es de " + pedido.importePedido() + "€. ¿Quieres añadir otra pizza a tu pedido? [S/N]");
            respuesta = teclado.next();

            if(respuesta.equalsIgnoreCase("N")){
                break;
            }

        }while (!valido || respuesta.equalsIgnoreCase("S"));

        if (valido || cont!=0) {
            //modificar estado del Pedido a RECIBIDO
            pedido.setEstadoPedido(Estado.RECIBIDO);
            //mostrar "Pedido RECIBIDO" (Estado). Total pedido: importe. Descuento a aplicar: 20%. Total a pagar: importe-descuento
            System.out.println("Pedido " + pedido.getEstadoPedido() + ". Total pedido: " + pedido.importePedido() + "€.");
            System.out.println("Descuento a aplicar: " + cliente.getDescuento() + "%. Total importe a pagar: " + pedido.aplicarDescuento() + "€");
            //mostrar "Pasa por caja para pagar y recoger tu pedido cuando esté LISTO. Muchas gracias."
            System.out.println("Pasa por caja para pagar y recoger tu pedido cuando esté listo. Muchas gracias " + cliente.getNombre() + ".");
            //avanzar estado a MONTANDO_PIZZA e imprimir
            empleado1.siguienteEstado(pedido);
            //avanzar estado a HORNEANDO e imprimir
            empleado1.siguienteEstado(pedido);
            //intento de entregar() pedido por alguno de los empleados
            empleado2.entregarPedido(pedido);
            //avanzar estado a PREPARANDO_PEDIDO e imprimir
            empleado1.siguienteEstado(pedido);
            //avanzar estado a LISTO e imprimir
            empleado1.siguienteEstado(pedido);
            //pagar() Pedido
            cliente.pagar();
            //entregar() Pedido
            empleado2.entregarPedido(pedido);
            //recoger()
            cliente.recoger();
        }else{
            System.out.println("NO has añadido ningún producto. Pedido finalizado.");
            pedido.setEstadoPedido(Estado.CANCELADO);
        }

    }

}
