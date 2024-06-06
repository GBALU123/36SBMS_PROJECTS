package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.binding.Ticket;
import in.ashokit.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Ticket> alltickets = service.getAllTickets();
		
		model.addAttribute("tickets", alltickets);
		
		return "index";
		}

}
