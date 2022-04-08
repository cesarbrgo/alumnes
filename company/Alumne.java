package com.company;

public class Alumne extends Persona {
    private int Idalumne;//IDAlumne
    public Alumne (String nom, String cognom, String correu, int telefon){
        super(nom, cognom, correu, telefon);
        this.Idalumne=getIdalumne();
    }


    public int getIdalumne() {
        return this.Idalumne;
    }

    public void setIdalumne(int Idalumne) {
        this.Idalumne = Idalumne;
    }
}
