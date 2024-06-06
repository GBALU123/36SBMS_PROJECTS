package in.ashokit.service;


import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	public void saveBook(Book book) {
		bookRepo.save(bookRepo);
	}
	
}
