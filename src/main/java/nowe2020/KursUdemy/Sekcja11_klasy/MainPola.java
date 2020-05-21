package nowe2020.KursUdemy.Sekcja11_klasy;

public class MainPola {
    public static void main(String[] args) {
        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);
        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);
    }
}
