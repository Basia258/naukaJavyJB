package KursUdemy.Sekcja11_klasy;

public class KlasaKonstruktor {

    int pierwszePole;
    int drugiePole;

    KlasaKonstruktor (){
        System.out.println("jestem w tym konstruktorze");
        pierwszePole = 123;
        drugiePole = 321;
    }

    KlasaKonstruktor (int wartoscPierwsza){
        pierwszePole = wartoscPierwsza;
        drugiePole = 1;
    }

    KlasaKonstruktor (int wartoscPierwsza, int wartoscDruga){
        System.out.println("Jestem w konstruktorze z dwoma parametrami");
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }

}
