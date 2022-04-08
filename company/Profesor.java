package com.company;

public class Profesor extends Persona{
    private int identificadorprofesor, experiencia;
    public Profesor (String nom, String cognom, String correu, int telefon, int identificadorprofesor, int experiencia){
        super(nom, cognom, correu, telefon);
        this.setIdentificadorprofesor(identificadorprofesor);
        this.setExperiencia(experiencia);
    }

    public int getIdentificadorprofesor() {
        return this.identificadorprofesor;
    }

    public void setIdentificadorprofesor(int identificadorprofesor) {
       this.identificadorprofesor = identificadorprofesor;
    }
    public int getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


}
