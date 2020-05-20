package stare2018.Barbara.TicketAndTicketValidator;

public class TMain {
    public static void main(String[] args) {

        Ticket bilet = new Ticket();
        TicketValidator kasownik = new TicketValidator();

        kasownik.validateTicket(bilet);

    }
}
