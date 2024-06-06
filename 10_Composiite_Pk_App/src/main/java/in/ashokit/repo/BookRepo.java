package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Book;
import in.ashokit.entity.BookPk;

public interface BookRepo  extends JpaRepository<Book, BookPk>{

}
