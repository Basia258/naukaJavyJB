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

        System.out.println("Mam lat");

        System.out.print(wiekMetodkiIntruduceMyself);
//      Co musze zrobić aby w programie zdanie "Mam lat 27" było w jednej linijce?

        Float wagaMetodkiIntruduceMyself = jacek.getWeight(74.9);
// Nie wiem dlaczego nie pozwala mi wrzucić w parametry metody liczby 74,9?
        System.out.println("Moja waga wynosi");

        System.out.print(wagaMetodkiIntruduceMyself);
    }
}
