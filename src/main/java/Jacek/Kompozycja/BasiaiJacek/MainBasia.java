package Jacek.Kompozycja.BasiaiJacek;

public class MainBasia {

    public static void main(String[] args) {
        Jacek dowolnaZmienna = new Jacek();
        Basia dowolnaZmienna2 = new Basia();
        dowolnaZmienna2.setJacek(dowolnaZmienna);
        System.out.print("Jacek ");
        dowolnaZmienna2.cieszySie();

    }
}