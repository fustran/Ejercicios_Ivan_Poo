package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

public class IntentoEntregaPedidoException extends RuntimeException {

    public IntentoEntregaPedidoException() {
        super("ERROR: El pedido aún no se puede entregar, no está " + Estado.LISTO.name() + "...");
    }
}