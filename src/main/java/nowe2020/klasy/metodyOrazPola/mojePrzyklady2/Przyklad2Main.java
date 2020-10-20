package nowe2020.klasy.metodyOrazPola.mojePrzyklady2;

import java.util.Scanner;

public class Przyklad2Main {
    public static void main(String[] args) {

        Sprawdzian sprawdzianZMatematyki = new Sprawdzian();
        Kartkowka kartkowkaZMatematyki = new Kartkowka();
        Matematyk jabłonskaJolanta = new Matematyk();

        Scanner czytnikKonsoli = new Scanner(System.in);

        System.out.println("Rozpoczynamy sprawdzian");
        System.out.println();
        System.out.println("2-1=?");
        int odpowiedziDoPierwszegoPytania = czytnikKonsoli.nextInt();
        sprawdzianZMatematyki.setPierwszePytanie(odpowiedziDoPierwszegoPytania);
        System.out.println("1+1=?");
        int odpowiedziDoDrugiegoPytania = czytnikKonsoli.nextInt();
        sprawdzianZMatematyki.setDrugiePytanie(odpowiedziDoDrugiegoPytania);
        System.out.println("2+1=?");
        int odpowiedziDoTrzeciegoPytania = czytnikKonsoli.nextInt();
        sprawdzianZMatematyki.setTrzeciePytanie(odpowiedziDoTrzeciegoPytania);
        System.out.println("2+2=?");
        int odpowiedziDoCzwartegoPytania = czytnikKonsoli.nextInt();
        sprawdzianZMatematyki.setCzwartePytanie(odpowiedziDoCzwartegoPytania);
        System.out.println("2+3=?");
        int odpowiedziDoPiątegoPytania = czytnikKonsoli.nextInt();
        sprawdzianZMatematyki.setPiatePytanie(odpowiedziDoPiątegoPytania);

        int uzyskanaIloscPunktowZeSprawdzianu = jabłonskaJolanta.zliczPunkty(sprawdzianZMatematyki);
//        int uzyskanaIloscPunktowZKartkowki = jabłonskaJolanta.zliczPunkty(kartkowkaZMatematyki);
        int ocena = jabłonskaJolanta.wystawOceneSprawdzianu(uzyskanaIloscPunktowZeSprawdzianu);

    }

}
