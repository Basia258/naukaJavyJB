package nowe2020.JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.kalkulator;

public class Kalkulator {

    public int dodawanie(int a, int b)
    {

        int wynik = a + b;
        return wynik;
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

    void macierz() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    System.out.print(" X ");

                } else {
                    System.out.print(" Z ");
                }

            }
        }
    }

    void tabliczkaMnożenia() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int wynik = (i * j);
                if (wynik >= 10) {
                    System.out.print(wynik + " ");
                } else {
                    System.out.print(" " + wynik + " ");
                }
            }
            System.out.println();
        }
    }

    void jodełka() {
        int n = 7;
        int liczbaGwiazdek = 1;
        int liczbaOdstepow = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaOdstepow; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }

            System.out.println();
            liczbaGwiazdek++;
            liczbaOdstepow--;

        }
    }

    void jodelka2() {
        int n = 7;
        int liczbaOdstepowPo = n - 1;
        int liczbaGwiazdek = 1;
        for (int i = 1; i <= 7; i++) {
            for (i = 1; i <= liczbaGwiazdek; i++) {
                System.out.print("*");
            }
            for (int j = 1; j <= liczbaOdstepowPo; j++) {
                System.out.print(" ");
            }
            System.out.println();
            liczbaGwiazdek++;
            liczbaOdstepowPo++;
        }
    }

    void drzewko() {
        int n = 5;
        int liczbaGwiazdek = 1;
        int liczbaOdstepow = n - 1;
        int liczbaOdstepowPrzed = n - 1;
        for (int i = 1; i <= n; i++) {

            //błąd jest taki, że warunkiem zakończenia pętli jest 'j <= liczbaOdstepowPrzed' a to zawsze jest prawda.
            //bo dla pierwszej iteracji jest :  1 <= 4
            //dla drugiej iteracji jest :   0 <= 4
            // dla trzeciej iteracji jest : -1 <- 4
            // i tak w nieskończoność

            //Stary kod:
//            for (int j = 1; j <= liczbaOdstepowPrzed; j--) {

            //Przykładowe rozwiązanie?
            for (int j = 1; j <= liczbaOdstepowPrzed; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= liczbaGwiazdek; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= liczbaOdstepow; l++) {
                System.out.print(" ");
            }
            liczbaOdstepowPrzed--;
            liczbaGwiazdek = +2;
            liczbaOdstepow++;
            System.out.println();
        }
    }
}
