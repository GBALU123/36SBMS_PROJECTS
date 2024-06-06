package in.ashokit.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.MakeMyTripService;
import reactor.core.publisher.Mono;

@Controller
public class MakeMyTripControllerr {

	@Autowired
	private MakeMyTripService service;
	
	@PostMapping(value="/ticket",
			produces="application/json",
			consumes="application/json")
	public ResponseEntity<Mono<Ticket>> bookTicket(@RequestBody   Passenger passenger){
		
		Mono<Ticket> bookTicket = service.bookTicket(passenger);
		
		return new ResponseEntity<Mono<Ticket>>(bookTicket,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/tickets",
			     produces="application/json"
			)
	public ResponseEntity<Mono<Ticket[]>> getAllTickets(){
		
		Mono<Ticket[]> allTickets = service.getAllTickets();
		
		return new ResponseEntity<>(allTickets,HttpStatus.OK);
	}

	
	
}
