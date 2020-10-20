package nowe2020.klasy.metody;

public class SamochodMain {

    public static void main(String[] arg) {

        Samochod autko = new Samochod();
        Samochod autko2 = new Samochod();
        Samochod autko3 = new Samochod();
        Samochod autko4 = new Samochod();

        autko.jedze();
        autko.setCena(666778);

        System.out.println(autko.getCena());
    }
}
