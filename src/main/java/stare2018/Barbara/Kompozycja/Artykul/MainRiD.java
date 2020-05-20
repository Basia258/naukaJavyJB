package stare2018.Barbara.Kompozycja.Artykul;

public class MainRiD {
    public static void main(String[] args) {
        Dziennikarz kowalski = new Dziennikarz();
        Redaktor nowak = new Redaktor();
        nowak.setJanDziennikarz(kowalski);
        nowak.stworzArtykul();
    }

}
