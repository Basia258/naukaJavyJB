package KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_I;

public class KlasaBezNiczego {
    public void metoda(){
        KlasaA obiekt = new KlasaA();
        obiekt.poleDziedziczenie = 102;
        obiekt.polePubliczne = 101;
        obiekt.poleBezNiczego = 103;
        obiekt.metodaPubliczna();
        obiekt.metodaProtected();
        obiekt.metodaBezNiczeo();
    }
}
