package nowe2020.klasy.metodyOrazPola.Kasa;

public class KasaMain {
    public static void main(String[] args) {
        Pracownik pracownikBiedronki = new Pracownik();
        Produkt młotek = new Produkt();
        Produkt wiertarka = new Produkt();
        Produkt odkurzacz = new Produkt();
        CzytnikCen czytnikSamsung = new CzytnikCen();

        pracownikBiedronki.nadajCene(młotek, 123);
        pracownikBiedronki.nadajKod(młotek, 590403);
        pracownikBiedronki.nadajKod(wiertarka,590401);
        pracownikBiedronki.nadajCene(wiertarka, 590);
        pracownikBiedronki.nadajKod(odkurzacz, 590402);
        pracownikBiedronki.nadajCene(odkurzacz, 450);
        czytnikSamsung.czytnikCenyProduktu(wiertarka,590401);
        czytnikSamsung.czytnikCenyProduktu(odkurzacz,590402);
        czytnikSamsung.czytnikCenyProduktu(młotek, 590403);




    }
}
