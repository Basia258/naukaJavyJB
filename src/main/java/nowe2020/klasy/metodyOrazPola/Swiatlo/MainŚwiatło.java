package nowe2020.klasy.metodyOrazPola.Swiatlo;

public class MainŚwiatło {
    public static void main(String[] args) {
        Żarówka osram = new Żarówka();
        Włacznik odPokoju = new Włacznik();
        Czlowiek jozekZapalka = new Czlowiek();
        odPokoju.zapal(osram);
        odPokoju.stanWłacznika = true;
        odPokoju.zapal(osram);
    }
}
