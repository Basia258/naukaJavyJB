package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class MainPrzeslanianieMetod {
    public static void main(String[] args) {


        /// ang. override

        KlasaPodstawowaPierwsza obiektKlasyPodstawowejPierwszej = new KlasaPodstawowaPierwsza();
        KlasaRozszerzonaDruga obiektKlasyRozszerzonejDrugiej = new KlasaRozszerzonaDruga();

        obiektKlasyPodstawowejPierwszej.metoda();
        obiektKlasyRozszerzonejDrugiej.metoda();
    }
}