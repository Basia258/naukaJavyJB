package Barbara.Rodzina;

public class MainRodzina {
    public static void main(String[] args) {

        Dziecko karol = new Dziecko();
        Mama krystyna = new Mama();
        Skarbonka swinka = new Skarbonka ();
        Portfel skorzany = new Portfel();

        //zapomnialas dac skarbonke dziecku
        karol.setMojaKochanaSkarbonka(swinka);

        krystyna.setKasaWportfelu(skorzany);

        System.out.println( "Dziecko ma " + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");
        System.out.println( "Mama ma " + krystyna.getKasaWportfelu().getStanPortfela() + " zł w portfelu");
        System.out.println();

        System.out.println("Mam wlasnie daje kieszonkowe swojemu dzieku....");
        krystyna.dajKieszonkowe(karol, 100);
//        krystyna.dajKieszonkowe(karol, 30);

        System.out.println();
        System.out.println ("Dziecko ma " + karol.getMojaKochanaSkarbonka().getMojeKieszonkowe() + " zł kieszonkowego");
        System.out.println( "Mama ma " + krystyna.getKasaWportfelu().getStanPortfela() + " zł w portfelu");
    }
}
