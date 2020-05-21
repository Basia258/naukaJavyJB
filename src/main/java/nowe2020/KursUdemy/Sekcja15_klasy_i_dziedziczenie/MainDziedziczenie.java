package nowe2020.KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class MainDziedziczenie {
    public static void main(String[] args) {
        // ang. inheritance
        KlasaPodstawowa podstawowaKlasa = new KlasaPodstawowa();
        KlasaRozszerzona obiektRozszerzony = new KlasaRozszerzona();

        obiektRozszerzony.metodaPierwsza();
        podstawowaKlasa.metodaPierwsza();
        obiektRozszerzony.motodaRozszerzona();

        KlasaBardziejRozszerzona obiektBardziejRozszerzony = new KlasaBardziejRozszerzona();
        obiektBardziejRozszerzony.motodaRozszerzona();
    }
}
