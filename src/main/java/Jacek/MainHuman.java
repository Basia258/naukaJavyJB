package Jacek;

public class MainHuman {

    public static void main(String[] args) {

//      String Jacek = newHuman();
//      To jest zle z dwoj powodow:
//      po prawej stronie znaku '=' musi byc przerwa (spacja) miedzy slowem kluczowym 'new' a konstruktorem klasy.
//      czyli poprawnie bedzie :     new Human
//      A druga rzecz do poprawy to jest typ zmiennej Jacek. Zmienna Jacek (zmienne piszemy z malej litery :P ) musi byc tego samego typu
//      co obiekt na ktory wskazuja. Czyli poprawnie bedzie:   Human jacek = new Human();

        Human jacek = new Human();

        String wynikMetodkiIntruduceMyself = jacek.introduceMyself("Jacek");

        System.out.println(wynikMetodkiIntruduceMyself);

        Integer wiekMetodkiIntruduceMyself = jacek.getAge(27);

        System.out.print("Mam lat ");

        System.out.println(wiekMetodkiIntruduceMyself);

        Float wagaMetodkiIntruduceMyself = jacek.getWeight((float) 74.9);

        System.out.print("Moja waga wynosi ");

        System.out.println(wagaMetodkiIntruduceMyself);

        boolean dojrzaloscMetodkiIntruduceMyself = jacek.isAdult(true);

        System.out.print("Pelnoletnosc ");

        System.out.println(dojrzaloscMetodkiIntruduceMyself);
    }
}
