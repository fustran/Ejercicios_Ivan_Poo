package com.poo.Exs.UD6.I;

public class IntentoEntregaPedidoException extends RuntimeException {

    public IntentoEntregaPedidoException() {
        super("ERROR: El pedido aún no se puede entregar, no está " + Estado.LISTO.name() + "...");
    }
}