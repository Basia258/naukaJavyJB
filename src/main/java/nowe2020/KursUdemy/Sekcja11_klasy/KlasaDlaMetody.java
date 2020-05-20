package KursUdemy.Sekcja11_klasy;

public class KlasaDlaMetody {

    // typZwracany + nazwaMetody(parametry metody) {  }
    void metodaKtóraNicNieZwraca (){
        System.out.println("wartość wypisana z metody");
    }
    void metodaKtóraPrzyjmujeArgument(int liczba, char pojedynczyZnak){
        liczba++;
        System.out.println("wartość metody " + liczba + " " + pojedynczyZnak);
    }
    void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono Pokazać");
        }
    }
    int dodawanie( int a, int b){
            int wynik = a + b;
            return wynik;
        }
    double poPrzecinku (double liczbaPoPrzecinku){
        double wynik = liczbaPoPrzecinku + 0.55;
        return wynik;
    }
    boolean wartośćLogiczna (boolean zmienianaWartoscLogiczna){
        return !zmienianaWartoscLogiczna;
    }
    int zwrocOdWartosciLogicznej (boolean czyZwrocic, int liczba){
        if (czyZwrocic){
            return liczba;
        }
        else {
            return 0;
        }
    }
    int przykladKolejny (){
        System.out.println("coś przed zwróceniem");
        return 100;
    }
    void voidKtóryMialbyCosZwracac (boolean czyZakonczyc){
        if (czyZakonczyc){
            return;
        }
        System.out.println("coś napisane bo nie zakończone wartością logiczna");
    }


}
