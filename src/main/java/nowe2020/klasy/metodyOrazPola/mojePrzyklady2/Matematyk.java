package nowe2020.klasy.metodyOrazPola.mojePrzyklady2;

public class Matematyk {

    // Dlatego cały czas dostajesz ocenę niedostateczną, bo Matematyk dodaje Ci punktu gdy odpowiesz:
    // na kazde pytanie '1' :)
    public int zliczPunkty (Sprawdzian sprawdzianUcznia) {
        int iloscPunktow = 0;
        if (sprawdzianUcznia.getPierwszePytanie() == 1){
            System.out.println("Dobrze wykonałeś zadanie");
            iloscPunktow++;
        }
        if (sprawdzianUcznia.getDrugiePytanie() == 2){
//        if (sprawdzianUcznia.getDrugiePytanie() == 1){
            System.out.println("Dobrze wykonałeś zadanie");
            iloscPunktow++;
        }
        if (sprawdzianUcznia.getTrzeciePytanie() == 3){
//        if (sprawdzianUcznia.getTrzeciePytanie() == 1){
            System.out.println("Dobrze wykonałeś zadanie");
            iloscPunktow++;
        }
        if (sprawdzianUcznia.getCzwartePytanie() == 4){
            System.out.println("Dobrze wykonałeś zadanie");
            iloscPunktow++;
        }
        if (sprawdzianUcznia.getPiatePytanie() == 5){
            System.out.println("Dobrze wykonałeś swoje zadanie");
            iloscPunktow++;
        }
        return iloscPunktow;
    }
    public int wystawOceneSprawdzianu (int iloscPunktow) {
        if (iloscPunktow == 1) {
            System.out.println("Zdobyłeś jeden punkt otrzymujesz ocenę niedostateczną");
            return 1;
        }
        if (iloscPunktow == 2) {
            System.out.println("Zdobyłeś dwa punkty otrzymujesz ocenę dopuszczającą");
            return 2;
        }
        if (iloscPunktow == 3) {
            System.out.println("Zdobyłeś 3 punkty otrzymujesz ocenę dostateczną");
            return 3;
        }
        if (iloscPunktow == 4) {
            System.out.println("Zdobyłeś 4 punkty otrzymujesz ocenę dobrą");
            return 4;
        }
        if (iloscPunktow == 5) {
            System.out.println("Zdobyłeś 5 punktów otrzymujesz ocenę bardzo dobrą");
            return 5;
        }
        System.out.println("Nie zdobyłeś ani jednego punktu otrzymujesz ocenę niedostateczną");
        return 0;
    }
}

