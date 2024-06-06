package in.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.Passenger;
import in.ashokit.bindings.Ticket;
import in.ashokit.repo.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepo;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t = new Ticket();
		
		BeanUtils.copyProperties(passenger, t);
		
		t.setTicketStatus("Confirmed");
		
		Ticket saveTicket = ticketRepo.save(t);
		
		return saveTicket;
	}

	@Override
	public Ticket getticket(Integer ticketId) {
		
		return ticketRepo.findById(ticketId).orElseThrow();
	}

	@Override
	public List<Ticket> getTickets() {
		
		return ticketRepo.findAll();
		
	}

	
	
}
