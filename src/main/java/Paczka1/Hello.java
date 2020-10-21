package Paczka1;

public class Hello {

    public static void main(String[] args){
        PL polska= new PL();
        ENG anglia= new ENG();
        ESP hiszpania= new ESP();
        System.out.println(anglia.greeting());
        System.out.println(polska.greeting());
        System.out.println(hiszpania.greeting());
        System.out.println("ej masz jakiś cynk?");
        System.out.println("dawaj bo czeka już drink");
    }
}

