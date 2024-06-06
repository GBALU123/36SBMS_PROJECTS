package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	
	@GetMapping("/demo")
	public String democontroller() {
		
		String msg = "welcome to Ashok It";
		
		String s = null;
		
		s.length();
		
		return msg;
	}
}
