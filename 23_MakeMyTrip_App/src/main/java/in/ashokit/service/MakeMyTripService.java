package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

@Service
public class MakeMyTripService {

	
	// consumer Logic
		public Ticket bokticket(Passenger p) {
			
			String url = "http://localhost:9090/ticket";
			
			RestTemplate rt = new RestTemplate();
			
			ResponseEntity<Ticket> forEntity = rt.postForEntity(url, p, Ticket.class);
			
			Ticket body = forEntity.getBody();
			
			return body;
			
			
			
		}
		
		public List<Ticket> getAllTickets(){
			String url = "http://localhost:9090/ticket";
			RestTemplate rt = new RestTemplate();
			
			ResponseEntity<Ticket[]> forEntity = rt.getForEntity(url, Ticket[].class);
			
			Ticket[] body = forEntity.getBody();
			List<Ticket> tickets = Arrays.asList(body);
			
			return tickets;
		}
}
