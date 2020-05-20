package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class SuperKlasaRozszerzona extends SuperKlasaPodstawowa {

//    void metodaInna(){
//        metoda();
//        System.out.println("Kolejny tekst czy operacja w klasie rozszerzonej");
       @Override
        void metoda(){
           super.metoda();
           System.out.println("Kolejny tekt czy operacja w klasie Superrozszerzonej");

    }

}
