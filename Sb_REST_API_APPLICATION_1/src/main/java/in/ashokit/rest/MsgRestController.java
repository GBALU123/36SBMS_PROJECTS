package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String msg = "Welcome to Ashok It";
		return msg;
		
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		String msg =  "Good Morning";
		
		return msg;
	}
}
