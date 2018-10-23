package Pawel.algorytm1;

public class Conductor {

    //brak pol!!!!

    public void checkPassenger(Passenger passengerToCheck)
    {
        if(passengerToCheck.getTicket().isValidate())
        {
            System.out.println("KARA!");
            passengerToCheck.nalozKare(650);

        }
        else
        {
            System.out.println("Jest ok");

            passengerToCheck.getTicket().validateTicket();

        }

    }


//    public void validateTicket(Ticket ticketToCheck)
//    {
//        if(ticketToCheck.isValidate())
//        {
//            System.out.println("ten bilet jest skasowany. Masz kare");
//
//        }
//        else
//        {
//            System.out.println("Ok. bilet jest ok. Kasujemy go");
//
//            ticketToCheck.validateTicket();
//
//        }
//
//    }



}
