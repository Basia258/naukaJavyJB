package Jacek.Nowy;

public class Dziecko {

    private Skarbonka rozowaSwinka;

    public Skarbonka getRozowaSwinka()
    {
        return this.rozowaSwinka;
    }

    public void setSkarbonka(Skarbonka rozowaSwinka)
    {
        this.rozowaSwinka = rozowaSwinka;
    }

    public void przyjmijKieszonkowe (int kasaZKieszonkowego)
    {
        this.rozowaSwinka.setIloscPieniedzy(kasaZKieszonkowego);
    }


}
