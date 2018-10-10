package Barbara.TicketAndTicketValidator;

public class TicketValidator {

    private boolean isOn;

    public void validateTicket (Ticket ticket)

    {
        if (this.isOn) {
            if (ticket.isValidate()) {
                System.out.println("You can`t validate Your ticket.The Ticket Validator is OFF");
                ticket.setValidate(true);
            } else {
                System.out.println("Thank You, Your ticket is Validated");
            }

        }}


    }
