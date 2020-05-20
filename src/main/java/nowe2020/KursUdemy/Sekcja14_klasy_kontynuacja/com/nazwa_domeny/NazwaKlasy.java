package KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny;

public class NazwaKlasy {
    public static final String NAZWA_STRING = "nazwa  string";
    private String polePrywatneString = "jakis prywatny tekst";
    int nazwaZmiennej = 55;

    public NazwaKlasy() {

    }

    public void nazwaMetodyVoid() {
        System.out.println("Wypisałem z metody void");
        int nazwaZmiennej = 22;
        metodaZwracaInta(5);
        System.out.println(nazwaZmiennej);
        System.out.println(this.nazwaZmiennej);
    }

    public void drugaMetoda() {
        metodaPrzyjmujeParametr(5);
        metodaPrzyjmujeParametr("string");
    }

    private int metodaZwracaInta(int a) {
        return a;
    }

    private int metodaPrzyjmujeParametr(int a) {
        return a;
    }

    private String metodaPrzyjmujeParametr(String a) {
        return a;
    }

    private int metodaPrzyjmujeParametr(int a, String b) {
        return 55;
    }

    private String MetodaPrzyjmujeParametr(int a) {
        return "tekst";
    }
}