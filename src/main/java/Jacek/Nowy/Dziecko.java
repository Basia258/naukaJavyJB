package Jacek.Nowy;

public class Dziecko {

    private int skarbonka;


    public int getSkarbonka() {
        return this.skarbonka;
    }

    public void mojeKieszonkowe (int skarbonka) {
        this.skarbonka = this.skarbonka + skarbonka;
    }


}
