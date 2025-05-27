package com.poo.Exs.UD6.P;

public class Empleado extends PizzaExpress implements AccionesPedido {

    private static final String ID_ = "EMP";
    private static int id_auto = 0;

    private String id_empleado;
    private String nombre;

    public Empleado(String nombre){
        this.nombre=nombre;
        id_auto++;
        generarID();
    }

    public void obtenerDetalles() {
        System.out.println("Empleado " + id_empleado + ": " + nombre);
    }

    public void generarID(){
        id_empleado = ID_ + String.format("%03d", id_auto);
    }

    public void siguienteEstado(Pedido pedido){

        switch (pedido.getEstadoPedido()){
            case RECIBIDO:
                pedido.setEstadoPedido(Estado.MONTANDO_PIZZA);
                System.out.println(Estado.MONTANDO_PIZZA.name() + "...");
                break;
            case MONTANDO_PIZZA:
                pedido.setEstadoPedido(Estado.HORNEANDO);
                System.out.println(Estado.HORNEANDO.name() + "...");
                break;
            case HORNEANDO:
                pedido.setEstadoPedido(Estado.PREPARANDO_PEDIDO);
                System.out.println(Estado.PREPARANDO_PEDIDO.name() + "...");
                break;
            case PREPARANDO_PEDIDO:
                pedido.setEstadoPedido(Estado.LISTO);
                System.out.println(Estado.LISTO.name() + "!!");
                break;
            default:
                pedido.setEstadoPedido(Estado.CANCELADO);
                System.out.println(Estado.CANCELADO.name() + "...");
                break;
        }
    }

    public void entregarPedido(Pedido pedido){
        if (pedido.getEstadoPedido() != Estado.LISTO){
            System.out.println("INTENTO DE ENTREGA. El pedido todavía no está listo para entregarse. Estado: " + pedido.getEstadoPedido());
        }else{
            System.out.println("Entregando pedido a " + pedido.getCliente().getNombre());
        }
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.setEstadoPedido(Estado.CANCELADO);
        System.out.println("El pedido ha sido cancelado por el empleado " + nombre);
    }
}
