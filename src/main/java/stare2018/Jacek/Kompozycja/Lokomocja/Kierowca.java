package stare2018.Jacek.Kompozycja.Lokomocja;

public class Kierowca {
    private Samochod osobowy;

    public void prowadzi(Samochod marka)
    {
        marka.jezdzi();
    }
    public void setOsobowy (Samochod marka)
    {
        this.osobowy = marka;
    }

}
