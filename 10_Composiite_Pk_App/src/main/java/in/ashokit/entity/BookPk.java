package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPk {

	private Integer bookId;
	private String bookName;
	
	
	public BookPk() {
	}
	
	
	public BookPk(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}


	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "BookPk [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
}
