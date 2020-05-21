package nowe2020.KursUdemy.Sekcja11_klasy;

public class KlasaZPolami {
    int liczbaCalkowita;

    void zwrocWartoscPola (){
        System.out.println("Zwrocona wartość pola: " + liczbaCalkowita);
    }
    void ustawWartoscPola (int wartosc) {
        liczbaCalkowita = wartosc;
    }
    int zwrocWartoscPolaZMetody (){
        return liczbaCalkowita;
    }
}
