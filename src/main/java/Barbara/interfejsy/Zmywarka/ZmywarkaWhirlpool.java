package Barbara.interfejsy.Zmywarka;

public class ZmywarkaWhirlpool implements Zmywarka {

    public void umyj (Naczynia naczynia) {
        if (naczynia.jestBrudne())

        {
            // a moze tutaj lepsza logika bedzie umycie naczyn? Skoro wiemy, ze naczynia sa brudne :)
            // czyli
            // System.out.println("Naczynia sa brudne. Biore sie do mycia!");
            // naczynia.setBrudne(false);
            System.out.println("Naczynia są brudne. Umyj je.");

        }
        else
        {
            // a tutaj - skoro naczynia sa czyste. To moze jakies info ze naczynia sa czyste?:)
            // na przyklad
            // System.out.println("Naczynia sa czyste. Po co je myc? :)");
            naczynia.setBrudne(true);


        }
    }}