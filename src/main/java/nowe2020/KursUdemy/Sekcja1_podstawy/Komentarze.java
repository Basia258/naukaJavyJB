package KursUdemy.Sekcja1_podstawy;

public class Komentarze {
    public static void main(String[] args) {
     // ang. comments
        System.out.println("Komentarze służą do pomocy w opisywania kodu");
        System.out.println("Wyróżniamy 2 rodzaje komentarzy: liniowy oraz blokowy ");
        System.out.println("// - wykorzystując te dwa znaki spowodują że treść za nimi nie będzie brana pod uwagę, przy kompilacji programu");
        // oto przykład komentowania liniowego
        String komentrzBlokowy;
        komentrzBlokowy = "Komentarz blokowy rozpoczynamy od /* oraz kończymy */";
        System.out.println(komentrzBlokowy);
        /* w tym momencie tekst który jest tu napisany nie zostanie
        skompilowany przez maszyne wirtualną java
         */
        System.out.println("Oznacza on że wszystko to co znajdzie się pomiędzy tymi znakami, będzie uważane jako komentarz");
        String zamiana;
        zamiana = "Możemy również zamienić już isteniejący kod na komentarz zaznaczając myszką teks oraz dając znaki Ctrl i /";
        System.out.println(zamiana);
//        System.out.println("To jest tyle jeśli chodzi o komentarze");
//        System.out.print("Kod nr 21 oraz 22 nie zastaną już skompilwane");








    }
}
