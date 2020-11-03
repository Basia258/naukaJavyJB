package nowe2020.klasy.metodyOrazPola.Powtorka;

public class Konto {

    private int stanKonta;


    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public int wypłata (int kwota){
        this.stanKonta  = stanKonta - kwota;
        return this.stanKonta;
    }
    public void wpłata (int kwota){
        this.stanKonta = stanKonta + kwota;
    }

}
