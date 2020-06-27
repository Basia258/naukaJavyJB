package nowe2020.klasy.metodyOrazPola;

public class Nauczyciel {

    public int obliczPunktyZKartkowki(Kartkowka kartkowka)
    {
        int koncowaIloscPunktow = 0;
        if (kartkowka.getPytanie1()==6){
            koncowaIloscPunktow++;
        }
        if (kartkowka.getPytanie2()==5){
            koncowaIloscPunktow++;
        }
        if (kartkowka.getPytanie3()==10){
            koncowaIloscPunktow++;
        }
        return koncowaIloscPunktow;
    }
    public int wystawOcene(int iloscPunktow){
        if (iloscPunktow==0){
            return 1;
        }
        if (iloscPunktow==1){
            return  2;
        }
        if (iloscPunktow==2){
            return 3;
        }
        if (iloscPunktow==3){
            return 5;
        }

        return 0;

    }

    // ta wersja jest wydluzona poniewaz wyżej jest to zamknięte w obiekcie.
//    public int ocenKartkowke(int odpPierwsz, int  odpDrhga, int odpTrzecia)
//    {
//        return 0;
//    }

}
