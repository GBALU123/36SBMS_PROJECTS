package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcome() {
		
		String msg = "Wlcome to Ameerpet";
		
		int i = 10/0;
		
		return msg;
		
	}
	
}
