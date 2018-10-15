package Barbara.Kompozycja;

public class MainBandJ {

    public static void main(String[] args) {
        Jacek man = new Jacek();
        Basia women = new Basia();

        women.setKochany(man);
        women.smiejSie();
    }
}
