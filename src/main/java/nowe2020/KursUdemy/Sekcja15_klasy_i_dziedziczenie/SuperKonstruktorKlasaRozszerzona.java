package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class SuperKonstruktorKlasaRozszerzona extends SuperKonstruktorKlasaPodstawowa {

    SuperKonstruktorKlasaRozszerzona(){
        super(123);
        System.out.println("Wywołałem konstruktor z klasy rozszerzonej");
    }
}
