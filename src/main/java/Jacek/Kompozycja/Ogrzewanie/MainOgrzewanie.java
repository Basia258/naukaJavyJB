package Jacek.Kompozycja.Ogrzewanie;

public class MainOgrzewanie {

    public static void main(String[] args) {

        Grzalka skarpeta = new Grzalka();
        Czajnik elektrolux = new Czajnik ();

        elektrolux.gotujeWode(skarpeta);

    }
}
