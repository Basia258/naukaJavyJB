package KursUdemy.Sekcja7_instrukcje_warunkowe;

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        // ang. conditional statements
        /* Wyróżniamy dwie instrukcje if oraz else
        If (w nawiasie wpisujemy warunek, który musi zostać spełniony aby została wykonana operacja
        operacje dajemy w nawiasach {}.
        Jeśli warunek nie zostanie spełniony program nie wykona polecenia, chyba że zostanie użyta komenda else
        else - jest to wykonanie warunku jeśli nie został spełniony warunek z if
        dajemy go od początku w nawiasy {}.
        else if () {} - dajemy wtedy gdy chcemy dać więcej warunków do naszych istrukcji warunkowych.
         */
        int wiek = 17;
        boolean przyszedłTata = false;
        boolean przyszedłaMama =false;

        if (wiek >= 18) {
            System.out.println("Mogę sprzedać Ci alkohol");
            //System.out.println("warunek if został spełniony dlatego ten komunikat został wyświetlony");
        }
        else if (przyszedłTata == true)
        {
            System.out.println("Pański syn chciał kupić alkohol");
        }
        else if (przyszedłaMama && wiek <=17)
        {
            System.out.println("Pani syn chciał kupić alkohol");
        }
        else
            {
                System.out.println("Nie jesteś pełnoletni. Nie sprzedam Ci alkoholu");
            }
    }
}
