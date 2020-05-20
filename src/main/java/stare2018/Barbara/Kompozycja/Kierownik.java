package stare2018.Barbara.Kompozycja;

public class Kierownik {
    private Murarz dupaMurarz;

    public void buduj(){

        this.dupaMurarz.muruj();

    }

    public void setDupaMurarz(Murarz dupaMurarz) {
        this.dupaMurarz = dupaMurarz;
    }
}
