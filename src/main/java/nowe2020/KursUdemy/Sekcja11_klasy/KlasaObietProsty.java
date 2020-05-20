package KursUdemy.Sekcja11_klasy;

public class KlasaObietProsty {
    public static void main(String[] args) {
        int typProsty = 100;
        Przykład przyklad = new Przykład();
        Przykład nowyprzyklad = new Przykład();

        przyklad.pole = 102;
        nowyprzyklad.pole = 123;

        nowyprzyklad.pokazPole(nowyprzyklad.pole);
        przyklad.pokazPole(przyklad.pole);
    }
}
