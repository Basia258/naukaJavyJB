package Barbara.Kompozycja;

public class MainKM {

    public static void main(String[] args) {

        Murarz dddd = new Murarz();
        Kierownik aaaa = new Kierownik();

        aaaa.setDupaMurarz(dddd);

        aaaa.buduj();



    }
}
