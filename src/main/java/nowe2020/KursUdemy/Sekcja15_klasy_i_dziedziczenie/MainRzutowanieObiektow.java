package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {

        RzutowanieObKlasaRozszerzona obiektKlasyRozszerzoneObj = new RzutowanieObKlasaRozszerzona();
        obiektKlasyRozszerzoneObj.ustawLiczbe(999);
        obiektKlasyRozszerzoneObj.wyswietlLiczbe();

        RzutowanieObKlasaPodstawowa rzutowanieObKlasaPodstawowa = (RzutowanieObKlasaPodstawowa) obiektKlasyRozszerzoneObj;
        // to było rzutowanie
        rzutowanieObKlasaPodstawowa.wyswietlLiczbe();

        Object object = (RzutowanieObKlasaRozszerzona) obiektKlasyRozszerzoneObj;


    }
}
