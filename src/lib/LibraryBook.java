package lib;

public abstract class LibraryBook extends Book
		implements Comparable<LibraryBook> {
	String callNum;
	LibraryBook() {
		this.callNum = "";
	}
	
	LibraryBook(String author, String title, String isbn, String callNum) {
		super(author, title, isbn);
		this.callNum = callNum;
	}
	
	/**
	 * Getter for callNum
	 */
	public String getCallNum() {
		return this.callNum;
	}
	
	/**
	 * Setter for callNum
	 */
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	
	/**
	 * implementation of compareTo from Comparable interface, compares by callNum
	 * 
	 * @param book: the book you would like to make the comparison with
	 * 
	 * @return -1 if book is alphabetically before the object, 1 if its after, and 0 if they are the same
	 */
	public int compareTo(LibraryBook book) {
		if (this.callNum.compareTo(book.callNum) < 0) {
			return -1;
		}
		else if (this.callNum.compareTo(book.callNum) > 0) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * Returns all relevant values to LibraryBook as a string
	 */
	public String toString () {
		return super.toString() + "\nCall number: " + callNum;
	}
	
	abstract public void checkout(String patron, String due);
	abstract public void returned();
	abstract public String circulationStatus();
	
	
}
