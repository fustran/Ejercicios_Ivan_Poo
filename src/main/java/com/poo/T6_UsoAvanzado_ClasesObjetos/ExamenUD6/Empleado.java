package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

public class Empleado extends PizzaExpress implements AccionesPedido{

    private static final String ID_EMPLEADO = "EMP";
    private static int contadorEmpleados = 0;

    private String idEmpleado;
    private String nombre;


    public Empleado(String nombre) {
        this.nombre = nombre;
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

    }


    protected void entregarPedido(Pedido pedido) {

    }


    @Override
    protected void obtenerDetalles() { // De Abstract class PizzaExpress

    }


    @Override
    public void cancelar(Pedido pedido) { // De Interfaz accionesPedido

    }
}