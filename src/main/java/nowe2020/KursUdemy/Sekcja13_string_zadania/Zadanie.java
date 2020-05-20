package KursUdemy.Sekcja13_string_zadania;

public class Zadanie {
    public static void main(String[] args) {
        /* zadanie 1
        Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz do trzeciej imię
        i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić
        nic ręcznie! :) ) i wypisując informacje na ekran:
            a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
            b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
            c) wypisz nazwisko z WIELKICH LITER
            d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
        */

        String imie = "Jacek";
        String nazwisko = "Mroczek";
        String imieINazwisko = "Jacek Mroczek";

        System.out.println("moje imie zawiera: " + imie.length() + " znakow");
        System.out.println("moje nazwisko zawiera: " + nazwisko.length() + " znakow");
        System.out.println("moje imie i nazwisko zawierają: " + imieINazwisko.length() + " znakow");

        boolean wynik = imie.equals("Alicja");
        boolean wynikDlaJana = imie.equalsIgnoreCase("Jan");
        System.out.println("Moje imie jest takie samo jak Alicja: " + wynik + " oraz Jan " + wynikDlaJana);

        if (imie.equals("Alicja")) {
            System.out.println("Mam na imię Alicja");
        } else if (imie.equals("Jan")) {
            System.out.println("Mam na imię Jan");
        } else {
            System.out.println("Nie mam na imię ani Alicja ani Jan");
        }

        System.out.println(nazwisko.toUpperCase());

        System.out.println(nazwisko.replace('e', 'a'));


        // zadanie 2
        // Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii

        String noweZdanie = "Potrafię coraz więcej z programowania";
        for (int i = 0; i < noweZdanie.length();i ++){
            System.out.println(noweZdanie.charAt(i));
        }

        // zadanie 3
        /*Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.” napisz od tyłu
        „.ainawomargorp z jecęiw zaroc ęifartoP
         */
        System.out.println();
        System.out.println();

        for (int i = noweZdanie.length() - 1; i >= 0; i--){
            System.out.println(noweZdanie.charAt(i));
        }


    }
}
