package Barbara.Rodzina;

public class Dziecko {

    private Skarbonka mojaKochanaSkarbonka;


    public void przyjmijKieszonkowe(double kasaZkieszonkowego) {
        this.mojaKochanaSkarbonka.setMojeKieszonkowe(kasaZkieszonkowego);
    }


    public void setMojaKochanaSkarbonka(Skarbonka mojaKochanaSkarbonka) {
        this.mojaKochanaSkarbonka = mojaKochanaSkarbonka;
    }

    public Skarbonka getMojaKochanaSkarbonka() {
        return mojaKochanaSkarbonka;

    }

    private Rower rowerKtoryChceMiec;

    public Rower getRowerKtoryChceMiec() {
        return rowerKtoryChceMiec;
    }

    public void setRowerKtoryChceMiec(Rower rowerKtoryChceMiec) {
        this.rowerKtoryChceMiec = rowerKtoryChceMiec;
    }




}
