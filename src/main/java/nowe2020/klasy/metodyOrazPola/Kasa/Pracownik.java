package nowe2020.klasy.metodyOrazPola.Kasa;

public class Pracownik {
    public void nadajCene (Produkt nadawanyProdukt, int nadawanaCena)
    {
        nadawanyProdukt.setCena(nadawanaCena);
    }
    public void nadajKod (Produkt wybranyProdukt, int nadanyKod) {
        wybranyProdukt.setKodKreskowy(nadanyKod);
    }
}
