package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/index")
	public ModelAndView index() {
	ModelAndView mav = new ModelAndView();
	mav.addObject("book", new Book());
	mav.setViewName("index");
	return mav;
	}
	
	@PostMapping("/book")
	public ModelAndView saveBook(Book book) {
		ModelAndView mav = new ModelAndView();
		System.out.println(book);
		mav.setViewName("index");
		return mav;
		
	}

	@GetMapping("/books")
	public ModelAndView getBooks() {
		
		ModelAndView mav = new ModelAndView();
		List<Book> allBooks = bookService.getAllBooks();
		mav.addObject("books", allBooks);
		mav.setViewName("bookview");
		return mav;
		
	}
}
