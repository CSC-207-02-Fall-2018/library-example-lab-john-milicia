package lib;

public class Book {
	
	protected String author;
	protected String title;
	protected String isbn;
	
	/**
	 * Default constructor for book
	 */
	Book () {
		author = "";
		title = "";
		isbn = "";
	}
	
	/**
	 * Constructor for book with all input fields 
	 * @param author: author of book
	 * @param title: title of book
	 * @param isbn: isbn for book
	 */
	Book (String author, String title,String isbn ) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	/**
	 * Standard getters
	 */
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	/**
	 * Standard Setters
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * Converts book to printable string
	 * @return "The author of [title] is [author]\n ISBN: [isbn]
	 */
	public String toString() {
		return "Title: " + this.title + "\nAuthor:" + this.author + "\nISBN: "
				+ this.isbn;
	}
	
	public static void main (String argvs []) {
		Book b = new Book ();
		b.setAuthor("Name");
		b.setTitle("Title");
		b.setIsbn ("726472");
		System.out.println(b);
	}

}
