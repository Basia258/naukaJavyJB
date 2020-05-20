package stare2018.Barbara.HairAndDryer;

public class HairAndDryierMain {

    public static void main(String[] args) {


        // Tworze wlosy, ktore nie sa suche
        MyHair myHair = new MyHair(false);

        // Tworze obiekt suszarki
        Dryer dryer = new Dryer();

        System.out.println("Pierwsze suszenie sie rozpoczyna:");

        //wywoluje na obiekcie suszarki metody 'dry'. Czyli chece wysuzyc wlosy,  ktore stworzylem w 9 linijce. Te stworzone wlosy nie sa suche wiec obiekt
        // dryer powinien mi je wysuszyc

        dryer.dry(myHair);
        System.out.println(""); //zrobienie 'entera' w konsoli by sie lepiej czytalo


        //po suszeniu wlosy powinny byc suche. Sprawdzimy to! Jak? Ano sprobujmy jeszcze raz wysuszyc te same wlosy


        System.out.println("Drugie suszenie sie rozpoczyna");
        dryer.dry(myHair);
    }
}
