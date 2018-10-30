package Barbara.Rodzina;

public class Portfel
{

    private double stanPortfela;

    public double getStanPortfela()
    {
        return stanPortfela;
    }
    public Portfel ()

    {this.stanPortfela = 50;}

    public void wyciągnijKase (double kasaNaKieszonkowe)
    {
        if
        (kasaNaKieszonkowe > stanPortfela) {
            System.out.println("Przykro mi, nie dostaniesz kieszonkowego. Nie mam tyle pieniędzy");
        }

            else
                {
                    this.stanPortfela = this.stanPortfela - kasaNaKieszonkowe;
                }
    }

    public void setStanPortfela(double stanPortfela)
    {
        this.stanPortfela = stanPortfela;
    }
}
