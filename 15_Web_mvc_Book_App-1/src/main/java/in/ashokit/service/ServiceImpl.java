package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepo;

@Service
public class ServiceImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public List<Book> getAllBooks() {
		return  bookRepo.findAll();
	}

	@Override
	public boolean saveBook(Book book) {
		Book savedbook = bookRepo.save(book);
		if(savedbook.getBookId() != null) {
			return true;
		}
		return false;
	}
/*
 * 
 * return savedbook.getBookId() != null;
 */
	
}
