package KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_II;

import KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_I.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public void metoda (){
        polePubliczne = 101;
        poleDziedziczenie = 102;
        metodaProtected();
        metodaPubliczna();
    }

}
