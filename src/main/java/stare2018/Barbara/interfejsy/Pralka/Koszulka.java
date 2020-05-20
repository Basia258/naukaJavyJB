package stare2018.Barbara.interfejsy.Pralka;

public class Koszulka implements Ubranie {


    private boolean nieswieza;

    private boolean isCzyste;

    public boolean jestCzyste() {
        return this.isCzyste;
    }


    public void setCzyste(boolean czyste) {
        isCzyste = czyste;
    }

    public boolean jestNiesiweza()
    {
        return this.nieswieza;
    }

    public boolean isNieswieza() {
        return nieswieza;
    }

    public void setNieswieza(boolean nieswieza) {
        this.nieswieza = nieswieza;
    }
}
