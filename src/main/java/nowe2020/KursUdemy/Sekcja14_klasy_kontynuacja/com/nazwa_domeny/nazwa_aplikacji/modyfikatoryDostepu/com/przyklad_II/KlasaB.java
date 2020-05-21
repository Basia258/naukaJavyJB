package nowe2020.KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_II;

import nowe2020.KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_I.KlasaA;

public class KlasaB {

    public void dowolnaMetoda(){
        KlasaA obiekt = new KlasaA();
        obiekt.polePubliczne = 10;
        obiekt.metodaPubliczna();
    }
}
