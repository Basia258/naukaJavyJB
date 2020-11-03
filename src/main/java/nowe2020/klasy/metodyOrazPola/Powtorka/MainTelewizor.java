package nowe2020.klasy.metodyOrazPola.Powtorka;

public class MainTelewizor {
    public static void main(String[] args) {
        Telewizor toshiba = new Telewizor();
        Pilot pilotToshiba = new Pilot();

        pilotToshiba.wlaczLubWylacz(toshiba);
        toshiba.setOff();


    }
}
