package Assessment.LibraryCatalog.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {
	@Id
	private int a_id;
	private String title;
	private String author;
	private String isbn;
	private boolean available;
	
	
	public Library(int a_id, String title, String author, String isbn, boolean available) {
		super();
		this.a_id = a_id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = available;
	}
	
	
	public Library() {
		super();
	}


	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

}
