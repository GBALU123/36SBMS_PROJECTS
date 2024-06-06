package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/demo")
	public String getMsg() {
		
		String msg = "Welcome To Ashok It";
		String s = null;
		s.length();
		
		return msg;
		
	}
	
	
	
}
