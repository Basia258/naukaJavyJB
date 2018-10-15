package Jacek.Kompozycja;

public class MainZARandLAM {
    public static void main(String[] args) {
        Zarowka nowaZarowka = new Zarowka();
        Lampa nowaLampa = new Lampa();
    nowaLampa.setMalaZarowka(nowaZarowka);
    nowaLampa.swiec();

    }
}
