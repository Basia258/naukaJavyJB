package nowe2020.KursUdemy.Sekcja12_string;

public class PorownywanieStringow {
    public static void main(String[] args) {

        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";

        boolean wynik = strLiteral1 == strLiteral2;
        System.out.println("strLiteral1 == strLiteral2: " + wynik);

        String stringObject1 = new String("tekst");
        String stringObject2 = new String("tekst");

        boolean wynikZObiektow = stringObject1 == stringObject2;
        System.out.println("stringObject1 == stringObject2: " + wynikZObiektow);
        wynik = strLiteral1 == stringObject1;
        System.out.println("strLiteral1 == stringObject1: " + wynik);

        // equals ta metoda pozwala nam porównać treść stringów
        wynik = strLiteral1.equals(strLiteral2);
        System.out.println("strLiteral1.equals(strLiteral2): " + wynik);
        wynik = strLiteral2.equals(stringObject2);
        System.out.println("strLiteral2.equals(strLiteral2): " + wynik);

        String innyTekst = "inny tekst";
        wynik = stringObject1.equals(innyTekst);
        System.out.println("StringObject1.equals(innyTekst): " + wynik);


    }
}
