package Jacek.Kompozycja.Wiertarka;

public class MainWiercenie {

    public static void main(String[] args) {

        Wiertlo male9 = new Wiertlo();
        Wiertarka bosch = new Wiertarka();

        bosch.setRozmiar8(male9);

        bosch.wierci();

    }



}
