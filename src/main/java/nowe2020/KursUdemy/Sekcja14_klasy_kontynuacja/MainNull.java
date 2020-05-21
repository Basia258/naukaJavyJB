package nowe2020.KursUdemy.Sekcja14_klasy_kontynuacja;

public class MainNull {
    static String str = new String("Jakis tekst");
    static KlasaTestowaDlaNulla obiekt = new KlasaTestowaDlaNulla();

    public static void main(String[] args) {
        if(str == null){
            System.out.println("Wartosc null dla Stringa: " + str);
        }
        else {
            System.out.println("Nie jestem nullem");
        }
        obiekt.metoda();
    }
}
