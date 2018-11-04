package Barbara.Rodzina;

public class MainRodzina {
    public static void main(String[] args) {

        Dziecko karol = new Dziecko();
        Mama krystyna = new Mama();
        Skarbonka swinka = new Skarbonka ();
        Portfel skorzany = new Portfel();
        Sklep decathlon = new Sklep ();
        Rower romet = new Rower ();


        //zapomnialas dac skarbonke dziecku
        karol.setMojaKochanaSkarbonka(swinka);
        krystyna.setKasaWportfelu(skorzany);
        romet.getCenaZaRower();
        karol.setRowerKtoryChceMiec(decathlon.sprzedajRower());

        System.out.println( "Dziecko ma " + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");
        System.out.println( "Mama ma " + krystyna.getKasaWportfelu().getStanPortfela() + " zł w portfelu");
        System.out.println();

        System.out.println("Mama wlasnie daje kieszonkowe swojemu dzieku....");
        krystyna.dajKieszonkowe(karol, 100);
//        krystyna.dajKieszonkowe(karol, 30);

        System.out.println();
        System.out.println ("Dziecko ma " + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");
        System.out.println( "Mama ma " + krystyna.getKasaWportfelu().getStanPortfela() + " zł w portfelu");

        System.out.println("Mamo kup mi rower.Rower kosztuje" + romet.getCenaZaRower() + "zł.");

        System.out.println( "Dziecko ma" + karol.getRowerKtoryChceMiec().getCenaZaRower() + "swój wymarzony rower.");





    }
}
