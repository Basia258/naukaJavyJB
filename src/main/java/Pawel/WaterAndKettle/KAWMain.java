package Pawel.WaterAndKettle;

public class KAWMain {

    public static void main(String[] args) {

        Water woda = new Water();

        Kettle czajnik = new Kettle();

        System.out.println("Nasza woda jest goraca: " + woda.isHot());
    }
}
