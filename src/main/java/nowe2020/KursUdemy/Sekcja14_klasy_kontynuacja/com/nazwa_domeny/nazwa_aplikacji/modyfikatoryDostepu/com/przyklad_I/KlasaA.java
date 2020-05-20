package KursUdemy.Sekcja14_klasy_kontynuacja.com.nazwa_domeny.nazwa_aplikacji.modyfikatoryDostepu.com.przyklad_I;

public class KlasaA {

    public int polePubliczne; // dostępne wszędzie o czym świadczy modifikator dostepu public
    protected int poleDziedziczenie; // dostępne w dziedziczeniu oraz w tym samy package'u
    private int polePrywatne; // dostępne w obrębie tej klasy
    int poleBezNiczego; // bez modifikatora albo modyfikator dostępu typu package jest dostępne w tym samym package'u

    public void metodaPubliczna (){

    }

    protected void metodaProtected(){

    }

    private void metodaPrywatna(){

    }

    void metodaBezNiczeo(){

    }


}
