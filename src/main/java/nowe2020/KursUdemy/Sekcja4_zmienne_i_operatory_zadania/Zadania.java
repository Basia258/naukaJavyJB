package KursUdemy.Sekcja4_zmienne_i_operatory_zadania;

public class Zadania {
    public static void main(String[] args) {
        int wiek = 29;
        double wzrost = 1.7;
        double waga = 77.2;

        System.out.println("Mam " + wiek + " lat");
        System.out.println("Mam " + wzrost + " metra" );
        System.out.println("Ważę: " + waga + " kilo");

        double mojeBMI = waga / (wzrost * wzrost);
        System.out.println(" moje BMJ " + mojeBMI);
        // Możemy wykorzystać biblioteke math
        //double mojeBMI =  waga / Math.pow(wzrost, 2);
        //System.out.println("moje BMI  + " + mojeBMI);

        //zadanie 3
        int mojeBMIInt = (int) mojeBMI;
        System.out.println("moje BMI jako int wynosi " + mojeBMIInt);

        // zadanie 4
        int a = 12;
        int wynikZdzielenia;
        int wynikZReszty;
        wynikZdzielenia = a / 2;
        wynikZReszty = a % 2;
        System.out.println("wynik operacji 5 / 2 " + wynikZdzielenia);
        System.out.println("wynik operacji 5 % 2 " + wynikZReszty);

        wynikZdzielenia = a / 3;
        wynikZReszty = a % 3;
        System.out.println("wynik operacji 5 / 3 " + wynikZdzielenia);
        System.out.println("wynik operacji 5 % 3 " + wynikZReszty);

        wynikZdzielenia = a / 11;
        wynikZReszty = a % 11;
        System.out.println("wynik operacji a / 11 " + wynikZdzielenia);
        System.out.println("wynik operacji a % 11 " + wynikZReszty);

        // zadanie 5

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        System.out.println("Wynik pierwszy: " + true);
        System.out.println("Wynik drugi: " + true);

        // zadanie 6

        int mójInt = 1000000000;
        int pozaInt = mójInt + mójInt + mójInt;
        int pozaIntInnySposób = Integer.MAX_VALUE + 2;
        System.out.println(Integer.MAX_VALUE);
        System.out.println("pozaInt wynosi " + pozaInt);
        System.out.println("pozaIntInnySposób " + pozaIntInnySposób);

    }
}
