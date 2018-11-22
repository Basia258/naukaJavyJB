package Barbara.interfejsy.Zmywarka;

public class ZmywarkaWhirlpool implements Zmywarka {

    public void umyj (Naczynia naczynia) {
        if (naczynia.jestBrudne())

        {
            System.out.println("Naczynia są brudne. Umyj je.");

        }
        else
        {

            naczynia.setBrudne(true);


        }
    }}