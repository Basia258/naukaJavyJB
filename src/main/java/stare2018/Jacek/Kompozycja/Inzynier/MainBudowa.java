package stare2018.Jacek.Kompozycja.Inzynier;

public class MainBudowa {
    public static void main(String[] args) {
        Murarz bogdanKlich = new Murarz();
        Kierownik donaldTusk = new Kierownik();

        donaldTusk.setJozek(bogdanKlich);
        donaldTusk.buduj();




    }
}
