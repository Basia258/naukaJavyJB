package Jacek.Nowy;

public class MamaMain {

    public static void main(String[] args) {

        Dziecko jasio = new Dziecko();
        Mama teresa = new Mama();
        Skarbonka nowa = new Skarbonka();

        System.out.println("jasia skarbonka posiada" +  jasio.getRozowaSwinka() + "zl");

        teresa.dajeKieszkonkowe(jasio, 70);
        teresa.dajeKieszkonkowe(jasio,70);

        System.out.println("jasia skarbonka posiada" +  jasio.getRozowaSwinka() + "zl");


    }




}
