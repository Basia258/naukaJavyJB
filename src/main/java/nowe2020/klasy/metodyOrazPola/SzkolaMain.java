package nowe2020.klasy.metodyOrazPola;

import java.util.Scanner;

public class SzkolaMain {

    public static void main(String[] args) {

        System.out.println("Tworzymy potrzebne nam obikety, czyli Nauczyciela oraz Kartkowke oraz Scaner");
        System.out.println("");

        Scanner czytnikKonsoli = new Scanner(System.in);

        Nauczyciel katecheta = new Nauczyciel();
        Kartkowka kartkowka = new Kartkowka();

        System.out.println("Witamy drogi uczniu. Czas na kartkowke!");
        System.out.println("-------------------------------------------");
        System.out.println("Pytanie pierwsze: ile  to jest 2+2x2?");
        int odpowiedzDoPytaniaPierwszego = czytnikKonsoli.nextInt();
        kartkowka.setPytanie1(odpowiedzDoPytaniaPierwszego);
        System.out.println("Ok! Kolejne pytanie! Ile to jest 10 - 5?");
        int odpowiedzDoPytaniaDrugiego = czytnikKonsoli.nextInt();
        kartkowka.setPytanie2(odpowiedzDoPytaniaDrugiego);
        System.out.println("Dobrze! Ostatnie pytanie brzmi: Ile wynosi pierwiastek ze 100");
        int odpowiedzDoPytaniaTrzeciego = czytnikKonsoli.nextInt();
        kartkowka.setPytanie3(odpowiedzDoPytaniaTrzeciego);
        System.out.println("Świetnie! Została dobrze napisana kartkówka");

        System.out.println("Teraz sprawdzimy Twoj wynik");
        int ocenKartkowke = katecheta.obliczPunktyZKartkowki(kartkowka);
        System.out.println("Twój wynik to " + ocenKartkowke);
        System.out.println("Co odpowiada ocenie " + katecheta.wystawOcene(ocenKartkowke));
    }

}
