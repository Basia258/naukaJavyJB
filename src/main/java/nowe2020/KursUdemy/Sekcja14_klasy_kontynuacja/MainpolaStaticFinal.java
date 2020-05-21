package nowe2020.KursUdemy.Sekcja14_klasy_kontynuacja;

import nowe2020.KursUdemy.Sekcja11_klasy.Klasa;

public class MainpolaStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;
        // static pole i metode
        KlasaStaticFinal.poleStatic =15;
        obiekt.poleStatic = 123;

        System.out.println(KlasaStaticFinal.poleStatic);
        KlasaStaticFinal.metodaStatyczna();
        /*
        obiekt.poleFinal = 213;
        */
        System.out.println("pole final wynosi: " + obiekt.poleFinal);

        // static final
        System.out.println("wyswietlony tekst z static final JAKIS_TEKST: " + KlasaStaticFinal.JAKIS_TEKST );

    }
}
