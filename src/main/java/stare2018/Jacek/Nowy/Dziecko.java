package stare2018.Jacek.Nowy;

public class Dziecko {

    private Skarbonka rozowaSwinka;

    public Skarbonka getRozowaSwinka()
    {
        return this.rozowaSwinka;
    }

    public void setRozowaSwinka (Skarbonka rozowaSwinka)
    {
        this.rozowaSwinka = rozowaSwinka;
    }

    public void przyjmijKieszonkowe (int kasaZKieszonkowego)
    {
        this.rozowaSwinka.setIloscPieniedzy(kasaZKieszonkowego);
    }


}
