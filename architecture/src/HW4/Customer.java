package HW4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    Integer id;
    List<Ticket> tickets;
    PaymentSystem paymentSystem;

    public Customer(Integer id, List<Ticket> tickets) {
        this.id = id;
        this.tickets = tickets;
        this.paymentSystem = new PaymentSystem();
    }

    public boolean buyTicket(Ticket ticket){
        boolean success = paymentSystem.buy(ticket.getPrice());
        if (success) {
            tickets.add(ticket);
        }
        return success;
    }

    public boolean repealTicket(Ticket ticket){

        boolean success = paymentSystem.repailTicket(ticket.getPrice());
        if (success) {
            tickets.remove(ticket);
        }
        return success;
    }

    public Ticket[] searchTicket(int id) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                result.add(ticket);
            }
        }
        return result.toArray(new Ticket[0]);
    }
}
