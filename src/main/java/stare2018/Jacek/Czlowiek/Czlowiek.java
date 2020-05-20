package stare2018.Jacek.Czlowiek;

public class Czlowiek {
    private String statusRodzinny;
    private int wiek;
    private int stanPortfela;
    public Czlowiek(String statusRodzinny, int age, int stanPortfela)
    {
        this.statusRodzinny = statusRodzinny;
        this.wiek = wiek;
        this.stanPortfela = stanPortfela;
    }
    public String getstatusRodziny(){
        return this.statusRodzinny;
    }
    public int getWiek()
    {
        return this.wiek;
    }
    public void setStanPortfela()
    {
        this.stanPortfela = stanPortfela+50;
    }
    public void kieszonkowe(){
        if(this.wiek<= 15) {
            setStanPortfela();
        }
        else {
            System.out.println("dziecko dostanie 100zl");
        }
    }
}
