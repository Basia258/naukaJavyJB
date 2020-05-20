package KursUdemy.Sekcja12_string;

public class KlasaString {
    public static void main(String[] args) {
        String nazwaDlaStringa  = "Dowolny ciag znakow";
        System.out.println(nazwaDlaStringa);
        String kolejnyString = "jakis kolejny tekst";
        System.out.println(nazwaDlaStringa + " " +  kolejnyString);
        String polaczoneStirngi = nazwaDlaStringa  + " " + kolejnyString;
        System.out.println("cos przed tym: " + polaczoneStirngi);
    }
}
