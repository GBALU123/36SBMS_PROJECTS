package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_info_table")
public class Book {

	
	private Double bookPrice;
	private String bookAuthor;
	
	@EmbeddedId
	private BookPk bookPk;
	
	public Book() {

	}

	public Book(Double bookPrice, String bookAuthor, BookPk bookPk) {
		super();
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
		this.bookPk = bookPk;
	}





	public Double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
