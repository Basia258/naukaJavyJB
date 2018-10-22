package Jacek.Kompozycja.Lokomocja;

public class MainLokomocja {
    public static void main(String[] args) {

        Samochod mercedes = new Samochod();
        Kierowca kubicaRobert = new Kierowca ();

        kubicaRobert.prowadzi(mercedes);

    }
}
