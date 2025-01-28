package com.poo.Televisor;


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

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int valorCanal){
        if (valorCanal >= 1 && valorCanal <= 99) {
            this.canal = valorCanal;
        }else{
            if(valorCanal < 1){
                this.canal = 0;
            }else{
                this.canal = 99;
            }
        }
    }

    public int subirCanal(){
        return this.canal++;
    }

    public int bajarCanal(){
        return this.canal--;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int valorVolumen){
        if (valorVolumen >= 1 && valorVolumen <= 99) {
            this.volumen = valorVolumen;
        }else{
            if(valorVolumen < 1){
                this.volumen = 0;
            }else{
                this.volumen = 99;
            }
        }
    }

    public int subirVolumen(){
        return this.volumen++;
    }

    public int bajarVolumen(){
        return this.volumen--;
    }

    @Override
    public String toString(){
        return "Televisor: [" + getCanal() + ", Volumen: " + getVolumen() + "]";
    }
}