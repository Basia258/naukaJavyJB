package KursUdemy.Sekcja3_operatory;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        /* ang. logical operators
        Wyróżniamy tutaj dwa operatory logiczne: koniunkce i alternatywę oraz negacje
        Koniunkca jest to znak && musi ona przedzielać operatory relacyjne, które mają być sprawdzane
        W koniunkcji 2 warunki muszą być spełnione
        Alternatywa jest to znak || musi ona przedzielać operatory relacyjne, które mają być sprawdzane
        W alternatywie musi zostać spełniony minimum jeden warunek

        */
        //KONIUNKCJA (ADD)
        System.out.println("Przykład sprawdzenia koniunkcji zostanie sprawdzona na przykładzie wieku");
        System.out.println("Chcemy sprawdzić czy ktoś jest osobą dorosła w wieku produkcyjnym");
        System.out.println("Wykorzystamy do tego zmienną typu int, której przypiszemy wartość 29");
        int wiekDoSprawdzenia;
        wiekDoSprawdzenia = 29;
        boolean wynik = wiekDoSprawdzenia >= 18 && wiekDoSprawdzenia <=65;
        System.out.println("Sprawdzana osoba jest w wieku produkcyjnym " + wynik);
        System.out.println("Jak widać nasza osoba jest w wieku produkcyjnym");
        //ALTERNATYWA (OR)
        System.out.println("Będziemy chcieli zatem teraz sprawdzić, czy nasza osoba będzie korzystać ze zniżek do komunikacji do tego wykorzystamy alternatywe");
        System.out.println("tylko teraz nasze warunki nie będą miały zakresu wiekDoSprawdzenia <= 18 && wiekDoSprawdzenia >=65 lecz odwrodnie");
        wynik = wiekDoSprawdzenia < 18 || wiekDoSprawdzenia > 65;
        System.out.println(wynik);
        System.out.println("Widać, że do zmiennej wynik została przypisana nowa wartość " + wynik + ", która odpowiada prawdzie dla naszego człowieka");
        wiekDoSprawdzenia = 67;
        System.out.println("Po modyfikacji wartości zmiennej wiekDoSprawdzenie na wartość 67 sprawdzimy teraz wynik " + wynik);
        //NEGACJA
        boolean prawda = false;
        System.out.println(!prawda);
        boolean czyJestMłody = true;
        System.out.println("Czy nasz wiekDoSprawdzenia jest młody? " + !czyJestMłody);

    }


}
