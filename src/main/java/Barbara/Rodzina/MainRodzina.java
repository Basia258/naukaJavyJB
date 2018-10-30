package Barbara.Rodzina;

public class MainRodzina {
    public static void main(String[] args) {

        Dziecko karol = new Dziecko();
        Mama krystyna = new Mama();
        Skarbonka swinka = new Skarbonka ();
        Portfel skorzany = new Portfel();

        krystyna.setKasaWportfelu(skorzany);

        System.out.println( "Dziecko ma" + krystyna.getKasaWportfelu().getStanPortfela() + " zł kieszonkowego");

        krystyna.dajKieszonkowe(karol, 100);
        krystyna.dajKieszonkowe(karol, 30);

        System.out.println ("Dziecko ma" + krystyna.getKasaWportfelu().getStanPortfela() + " zł kieszonkowego");
    }
}
