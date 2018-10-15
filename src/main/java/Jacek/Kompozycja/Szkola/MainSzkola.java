package Jacek.Kompozycja.Szkola;

public class MainSzkola {
    public static void main(String[] args) {
        Nauczyciel roberNecek = new Nauczyciel();
        Szkola szkolaPodsawowa = new Szkola();

        szkolaPodsawowa.setMatematyk(roberNecek);
        szkolaPodsawowa.uczy();
        System.out.println("jesli uczniowie się ucza, to dostaja dobre oceny");

    }

}
