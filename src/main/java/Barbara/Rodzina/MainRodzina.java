package Barbara.Rodzina;

public class MainRodzina {
    public static void main(String[] args) {

        Dziecko karol = new Dziecko();
        Mama krystyna = new Mama();
        Skarbonka swinka = new Skarbonka ();

        karol.setMojaKochanaSkarbonka(swinka);

        System.out.println( "Dziecko ma" + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");

        krystyna.dajKieszonkowe(karol, 100);
        krystyna.dajKieszonkowe(karol, 20);

        System.out.println ("Dziecko ma" + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");
    }
}
