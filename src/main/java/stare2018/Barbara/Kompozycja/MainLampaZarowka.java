package stare2018.Barbara.Kompozycja;

public class MainLampaZarowka {
    public static void main(String[] args) {
        Zarowka zarowka = new Zarowka();
        Lampa lampa = new Lampa();

        lampa.setZarowka(zarowka);
        lampa.swiec();



    }




}
