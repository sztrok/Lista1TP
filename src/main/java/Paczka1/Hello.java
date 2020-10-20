package Paczka1;

public class Hello {

    public static void main(String[] args){
        PL polska= new PL();
        ENG anglia= new ENG();
        System.out.println(anglia.greeting());
        System.out.println(polska.greeting());
    }
}

