package Barbara.Kompozycja.Artykul;

import Barbara.Kompozycja.Artykul.Dziennikarz;

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
