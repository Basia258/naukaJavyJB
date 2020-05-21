package nowe2020.KursUdemy.Sekcja8_Instrukcje_warunkowe_zadania;

public class Zadania {
    public static void main(String[] args) {

        // zadanie 1
        // Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
        //(podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).

        int liczbaDoSprawdzenia =11;
        int wynik = liczbaDoSprawdzenia % 2;

        if (wynik == 0){
            System.out.println( liczbaDoSprawdzenia + " ta liczba jest parzysta ");
        }else {
            System.out.println(liczbaDoSprawdzenia + " ta liczba nie jest parzysta");
        }

        /* zadanie 2
        Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści
        potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony jest podatek do 32%. Sprawdź ile podatku
        musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.
        */

        double zarobkiProgramisty = -500;

        if (zarobkiProgramisty <=85528 && zarobkiProgramisty >=0) {
            System.out.println("Programista nie przekroczył progu podatku 17%, dlatego zapłaci: " + zarobkiProgramisty * 0.17);
            System.out.println("Ten programista jest początkujący");
        }else if (zarobkiProgramisty > 85528){
            double podatekPoniżejProgu = 85528 * 0.17;
            double podatekPowyżejProgu = (zarobkiProgramisty - 85528) * 0.32;
            double podatekCałkowity = podatekPoniżejProgu + podatekPowyżejProgu;
            System.out.println("Programista przekroczył próg podatku 17% dlatego zapłaci  " + podatekCałkowity);
            System.out.println("Ten programista jest doświadczony");
        }else {
            System.out.println("Nie musisz zapłacić podatku");
        }

        // zadanie 3
        /*Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić. Co więcej, niech będzie na
        tyle prostym kalkulatorem, że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
        Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia, chociaż na początek
        możesz spróbować to zrobić "if'em".
        */

        double a = 14;
        double b = 6;
        char operacja ='+';

        switch (operacja){
            case '+':
                System.out.println("Wynik dodawania a+b " + (a + b));
                break;
            case '-':
                System.out.println("Wynik z odejmowania a-b" + (a - b));
                break;
            case '*':
                System.out.println("Wynik z mnożenia a*b " + (a * b));
                break;
            case '/':
                System.out.println("Wynik z dzielenia a/b " + (a / b));
                break;
            default:
                System.out.println("Do kalkulatora nie wpisano wymaganych liczb i znaku operacji");

        }





    }

}
