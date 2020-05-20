package nowe2020.JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.kalkulator;

public class Kalkulator {

    int dodawanie(int a, int b) {
        return (a + b);
    }

    int odejmowanie(int a, int b) {
        return (a - b);
    }

    int mnozenie(int a, int b) {
        return (a * b);
    }

    int dzielenie(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (a / b);
        }
    }

    double pierwiastekZLiczby(double a) {
        return Math.sqrt(a);
    }

    double doPotegi(double liczba, double potega) {

        return Math.pow(liczba, potega);
    }

    double doPotegiDrugaMetoda(double liczba, double potega) {

        double wynik = 1;

        for (int i = 0; i < potega; i++) {

            wynik = liczba * wynik;
        }

        return wynik;
    }

    double doPotegiTrzeciaMetoda(double liczba, double potega) {

        double wynik = 1;

        for (int i = 1; i <= potega; i++) {

            wynik = liczba * wynik;
        }

        return wynik;
    }


    void liczbyParzyste(int liczba) {
        for (int i = 0; i < liczba; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    int iloscLiczbParzystych(int liczba) {
        int wynik = 0;

        for (int i = 0; i <= liczba; i++) {
            if (i % 2 == 0) {
                wynik++;
            }
        }

        return wynik;
    }

    void macierz()
    {
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for (int j =0; j < 5; j++) {
                if(j%2==0)
                {
                    System.out.print(" X ");

                } else {
                    System.out.print( " Z ");
                }

            }
        }
    }

}
