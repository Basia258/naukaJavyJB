package Barbara.interfejsy.Pralka;

public class PralkaAmica implements Pralka{


    public void wypierz(Ubranie ubranie) {

        if(ubranie.jestCzyste())
        {
            System.out.println("UBranie jest czyste = nie robie nic");
        }
        else
        {
            ubranie.setCzyste(true);
        }

    }



}
