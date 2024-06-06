package in.ashokit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	// To store our tickets
	Map<Integer, Ticket> db = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger p) {
		
		Ticket t = new Ticket();
		
		Random r = new Random();
		
		int id = r.nextInt(6);
		
	      t.setTicketId(id);
		
		// copy the passenger information in source, target
		BeanUtils.copyProperties(p, t);
		
		t.setTicketStatus("CONFIRMED");
		
		// save the records in map object
		db.put(id, t);
	
		return t;
	}
	

	@Override
	public Collection<Ticket> getAllTickets() {
		
		return db.values();
	}

}
