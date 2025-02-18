package in.ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Entity.Customer;
import in.ashokit.repo.CustomerRepo;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerRepo crepo;
	@Autowired
	private PasswordEncoder pwdEncoder;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginCheck( @RequestBody Customer c) {
		
		   UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(c.getUname(), c.getPwd());
		
		   try {
			   Authentication authenticate = authManager.authenticate(token);
			   
			   if(authenticate.isAuthenticated()) {
					 return new ResponseEntity<>("welcome to Ashok IT", HttpStatus.OK);
			   }
					 
		   }catch(Exception e) {
			   
		   }
		   return new ResponseEntity<String>("Invalid credentials", HttpStatus.BAD_REQUEST);  
		   
	}
	
	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer customer) {
		String encodepwd = pwdEncoder.encode(customer.getPwd());
		customer.setPwd(encodepwd);
		crepo.save(customer);
		
		return "customer register";
		
	}
	
	
	
	
	

}
