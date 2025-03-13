package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

public class IntentoEntregaPedidoException extends RuntimeException {

    public IntentoEntregaPedidoException() {
        super("ERROR: El pedido no está " + Estado.LISTO.name());
    }
}