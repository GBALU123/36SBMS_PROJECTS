package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;

@Service
public interface BookService {

	public List<Book> getAllBooks();
	public boolean saveBook(Book book);
}
