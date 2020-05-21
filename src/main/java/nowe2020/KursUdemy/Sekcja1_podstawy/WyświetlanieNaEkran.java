package nowe2020.KursUdemy.Sekcja1_podstawy;

public class WyświetlanieNaEkran {
    public static void main(String[] args) {
        int zmiennaTypuInteger =  100;
        double zmiennaTypuDouble =55.55;
        System.out.println("Pierwszy tekst");
        System.out.println("Drugi tekst");
        //Możemy też teksty łączyć w jednej linijce na 2 sposoby. Pierwszy z nich to taki
        System.out.println("Pierwszy tekst " + "Drugi tekst");
        // Bądź poprzez dodawanie kolejnych tekstów metodą System.out.print bez ln
        System.out.print("Pierwszy tekst ");
        System.out.println("Drugi tekst");
        //Możemy również wrzucać zmienne
        String pierwszaZmienna;
        pierwszaZmienna = "Pierwszy tekst";
        String drugaZmienna = "Drugi tekst";
        System.out.println(pierwszaZmienna + " " + drugaZmienna);
        //Widzimy że w argumentach metody sout cyfra 5 zostaje z automatu zmieniona na tekst
        System.out.println(pierwszaZmienna + " " + "Druga zmienna " + 5);
        //Teraz dokonamy działań arytmetycznych we wnętrzu metody sout
        System.out.println(5 + " + " + 5 + " Suma: " + (5+5));
        System.out.println("zmiennaTypuDouble - zmiennaTypuInteger" + " = "+ (zmiennaTypuDouble - zmiennaTypuInteger));
        //komenda w 23 wierszu pokazuje, że możemy dokonywać działań arytmetycznych
        //w metodzie sout



    }
}
