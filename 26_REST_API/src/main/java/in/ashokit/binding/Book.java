package in.ashokit.binding;

public class Book {

	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrie;
	
	public Book() {
		
	}

	public Book(Integer bookId, String bookName, Double bookPrie) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrie = bookPrie;
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

	public Double getBookPrie() {
		return bookPrie;
	}

	public void setBookPrie(Double bookPrie) {
		this.bookPrie = bookPrie;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrie=" + bookPrie + "]";
	}
	
	
}
