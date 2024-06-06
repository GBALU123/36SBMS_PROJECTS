package in.ashokit.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;
	
	@PostMapping(value="/ticket",
			consumes="application/json",
			produces="application/json"
			)
	public ResponseEntity<Ticket> bookticket( @RequestBody Passenger p){
		
		Ticket ticket = service.bookTicket(p);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/tickets",
			produces="application/json"
			)
	public ResponseEntity<Collection<Ticket>> getAllTickets(){
		
		Collection<Ticket> allTickets = service.getAllTickets();
		
		return new ResponseEntity<>(allTickets, HttpStatus.OK);
	}
}
