package com.company;

import org.xml.sax.HandlerBase;

public abstract class Persona {
private String nom, cognom, correu;
private int telefon;

    public Persona(String nom, String cognom, String correu, int telefon){
        this.nom=getName();
        this.cognom=getSurname();
        this.correu=getCorreu();
        this.telefon=getTelefon();
    }
    public String getName() {
        return nom;
    }

    public void setName(String name) {
        this.nom = name;
    }

    public String getSurname() {
        return this.cognom;
    }

    public void setSurname(String surname) {
        this.cognom = surname;
    }

    public String getCorreu() {
        return this.correu;
    }

    public void setCorreu(String email) {
        this.correu = email;
    }

    public int getTelefon() {
        return this.telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

}

