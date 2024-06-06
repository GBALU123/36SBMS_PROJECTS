package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to Ashok IT...!!!";
		
		return msg;
		
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(@RequestParam String name) {
		String msg =  name + ", Good Morning..!!";
		
		return msg;
		
	}
}
