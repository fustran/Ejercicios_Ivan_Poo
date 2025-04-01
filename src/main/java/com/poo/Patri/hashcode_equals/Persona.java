package com.poo.Patri.hashcode_equals;

import lombok.Getter;

@Getter
public class Persona {

    private int edad;

    public Persona (int edad){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }


}
