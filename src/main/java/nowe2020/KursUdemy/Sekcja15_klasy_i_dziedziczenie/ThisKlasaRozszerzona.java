package nowe2020.KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class ThisKlasaRozszerzona extends ThisKlasaPodstawowa {

    int x;
    int y;
    int z;
    int v;
    int pole;

    ThisKlasaRozszerzona() {
        super(101);
        System.out.println("Konstruktor z klasy rozszerzonej");
    }

    ThisKlasaRozszerzona(int i) {
        this.x = i;
        System.out.println("Konstruktor z klasy rozszerzonej z parametrem i: " + i);
    }

    ThisKlasaRozszerzona(int a, int b) {
        this(a);
        this.y = b;
        System.out.println("Instruktor z klasy rozszerzona  z parametrami; " + a + " " + b);
    }

    void metodaZTejKlasy() {

    }

    void metodaZParametrami(int pole){
        this.pole = pole;
    }


}


