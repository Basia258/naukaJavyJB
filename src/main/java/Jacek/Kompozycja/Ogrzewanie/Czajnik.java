package Jacek.Kompozycja.Ogrzewanie;

public class Czajnik {

    private Grzalka zmiennaDowolna;

    private void setZmiennaDowolna(Grzalka zmiennaDupa)
    {
        this.zmiennaDowolna = zmiennaDupa;
    }
    public void gotujeWode(Grzalka zmiennaDowolna)
    {
        zmiennaDowolna.gotuje();
    }


}
