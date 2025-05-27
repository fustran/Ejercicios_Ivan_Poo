package com.poo.Exs.Rec_567_1.I;

import lombok.Getter;

@Getter
public enum MetodoPago {

    PAYPAL(0.5),
    BIZUM(1.0),
    APPLEPAY(1.5)
    ;

    private final double precio;

    MetodoPago(double precio) {
        this.precio = precio;
    }

}