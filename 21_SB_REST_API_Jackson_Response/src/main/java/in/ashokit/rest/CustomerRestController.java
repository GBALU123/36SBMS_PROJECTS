package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Customer;

@RestController
public class CustomerRestController {

	@DeleteMapping(value="/customer/{cid}", produces="text/plain")
	public String deleteCustomer(@PathVariable Integer cid) {
		//db logic to delete
		return "Customer-Deleted"
;	}
	
	@PutMapping(value="/customer",consumes="application/json",produces="text/plain")
	public String UpdateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		//db logic to update the record
		return "customer-updated";
	}
	
	
	@PostMapping(value="/customer", produces="text/plain",consumes="application/json")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c) {
		System.out.println(c);
		//db logic to insert record
		String body = "customer-added";
		return new ResponseEntity<>(body, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/customer",  produces="/application/json")
	public Customer getCustomer() {
		//logic to get record from db
		Customer c = new Customer(101, "balu", "balu19@gmail.com");
		return c;
	}
	
	@GetMapping(value="/customers",produces="/application/json" )
	public List<Customer> getCustomers(){
		//logic to get records from db
		Customer c1 = new Customer(101, "balu", "balu19@gmail.com");
		Customer c2 = new Customer(102, "ashok", "ashok@gmail.com");
		Customer c3  = new Customer(103, "adhi", "adhi@gmail.com");
		
		List<Customer> customers = Arrays.asList(c1,c2,c3);
		return customers;
	}
}
