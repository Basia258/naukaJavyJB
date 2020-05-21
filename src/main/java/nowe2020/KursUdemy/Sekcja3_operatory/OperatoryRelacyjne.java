package nowe2020.KursUdemy.Sekcja3_operatory;

public class OperatoryRelacyjne {
    public static void main(String[] args) {
        // ang. relational operators
        // Wyróżniamy 5 operatorów relacyjnych
        /*  == - równe
            != - różne
            > - większe
            >= - większe bądź równe
            < - mniejsze
            <= - mniejsze bądź równe
         */
        System.out.println("Operatory relacyjne zwracają nam wartość typu boolean.");
        System.out.println("Jest to zatem informacja czy dana zależność pomiędzy wartościami jest prawdziwa");
        System.out.println("Przykłady:");

        boolean wynik;
        wynik = 4 == 9;
        System.out.println("Wynik z działania 4 == 9 " + wynik );
        System.out.println("Jak widzimy operator relacyjny zwrócił nam wynik zgodny z rzeczywistością. Sprawdźmy zatem następne przykłady");
        wynik = 12.32 != 12.32;
        System.out.println("Wynik z działania 12.31 != 12.31");
        System.out.println("W tym przypadku wykorzystaliśmy zmiennę typu int");
        int a = 10;
        int b = 5;
        wynik = a > b;
        System.out.println("Wynik z działania a > b " + wynik);
        wynik = a >= b;
        System.out.println("Wynik z działania a >= b " + wynik);
        System.out.println("Teraz sprawdzimy, czy możemy dokonywać operacji relacyjnych na danych różnego typu");
        a = 7;
        double c = 11.11;
        wynik = c < a;
        System.out.println("Wynik z działania z c < a " + wynik);
        System.out.println("Widzimy, że możemy operować na innych typach przy porównaniu.");
        wynik = a <= c;
        System.out.println("Wynik z działania z a <= c " + wynik);
        char d = 'O';
        wynik = a == d;
        System.out.println(d);



    }
}
