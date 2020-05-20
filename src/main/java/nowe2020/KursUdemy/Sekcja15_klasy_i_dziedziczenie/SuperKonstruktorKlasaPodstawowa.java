package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class SuperKonstruktorKlasaPodstawowa {

    SuperKonstruktorKlasaPodstawowa(){
        System.out.println("Wywołałem konstruktor z klasa podstawowa");
    }
    SuperKonstruktorKlasaPodstawowa(int a){
        System.out.println("Wywołałem konstruktor z klasa podsawowa z wartością : " + a);
    }
}
