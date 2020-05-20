package nowe2020.JavaDlaPoczatkujacych.rozdzial_drugi;

public class OdlegloscPioruna {
    public static void main(String[] args) {
        double odlegloscOdPioruna;
        double czasOdBlysku;

        czasOdBlysku = 20;

        odlegloscOdPioruna = czasOdBlysku * 330;
        odlegloscOdPioruna = odlegloscOdPioruna / 1000;
        System.out.println("Jesteś oddalony od pioruna o " + odlegloscOdPioruna + " km");
    }
}
