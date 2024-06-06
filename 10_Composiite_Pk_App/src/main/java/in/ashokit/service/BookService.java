package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.entity.BookPk;
import in.ashokit.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookrepo;
	
	public void saveBook() {
		BookPk pk = new BookPk(101, "java");
		Book entity = new Book(1000.00, "james", pk);
		bookrepo.save(entity);
		System.out.println("Record inserted ");
	}
	
	public void getBook() {
		
		BookPk pk = new BookPk(101, "java");
		Optional<Book> findById = bookrepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
}
