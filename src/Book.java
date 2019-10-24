import java.util.*; 
public class Book {
	 
	String isbn, name,author,publisher;  
	int quantity;  
	
	public Book(String isbn, String name, String author, int quantity) {  
	    this.isbn = isbn;  
	    this.name = name;  
	    this.author = author;  
	    this.quantity = quantity;  
	}
  
	public void addBook(int isbn, String name, String author, int quantity) {  
		HashSet<Book> set = new HashSet<Book>();
		Book b1=new Book(isbn, name, author, quantity);
		set.add(b1);
	} 
}

