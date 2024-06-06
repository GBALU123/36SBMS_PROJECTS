package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.NoUserFoundException;

@RestController
public class UserRestController {

	
	@GetMapping("/user/{uid}")
	public String getNameById(@PathVariable("uid")  Integer uid) {
		
		if(uid <= 100) {
			return "Balu";
		}else {
			
			throw  new NoUserFoundException("Invalid user id");
		}
	}
	
}
