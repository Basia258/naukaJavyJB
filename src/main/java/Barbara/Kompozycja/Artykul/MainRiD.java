package Barbara.Kompozycja.Artykul;

import Barbara.Kompozycja.Artykul.Dziennikarz;
import Barbara.Kompozycja.Artykul.Redaktor;

public class MainRiD {
    public static void main(String[] args) {
        Dziennikarz kowalski = new Dziennikarz();
        Redaktor nowak = new Redaktor();
        nowak.setJanDziennikarz(kowalski);
        nowak.stworzArtykul();
    }

}
