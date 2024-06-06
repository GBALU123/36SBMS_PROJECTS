package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

@RestController
public class BookRestController {

	@PostMapping(value="/book",
			consumes= {"application/xml","application/json"},
	        produces="text/plain"
			)
	public String addBook(@RequestBody Book b) {
		
		System.out.println(b);
		
		//db logic to here
		
		return "book added";	
	}
	
	
	@GetMapping(value="/book",
			
			produces={"application/xml","application/json"}
			)
	public Book getBook() {
		
		Book book = new Book(101, "java", 300.00);
		
		return book; 
	}
	
}
