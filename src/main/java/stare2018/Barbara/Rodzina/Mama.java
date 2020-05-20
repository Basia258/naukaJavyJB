package stare2018.Barbara.Rodzina;

public class Mama {


    private Portfel kasaWportfelu;


    public void dajKieszonkowe(Dziecko mojeDziecko, double kwotaKieszonkowego)
    {
        // wyciagamy z portfela kase na kieszonkowe -> czyli metoda 'wyciagnijKase' musi zwrocic jakas liczbe typu double
        // kase ktora wyciagniemy z porfela przypisujemy do zmiennej 'kasaNaKieszonkowe'
        double kasaNaKieszonkowe = this.kasaWportfelu.wyciagnijKase(kwotaKieszonkowego);

        //ok. Mamy juz wyciagnieta kase na kieszonkowe. Teraz musimy dac ta kase dziecku. A wiec:
        mojeDziecko.przyjmijKieszonkowe(kasaNaKieszonkowe);

    }

    public void setKasaWportfelu(Portfel kasaWportfelu) {
        this.kasaWportfelu = kasaWportfelu;
    }

    public Portfel getKasaWportfelu() {
        return kasaWportfelu;
    }
}
