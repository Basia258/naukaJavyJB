package KursUdemy.Sekcja15_klasy_i_dziedziczenie;

public class MainThis {
    public static void main(String[] args) {
        ThisKlasaRozszerzona obiektPierwszy = new ThisKlasaRozszerzona();
        System.out.println("oddzielenie");
        ThisKlasaRozszerzona obiektDrugi = new ThisKlasaRozszerzona(100);
        System.out.println("oddzielenie");
        ThisKlasaRozszerzona obiektTrzeci = new ThisKlasaRozszerzona(1,2);

        System.out.println(obiektTrzeci.x);
        System.out.println(obiektTrzeci.y);

        obiektTrzeci.metodaZParametrami(1231);
        System.out.println("pole z obiektu trzeciego: " + obiektTrzeci.pole);


    }
}
