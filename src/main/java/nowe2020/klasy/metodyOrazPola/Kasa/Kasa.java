package nowe2020.klasy.metodyOrazPola.Kasa;

public class Kasa {
    public void podliczZakupy (Produkt produkt1, Produkt produkt2,Produkt produkt3){
        int suma = produkt1.getCena() + produkt2.getCena() + produkt3.getCena();
        System.out.println("suma wszystkich produktów = " + suma);
    }
}
