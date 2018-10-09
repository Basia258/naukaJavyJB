package Pawel.PolkaIKsiazka;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        // ctrl + alt + v
        Polka miejsceNaKsiazke = new Polka();
        Ksiazka book = new Ksiazka();

        book.setTytul("Konserwatyzm");


        miejsceNaKsiazke.setKsiazka(book);

        System.out.println(miejsceNaKsiazke.getKsiazka().getTytul());

        Ksiazka zoltaKsiazka = new Ksiazka();

        zoltaKsiazka.setTytul("bla");

        miejsceNaKsiazke.setKsiazka(zoltaKsiazka);

//        book = zoltaKsiazka;

        System.out.println(miejsceNaKsiazke.getKsiazka().getTytul());
    }
}
