package nowe2020.klasy.metodyOrazPola.Kasa;

public class CzytnikCen {
    public void czytnikCenyProduktu (Produkt produktSprawdzany, int kodKreskowyProduktu){
        if (produktSprawdzany.getKodKreskowy() == kodKreskowyProduktu){
            System.out.println(produktSprawdzany.getCena());
        }
        else {
            System.out.println("Nie znam takiego kodu kreskowego");
        }
    }
}
