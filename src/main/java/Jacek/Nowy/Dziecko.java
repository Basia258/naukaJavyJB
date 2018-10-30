package Jacek.Nowy;

public class Dziecko {

    private Skarbonka rozowaSwinka;


    public Skarbonka getRozowaSwinka() {
        return this.rozowaSwinka;
    }

    public void setSkarbonka(Skarbonka mojaKocanaSkaronka) {
        this.rozowaSwinka = mojaKocanaSkaronka;
    }

    public void mojeKieszonkowe (int kasaZKieszonkowego)
    {
        this.rozowaSwinka.setIloscPieniedzy(kasaZKieszonkowego);
    }


}
