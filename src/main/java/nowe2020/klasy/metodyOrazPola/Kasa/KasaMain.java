package nowe2020.klasy.metodyOrazPola.Kasa;

public class KasaMain {
    public static void main(String[] args) {
        Pracownik pracownikBiedronki = new Pracownik();
        Produkt młotek = new Produkt();
        CzytnikCen czytnikSamsung = new CzytnikCen();

        pracownikBiedronki.nadajCene(młotek, 123);
        czytnikSamsung.czytnikCenyProduktu(młotek);



    }
}
