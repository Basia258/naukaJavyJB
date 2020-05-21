package nowe2020.KursUdemy.Sekcja11_klasy;

public class Metody {
    public static void main(String[] args) {
        // ang. methods
        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaKtóraNicNieZwraca();
        nazwaObiektu.metodaKtóraPrzyjmujeArgument(34, 'i');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 29);
        int wynikDodawania = nazwaObiektu.dodawanie(3,8);
        System.out.println("Wynik dodawania " + wynikDodawania);
        double dodaniePoPrzecinku = nazwaObiektu.poPrzecinku(23);
        System.out.println("do argumentu 23 wykonano metode po przcinku " + dodaniePoPrzecinku);
        System.out.println(nazwaObiektu.wartośćLogiczna(true));
        nazwaObiektu.voidKtóryMialbyCosZwracac(false);
    }
}
