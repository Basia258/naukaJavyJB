package JavaDlaPoczatkujacych.rozdzial_drugi_obiektowy.pitagoras;

public class PitagorasSwiat {

    public static void main(String[] args) {

        // W main mogą być tylko obiekty.

        PanPitagoras nowyNaukowiec = new PanPitagoras();

        System.out.println(nowyNaukowiec.MojeTwierdzenie(3, 4));
        System.out.println(nowyNaukowiec.mnozenie(2,2));
        System.out.println(nowyNaukowiec.dzielenie(10,0));
        System.out.println(nowyNaukowiec.miejsceZeroweFunkcjiKwadratowej(1,5,6));

    }
}
