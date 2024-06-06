package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		 BookRepository bookRepository = context.getBean(BookRepository.class);
		 
		 Book b = new Book();
		 b.setBookId(101);
		 b.setBookName("Java");
		 b.setBookPrice(500);
		 
		 bookRepository.save(b);
		
	}

}
