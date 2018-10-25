package Barbara.Rodzina;

public class MainRodzina {
    public static void main(String[] args) {

        Dziecko karol = new Dziecko();
        Mama krystyna = new Mama();

        System.out.println( "Dziecko ma" + karol.getMojeKieszonkowe()+ " zł kieszonkowego");

        krystyna.dajKieszonkowe(karol);

        System.out.println ("Dziecko ma" + karol.getMojeKieszonkowe() + " zł kieszonkowego");
    }
}
