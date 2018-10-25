package Barbara.Rodzina;

public class Dziecko {

    private double mojeKieszonkowe;

    public double getMojeKieszonkowe() {
        return this.mojeKieszonkowe;
    }

    public void przyjmijKieszonkowe(double kasaZkieszonkowego)
    {
        this.mojeKieszonkowe = this.mojeKieszonkowe + kasaZkieszonkowego;
    }

}
