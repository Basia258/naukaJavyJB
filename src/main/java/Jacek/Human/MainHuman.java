package Jacek.Human;

import Jacek.Human.Human;

public class MainHuman {

    public static void main(String[] args) {

//      String Jacek = newHuman();
//      To jest zle z dwoj powodow:
//      po prawej stronie znaku '=' musi byc przerwa (spacja) miedzy slowem kluczowym 'new' a konstruktorem klasy.
//      czyli poprawnie bedzie :     new Human
//      A druga rzecz do poprawy to jest typ zmiennej Jacek. Zmienna Jacek (zmienne piszemy z malej litery :P ) musi byc tego samego typu
//      co obiekt na ktory wskazuja. Czyli poprawnie bedzie:   Human jacek = new Human();

        Human jacek = new Human("Jacek", 27, 73.3, true);
        Human brat2 = new Human("Pawel",30,true);
        Human brat1 = new Human("Tomek",33,true);
        Human brat3 = new Human("Wojtek",24,true);

        System.out.println(jacek.getName());
        System.out.print("Ma lat ");
        System.out.println(jacek.getAge());
        System.out.print("Waży ");
        System.out.println(jacek.getWeight());
        System.out.print("Czy jest dorosły? ");
        System.out.println(jacek.isAdult());

        System.out.println(brat1.getName());
        System.out.print("Ma lat ");
        System.out.println(brat2.getAge());
        brat1.setAdult();
        System.out.print("Czy jest dorosły? ");
        System.out.println(brat2.isAdult());

        System.out.println(brat2.getName());
        System.out.print("Ma lat ");
        System.out.println(brat1.getAge());
        System.out.print("Czy jest dorosły? ");
        System.out.println(brat2.isAdult());

        System.out.println(brat3.getName());
        System.out.print("Ma lat ");
        System.out.println(brat3.getAge());
        System.out.print("Czy jest dorosły? ");
        System.out.println(brat3.isAdult());

    }
    }


