package in.ashokit.REST_API_JUNIT.entity;


public class Book {
	
	private int bookId;
	
	private String bookName;
	
	private double price;
	
	
	

	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	

	public String getBookName() {
		return bookName;
	}

	
	public double getPrice() {
		return price;
	}

	
	
	

}
