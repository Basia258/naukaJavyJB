package stare2018.Barbara.Kompozycja.Artykul;

public class Redaktor {

    private Dziennikarz janDziennikarz;
    public void stworzArtykul()
    {
        this.janDziennikarz.piszArtykul();
    }

    public void setJanDziennikarz(Dziennikarz janDziennikarz) {
        this.janDziennikarz = janDziennikarz;
    }
}
