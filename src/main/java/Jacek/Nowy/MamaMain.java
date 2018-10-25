package Jacek.Nowy;

public class MamaMain {

    public static void main(String[] args) {

        Dziecko jasio = new Dziecko();
        Mama teresa = new Mama();

        System.out.println("jasia skarbonka posiada" +  jasio.getSkarbonka() + "zl");

        teresa.dajeKieszkonkowe(jasio, 70);

        System.out.println("jasia skarbonka posiada" +  jasio.getSkarbonka() + "zl");


    }




}
