package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;
import in.ashokit.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public ResponseEntity<String> createCourse(@RequestBody Customer course){
		String status = customerService.upsert(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getCourse(@PathVariable("customerId") Integer customerId){
		Customer status = customerService.getById(customerId);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCourses(){
	   List<Customer> allCourses  = customerService.getAllCourses();
	   return new ResponseEntity<>(allCourses,HttpStatus.OK);
	}
	@PutMapping("/customer")
	public ResponseEntity<String> updateCourse(@RequestBody Customer course){
		String status = customerService.upsert(course);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		 String status = customerService.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
