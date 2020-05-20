package stare2018.Pawel.algorytm1;

public class Passenger {

    // tak nie robimy
//    private Ticket ticket = new Ticket();

    private Ticket ticket;
    private Wallet wallet;

    // nadpisanie bezparametrowego konstruktora jest OK!
    public Passenger()
    {
        this.ticket = new Ticket();
        this.wallet = new Wallet();
    }


    // to tez jest ok!
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void nalozKare(double nalozonaKara)
    {
        this.wallet.wyciagnijGotowke(nalozonaKara);
    }

    public double getStanPortfela() {
        return this.wallet.getStanPorfela();
    }
}
