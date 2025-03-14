package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    protected void siguienteEstado(Pedido pedido) {
        switch (pedido.getEstadoPedido()){
            case RECIBIDO:
                pedido.setEstadoPedido(Estado.MONTANDO_PIZZA);
                System.out.println("Montando la pizza para... " + pedido.getCliente().getNombre() + ".");
                break;

            case MONTANDO_PIZZA:
                pedido.setEstadoPedido(Estado.HORNEANDO);
                System.out.println("Horneando la pizza para... " + pedido.getCliente().getNombre() + ".");
                break;

            case HORNEANDO:
                pedido.setEstadoPedido(Estado.PREPARANDO_PEDIDO);
                System.out.println("Preparando el pedido para... " + pedido.getCliente().getNombre() + ".");
                break;

            case PREPARANDO_PEDIDO:
                pedido.setEstadoPedido(Estado.LISTO);
                System.out.println("El pedido está Listo para... " + pedido.getCliente().getNombre() + ".");
                break;

            case CANCELADO:
                pedido.setEstadoPedido(Estado.CANCELADO);
                System.out.println("El cliente: " + pedido.getCliente().getNombre() + ", " + " ha cancelado el pedido");

            default:
                pedido.setEstadoPedido(Estado.CREANDO);
                System.out.println("Creando el pedido para... " + pedido.getCliente().getNombre() + ".");
        }
    }

    protected void entregarPedido(Pedido pedido, Cliente cliente) {
        try{
            pedido.getEstadoPedido().name().equals("LISTO");
            System.out.println("El pedido: " + pedido.getListaPizza() + " está siendo entregado por " + getNombre() + " al cliente " + cliente.getNombre() + ".");
        }catch (IntentoEntregaPedidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void obtenerDetalles() { // De Abstract class PizzaExpress
        System.out.println("Empleado " + getIdEmpleado() + ": " + getNombre());
    }

    @Override
    public void cancelar(Pedido pedido) { // De Interfaz accionesPedido
        pedido.setEstadoPedido(Estado.CANCELADO);
        System.out.println("el pedido de " + pedido.getListaPizza() + " a nombre de " + getNombre() + " ha sido " + Estado.CANCELADO.name());
    }
}