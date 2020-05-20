package KursUdemy.Sekcja14_klasy_kontynuacja;

public class KlasaStaticFinal {
    public int pole;
    public static int poleStatic; // dzięki polu static w mainie ja nie muszę tworzyć obiektu, żeby dostać się do tego pola
                                    // to pole jest dostępne dla każdego obiektu. Podobnie ma to się z metodami
    public final int poleFinal = 150; //te pole raz zainicjalizowane nie będzie mogło zostać zmienione dlatego jest konieczna jego inicjacja
    public static final String JAKIS_TEKST = "Dowolny tekst, który napisałem";


    public static void metodaStatyczna(){
        System.out.println("Wypisałem z metody statycznej");
    }

}

