package com.company;
import java.util.Scanner;

public class Main {
    public static final String MSG1="introdueix el nom del profesor: ";
    public static final String MSG2="introdueix el cognom del profesor:  ";
    public static final String MSG3="introdueix el correu del profesor:  ";
    public static final String MSG4="introdueix el telefon del profesor: ";
    public static final String MSG5="introdueix el identificador del profesor:  ";
    public static final String MSG6="introdueix el experiencia del profesor: ";

    public static void main(String[] args) {
        String nom, cognom, correu;
        int telefon, identificador, experiencia;
        Scanner sc=new Scanner(System.in);

        System.out.println (MSG1);
        nom = sc.next();
        System.out.println (MSG2);
        cognom=sc.next();
        System.out.println (MSG3);
        correu= sc.next();
        System.out.println (MSG4);
        telefon=sc.nextInt();
        System.out.println (MSG5);
        identificador=sc.nextInt();
        System.out.println (MSG6);
        experiencia=sc.nextInt();
        Profesor pro= new Profesor( nom, cognom, correu, telefon, identificador, experiencia);
        System.out.println ("el nom del profesor es: "+ pro.getName());
        System.out.println ("el cognom del profesor es: "+ pro.getSurname());
        System.out.println ("el correu del profesor es:: "+ pro.getCorreu());
        System.out.println ("el telefon del profesor es:: "+ pro.getTelefon());
        System.out.println ("el identificador del profesor es: "+ pro.getIdentificadorprofesor());
        System.out.println ("l'experiencia del profesor es: "+ pro.getExperiencia());
       // System.out.println(MSG1);
        // qua.setSide(sc.nextInt());
        // System.out.println(MSG2);
        //   qua.setColor(sc.next());
        //  System.out.println ("el area es: "+qua.calcArea());
        //   System.out.println(qua.getColor());
        Alumne al =new Alumne("cesar","bravo", "caasa", 3232);
        System.out.println ("id alumne: ");
        al.setIdalumne(sc.nextInt());

    }
}
