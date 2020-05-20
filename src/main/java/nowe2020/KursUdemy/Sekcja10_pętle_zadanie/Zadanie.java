package KursUdemy.Sekcja10_pętle_zadanie;

public class Zadanie {
    public static void main(String[] args) {
        // zadanie 1
        // Wypisz na ekran liczby od 0 do 30, a następnie od 30 do 0.
        int liczba;
        for (liczba = 0; liczba <= 30; liczba++) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        for (liczba = 30; liczba >= 0; liczba -= 1) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        // zadanie 2
        // Napisz program, które wypisze tylko liczby parzyste z zakresu od 0 do 30.
        int i;
        for (i = 0; i <= 30; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // zadanie 3
        //Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.
        int a = 3;
        int b = 16;
        for (a = 3; a <= b; a++){
            System.out.print(a + " ");
        }
        System.out.println();
        // zadanie 4
        // Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami.
        // Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.
        int [] tab =  { 12, 454, 1,90 , 44, 34, 2,9, 99, 1000};
        for (int d = 0; d <tab.length; d++){
            System.out.print(tab[d] + " ");
        }
        System.out.println();
        for (int d = tab.length - 1; d >= 0; d--){
            System.out.print(tab[d] + " ");
        }
        System.out.println();
        // zadanie 5
        // Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.
        int wynikZadania = 0;
        for (int d = 0; d < tab.length; d++){
            wynikZadania = tab [d] + wynikZadania;
            // może być też wynik += tab[d}
        }
        System.out.println(wynikZadania);
        // zadanie 6
        // Napisz program, który będzie obliczał silnię z najmniejszej liczby.
        int cyfraDoSilni =5;
        int wynikZSilni = 1;
        for (i = cyfraDoSilni; i >= 1;i-- ){
            wynikZSilni = wynikZSilni * i;
        }
        System.out.println("wynik silni " + wynikZSilni);

        // zadanie 7
        // Napisz program, w którym po podaniu liczby n narysujesz za pomocą
        // * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;)

        int n = 5;
        int liczbaGwiazdek = 1;
        for ( i = 1; i <= n; i++){
            for (int j = 1; j <= liczbaGwiazdek; j++){
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }
        /*
        int liczbaGwiazdekLustrzanych = 1;
        int liczbaSpacji = n -1;
        for(i = 1; i <= 5;i++){
            for ( i = 1; j <= liczbaSpacji;){

            }
            for (){

            }
        }
        */




    }
}
