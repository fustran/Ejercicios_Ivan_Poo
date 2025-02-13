package com.poo.T5_Introduccion_Poo.Practica_1;

public class Empleado {

    private static final String ID_EMPLEADO = "EP";
    private static int cantidadEmpleados = 0;

    private final String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        cantidadEmpleados++;
        this.id = generarIdEmpleado();
        setCargo(cargo);

        if (!"director".equals(this.cargo)) {
            this.director = director;
        } else {
            this.director = null;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }


    private String generarIdEmpleado() {
        return ID_EMPLEADO + String.format("%03d", cantidadEmpleados);
    }


    public String getId() {
        return id;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador"))) {
            this.cargo = cargo;
        }
        if ("director".equals(this.cargo)) {
            this.director = null;
        }
    }


    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return "Empleado: " +
                            "[Nombre = " + getNombre() +
                            ", ID = " + getId()  +
                            ", Cargo = " + getCargo()  +
                            ", Director = " + getDirector()  +
                            "]";
    }
}