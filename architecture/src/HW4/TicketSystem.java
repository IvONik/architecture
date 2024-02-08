package HW4;

import java.util.ArrayList;
import java.util.List;

public class TicketSystem {
    private List<Ticket> tickets;

    public TicketSystem() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
}
