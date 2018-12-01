package Jacek.Nowy;

public class MamaMain {

    public static void main(String[] args)
    {

        Dziecko jasio = new Dziecko();
        Mama teresa = new Mama();
        Skarbonka nowa = new Skarbonka();
        Portfel portfelMamy = new Portfel();



        ////------------------------------

        System.out.println("jasia skarbonka posiada " +  jasio.getRozowaSwinka().getIloscPieniedzy()+ " zl");

        teresa.setKieszonkowe(jasio, 70);
        teresa.setKieszonkowe(jasio, -10);


        System.out.println("jasia skarbonka posiada " +  jasio.getRozowaSwinka().getIloscPieniedzy() + " zl");


    }


}
