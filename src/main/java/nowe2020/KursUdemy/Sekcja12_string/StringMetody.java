package KursUdemy.Sekcja12_string;

public class StringMetody {
    public static void main(String[] args) {
        String tekst = "jakis tekst";

        tekst.length();
        System.out.println("Wyliczana dlugosc strunga " + tekst.length());

        tekst.isEmpty();
        System.out.println("isEmpty: " + tekst.isEmpty());

        char pojedynczyZnak = tekst.charAt(tekst.length() -1);
        System.out.println("chartAT " + pojedynczyZnak);

        System.out.println("substring: " + tekst.substring(6));
        System.out.println("substring: " + tekst.substring(0,6));
        String substring = tekst.substring(3,9);
        System.out.println(substring);

        String nowyString = "byle co            ";
        System.out.println("." + nowyString + ".");
        System.out.println("trim: " + "." + nowyString.trim() + "."); //trim usuwa biale znaki takie jak niepotrzebne znaki

        String rozneWielkosciLiter = "rozne litery DUZE I male";
        System.out.println(rozneWielkosciLiter.toLowerCase() + " metoda toLowerCase zmienia duze na male");
        System.out.println(rozneWielkosciLiter.toUpperCase() + " metoda toLowerCase zmienia male na duze");

        String czyZawiera = "   Czy zawiera jakis tekst";
        /*String czyZawieraMaleZnaki = czyZawiera.toLowerCase();
        String czyZawieraMaleZnakiBezSpacji = czyZawieraMaleZnaki.trim();*/
        //String czyZawieraUproszczone = czyZawiera.toLowerCase().trim();
        System.out.println("startsWith: " + czyZawiera.toLowerCase().trim().startsWith("czy "));

        String czyZawieraKoncowke = "jakis tekst z koncowka";
        System.out.println("endsWith: " + czyZawieraKoncowke.endsWith("koncowke"));

        System.out.println("contains: " + czyZawiera.contains("Czy"));

        System.out.println("replace: " + czyZawiera.replace('k','6'));

    }
}
