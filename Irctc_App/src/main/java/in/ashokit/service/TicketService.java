package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.Passenger;
import in.ashokit.bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	
	public Ticket getticket(Integer ticketId);
	
	
	public List<Ticket> getTickets();
	
}
