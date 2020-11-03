package nowe2020.klasy.metodyOrazPola.Powtorka;

public class MainKonto {

    public static void main(String[] args) {

        Konto ing = new Konto();
        Konto pko = new Konto();

        ing.setStanKonta(1000);
        pko.setStanKonta(1000);
        pko.wypłata(500);
        System.out.println(pko.getStanKonta());
        pko.wpłata(500);
        System.out.println(pko.getStanKonta());
        System.out.println(ing.getStanKonta());
        System.out.println("przelew na 500zł");
        ing.wpłata(pko.wypłata(500));
        System.out.println(pko.getStanKonta());
        System.out.println(ing.getStanKonta());


    }
}
