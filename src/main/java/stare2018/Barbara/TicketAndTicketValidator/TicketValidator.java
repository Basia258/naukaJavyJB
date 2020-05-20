package stare2018.Barbara.TicketAndTicketValidator;

public class TicketValidator {

    private boolean isOn;

    public void validateTicket (Ticket ticket) {
        if (this.isOn) {
            System.out.println("Jestem włączona");
        } else {
            System.out.println("Jestem wyłączona");
        }
    }


        public void turnOn()
        {
           this.isOn = true;
        }

//            if (ticket.isValidate()) {
//                System.out.println("You can`t validate Your ticket.The Ticket Validator is OFF");
//                ticket.setValidate(true);
//            } else {
//
//         System.out.println("Thank You, Your ticket is Validated");
//
//    }
//
    }
