package stare2018.Barbara.interfejsy.Pralka;

public class Spodnie implements Ubranie {


    private boolean wymiete;
    private boolean saCzyste;


    public boolean jestCzyste() {
        return this.saCzyste;
    }


    public void setCzyste(boolean saCzyste) {
        this.saCzyste = saCzyste;
    }

    public boolean isWymiete() {
        return wymiete;
    }

    public void setWymiete(boolean wymiete) {
        this.wymiete = wymiete;
    }

    public boolean saWymiete()
    {
        return this.wymiete;
    }


}
