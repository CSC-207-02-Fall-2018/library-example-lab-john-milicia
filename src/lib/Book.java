package lib;

public class Book {
	
	protected String author;
	protected String title;
	int isbn;
	
	Book () {
		author = "";
		title = "";
		isbn =0;
	}
	
	Book (String author, String title,int isbn ) {
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
	
	public int getIsbn() {
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
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return "The author of " + this.title + " is " + this.author + "\nISBN: "
				+ this.isbn;
	}
	
	public static void main (String argvs []) {
		Book b = new Book ();
		b.setAuthor("Name");
		b.setTitle("Title");
		b.setIsbn (726472);
		System.out.println(b);
	}

}
