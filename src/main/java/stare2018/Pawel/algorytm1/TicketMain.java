package stare2018.Pawel.algorytm1;

public class TicketMain {


    public static void main(String[] args) {

        Passenger pawel = new Passenger();

        Conductor conductor = new Conductor();

        System.out.println("Pierwsza kontrola");
        conductor.checkPassenger(pawel);

        System.out.println("Stan portfela Pawla to " + pawel.getStanPortfela());

        System.out.println("");
        System.out.println("Druga kontrola");
        conductor.checkPassenger(pawel);
        System.out.println("Stan portfela Pawla to " + pawel.getStanPortfela());





    }



}
