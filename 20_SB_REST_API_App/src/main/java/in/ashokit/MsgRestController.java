package in.ashokit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	
	@GetMapping("/greet")
	public String getGreetMsg(@RequestParam String name) {
		String msg = name+",Good mornuing...!!";
		return msg;
		
	}

	@GetMapping("/welcome/{name}")
	public ResponseEntity<String> getWelcomeMsg(@PathVariable("name") String name) {
		String msg = name + ", Welcome to REST API..!!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/action")
	public ResponseEntity<Void> doaction() {
		System.out.println("Action( method called...!!");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
