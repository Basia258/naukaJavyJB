package Jacek.Kompozycja.Ogrzewanie;

public class Czajnik {

    private Grzalka zmiennaDowolna;

    public void setZmiennaDowolna(Grzalka zmiennaDupa)
    {
        this.zmiennaDowolna = zmiennaDupa;
    }
    public void gotujeWode()
    {
        this.zmiennaDowolna.gotuje();
    }


}
