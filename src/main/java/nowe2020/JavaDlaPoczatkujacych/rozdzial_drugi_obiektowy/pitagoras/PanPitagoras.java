package JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.pitagoras;

public class PanPitagoras {

    double MojeTwierdzenie(double a, double b) {
        double c = ((a * a) + (b * b));
        double sqrt = Math.sqrt(c);
        return sqrt;
    }


    //nazwa metody -> z malej litery
    //ctrl + alt + l    -> formatowanie automatyczne
    double mojeTwierdzenie(double a, double b) {

        return Math.sqrt((a * a) + (b * b));
    }

    int mnozenie(int a, int b) {
        return a * b;
    }

    double dzielenie(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    double miejsceZeroweFunkcjiKwadratowej(int a, int b, int c) {
        int delta = (b * b) - 4 * a * c;
        return (-b - Math.sqrt(delta)) / (2 * a);
    }


}
