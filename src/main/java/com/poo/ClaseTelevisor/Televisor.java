package com.poo.ClaseTelevisor;


public final class Televisor {

    private int canal;
    private int volumen;

    public Televisor(){
        this.canal = 1;
        this.volumen = 5;
    }

    public Televisor(int valorCanal, int valorVolumen){
        setCanal(valorCanal);
        setVolumen(valorVolumen);
    }

    public int subirCanal(){
        return this.canal++;
    }

    public int bajarCanal(){
        return this.canal--;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int valorCanal){
        if (valorCanal == 1 || valorCanal == 99){
            valorCanal++;
        }else{
            this.canal = valorCanal;
        }
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int valorVolumen){
        if (valorVolumen == 1 || valorVolumen == 99) {
            valorVolumen++;
        }else{
            this.volumen = valorVolumen;
        }
    }
}