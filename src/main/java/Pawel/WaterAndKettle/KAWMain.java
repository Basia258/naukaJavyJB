package Pawel.WaterAndKettle;

public class KAWMain {

    public static void main(String[] args)
    {
        Water wodaZimna = new Water();

        Water wodaGoraca = new Water();
        wodaGoraca.setHot(true);

        Kettle czajnik = new Kettle();

        System.out.println("Nasza woda jest goraca: " + wodaZimna.isHot());
        System.out.println("");
        czajnik.boilWater(wodaZimna);
        System.out.println("");
        czajnik.turnOn();
        System.out.println("");
        czajnik.boilWater(wodaZimna);
        System.out.println("Nasza woda jest goraca: " + wodaZimna.isHot());

        // logika dla wody1 -> czyli goracej od poczatku

//        System.out.println("Nasza woda jest goraca: " + wodaGoraca.isHot());
//        System.out.println("");
//        czajnik.boilWater(wodaGoraca);
//        System.out.println("");
//        czajnik.turnOn();
//        System.out.println("");
//        czajnik.boilWater(wodaGoraca);
//
//        System.out.println("Nasza woda jest goraca: " + wodaGoraca.isHot());

    }
}
