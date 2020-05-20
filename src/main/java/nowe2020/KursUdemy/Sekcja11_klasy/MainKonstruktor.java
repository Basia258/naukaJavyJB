package KursUdemy.Sekcja11_klasy;

public class MainKonstruktor {
    public static void main(String[] args) {

        KlasaDwa klasaDwa = new KlasaDwa();
        KlasaKonstruktor klasaKons = new KlasaKonstruktor();
        System.out.println(klasaKons.pierwszePole);
        System.out.println(klasaKons.drugiePole);
        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor(5);
        System.out.println(klasaKonstruktor.pierwszePole + " oraz " + klasaKonstruktor.drugiePole);
    }
}
