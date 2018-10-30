package Barbara.Rodzina;

public class Mama

{private Portfel kasaWportfelu;



    public void  dajKieszonkowe(Dziecko mojeDziecko, double stanPortfela)

    {
        this.kasaWportfelu.wyciągnijKase(stanPortfela);
    }

    public void setKasaWportfelu(Portfel kasaWportfelu)
    {
        this.kasaWportfelu = kasaWportfelu;
    }

    public Portfel getKasaWportfelu()
    {
        return kasaWportfelu;
    }
}
