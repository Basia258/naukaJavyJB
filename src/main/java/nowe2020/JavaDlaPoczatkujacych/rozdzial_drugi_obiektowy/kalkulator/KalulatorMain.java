package nowe2020.JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.kalkulator;


public class KalulatorMain {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        PolaFigur polaFigur = new PolaFigur();

        System.out.println("Metoda sprawdza wyniki dla wartości 5 i 5");
        System.out.println("Wynik metody dodawanie: " + kalkulator.dodawanie(5,5));
        System.out.println("Wynik metody odejmowanie: " + kalkulator.odejmowanie(5,2));
        System.out.println("Wyniki metody mnożenie: " + kalkulator.mnozenie(2,4));
        System.out.println("Wyniki metody dzielenie: " + kalkulator.dzielenie(5,5));
        System.out.println("Wynik pierwiastka: " + kalkulator.pierwiastekZLiczby(9));
        System.out.println("Wynik podniesienia do potęgii: " + kalkulator.doPotegi(2,4));
        System.out.println("");
        System.out.println("Wynik pola prostokąta: " + polaFigur.poleProstokata(5,5));
        System.out.println("Wynik obwodu prostokata: " + polaFigur.obwodProstokata(5,5));
        System.out.println("Wynik pola rownolegloboku: " + polaFigur.poleRownolegloboku(4,7));
        System.out.println("Wynik obwodu rownolegloboku: " + polaFigur.obwodRownolegloboku(4,7));
        System.out.println("Wynik pola trojkata: " + polaFigur.poleTrojkata(2,4));
        System.out.println("Wynik obwodu trojkata: " + polaFigur.obwodTrojkata(2,4,6));
        System.out.println("Wynik pola trapezu: " + polaFigur.poleTrapezu(3,6,4));
        System.out.println("Wynik obwodu trapezu: " + polaFigur.obwodTrapezu(3,4,3,4));
        System.out.println("Wynik pola koła: " + polaFigur.poleKola(3));
        System.out.println("Wynik obwodu koła: " + polaFigur.poleKola(3));

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(kalkulator.doPotegi(5,2));
        System.out.println(kalkulator.doPotegiDrugaMetoda(5,2));
        System.out.println(kalkulator.doPotegiTrzeciaMetoda(5,2));
        kalkulator.liczbyParzyste(100);
        System.out.println(kalkulator.iloscLiczbParzystych(5));
        kalkulator.macierz();


    }
}
