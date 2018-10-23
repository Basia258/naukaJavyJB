package Pawel.algorytm1;

public class Wallet {

    private double stanPorfela;

    public double getStanPorfela() {
        return stanPorfela;
    }

    public Wallet()

    {
        this.stanPorfela = 500;
    }


    public void wyciagnijGotowke(double gotowkaKtoraChceszwyciagnac)
    {
        if (gotowkaKtoraChceszwyciagnac > stanPorfela)
        {
            System.out.println("Takiego WALA! nie mam tyle kasy");
        }
        else
        {
            this.stanPorfela = this.stanPorfela - gotowkaKtoraChceszwyciagnac;
        }
    }



}
