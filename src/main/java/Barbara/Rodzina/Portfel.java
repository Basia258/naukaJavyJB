package Barbara.Rodzina;

public class Portfel {

    private double stanPortfela;


    public Portfel()
    {
        this.stanPortfela = 50;
    }

    public double getStanPortfela() {
        return stanPortfela;
    }

    public double wyciagnijKase(double kasaNaKieszonkowe)
    {
        if (kasaNaKieszonkowe > stanPortfela)
        {
            System.out.println("Przykro mi, nie dostaniesz kieszonkowego. Nie mam tyle pieniędzy");

            //zwracamy 0 zl bo nie mamy dosc pieniedzy na kieszonkowe
            return 0;

        } else
        {
            //bardzo dobrze : pomniejszamy ilosc kasy w portfelu o kase ktora chcemy dac dziecku
            this.stanPortfela = this.stanPortfela - kasaNaKieszonkowe;

            // zwracamy tyle ile bylo zadeklarowane jako kieszonkowe
            return kasaNaKieszonkowe;
        }
    }

    public void setStanPortfela(double stanPortfela) {
        this.stanPortfela = stanPortfela;
    }
}
