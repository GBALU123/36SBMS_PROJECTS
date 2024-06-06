package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping(value="/msg" ,produces="application/json")
	public ResponseEntity<String> getMsg(){
		
		String msg = "Welcome To Rest Api";
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/greet/{name}")
	public String getGreetMsg( @PathVariable String  name) {
		String msg = name +",Good Morning..!!";
		return msg;
	}
	
	
	@GetMapping("/welcome")
	public String getWelcome(@RequestParam String name) {
		String msg = name+" ,Welcome to Ashok It";
		return msg;
	}
	
}
