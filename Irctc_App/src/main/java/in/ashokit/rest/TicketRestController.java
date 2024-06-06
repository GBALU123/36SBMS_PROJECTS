package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Passenger;
import in.ashokit.bindings.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService service;
	

	@PostMapping(value="/ticket",
			produces="application/json",
			consumes="application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody   Passenger passenger){
		
		Ticket bookTicket = service.bookTicket(passenger);
		
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticket{ticketId}",
			produces="application/json"
			)
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketId") Integer ticketId){
		
		Ticket getticket = service.getticket(ticketId);
		
		return new ResponseEntity<>(getticket,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/tickets",
			produces="application/json"
			)
	public ResponseEntity<List<Ticket>> getTickets(){
		
		List<Ticket> tickets = service.getTickets();
		
		return new ResponseEntity<>(tickets,HttpStatus.OK);
	}
}
