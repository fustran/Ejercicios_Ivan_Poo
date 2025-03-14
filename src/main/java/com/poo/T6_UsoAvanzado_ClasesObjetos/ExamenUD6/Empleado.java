package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import lombok.*;

@Getter
@Setter
public class Empleado extends PizzaExpress implements AccionesPedido{

    private static final String ID_EMPLEADO = "EMP";
    private static int contadorEmpleados = 0;

    private String idEmpleado;
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
        contadorEmpleados++;
        this.idEmpleado = generarIdEmpleado();

    }

    protected String generarIdEmpleado() {
        return ID_EMPLEADO + String.format("%03d", contadorEmpleados);
    }

    protected void siguienteEstado(Pedido pedido) {
        switch (pedido.getEstadoPedido()){
            case RECIBIDO:
                pedido.setEstadoPedido(Estado.MONTANDO_PIZZA);
                System.out.println(Estado.MONTANDO_PIZZA.name() + " la pizza para: " + pedido.getCliente().getNombre() + "!");
                break;

            case MONTANDO_PIZZA:
                pedido.setEstadoPedido(Estado.HORNEANDO);
                System.out.println(Estado.HORNEANDO.name() +" la pizza para: " + pedido.getCliente().getNombre() + "!");
                break;

            case HORNEANDO:
                pedido.setEstadoPedido(Estado.PREPARANDO_PEDIDO);
                System.out.println(Estado.PREPARANDO_PEDIDO.name() + " para: " + pedido.getCliente().getNombre() + "!");
                break;

            case PREPARANDO_PEDIDO:
                pedido.setEstadoPedido(Estado.LISTO);
                System.out.println("El pedido de: " + pedido.getCliente().getNombre() + ", " + "está " + Estado.LISTO.name() + ".");
                break;

            default:
                pedido.setEstadoPedido(Estado.CANCELADO);
                System.out.println("El cliente: " + pedido.getCliente().getNombre() + ", " + " ha " + Estado.CANCELADO.name() + " el pedido.");
        }
    }

    protected void mostrarCarta(Cliente cliente) {
        System.out.println();
        System.out.println("¿Qué otra pizza quieres añadir, " + cliente.getNombre() + "?");

        System.out.println();
        System.out.println("========== CARTA ==========");
        for (CartaPizzas pizzas : CartaPizzas.values()) {
            System.out.println(pizzas + ": " + pizzas.precioEuro()); // Metodo añadido para mostrar el € desde el enum
        }

        System.out.println("===========================");
    }

    protected void entregarPedido(Pedido pedido, Cliente cliente) {
        if(!pedido.getEstadoPedido().name().equals(Estado.LISTO.name())){
            throw new IntentoEntregaPedidoException();
        }else {
            System.out.println("El pedido: " + pedido.getListaPizzas() + " está siendo entregado por " + getNombre() + " al cliente " + cliente.getNombre() + ".");
        }
    }

    @Override
    protected void obtenerDetalles() { // De Abstract class PizzaExpress
        System.out.println("Empleado " + getIdEmpleado() + ": " + getNombre());
    }

    @Override
    public void cancelar(Pedido pedido) { // De Interfaz accionesPedido
        pedido.setEstadoPedido(Estado.CANCELADO);
        System.out.println("el pedido de " + pedido.getListaPizzas() + " a nombre de " + getNombre() + " ha sido " + Estado.CANCELADO.name());
    }
}