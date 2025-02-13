package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.B_RedesSociales;

public class Streamer extends Usuario {

    private int numeroRetransmisiones;
    private int horasDirecto;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int numeroRetransmisiones, int horasDirecto) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numeroRetransmisiones = numeroRetransmisiones;
        this.horasDirecto = horasDirecto;

    }

    @Override // Información del Streamer + la del usuario la clase padre.
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas: " + numeroRetransmisiones);
        System.out.println("Horas de directo: " + horasDirecto);

    }
}