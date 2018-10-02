package lib;

public abstract class LibraryBook extends Book
		implements Comparable<LibraryBook> {
	int callNum;
	LibraryBook() {
		this.callNum = 0;
	}
	
	LibraryBook(String author, String title, int isbn, int callNum) {
		super(author, title, isbn);
		this.callNum = callNum;
	}
	
	public int getCallNum() {
		return this.callNum;
	}
	
	public void setCallNum(int callNum) {
		this.callNum = callNum;
	}
	
	public int compareTo(LibraryBook book) {
		if (this.callNum < book.callNum) {
			return -1;
		}
		else if (this.callNum>book.callNum) {
			return 1;
		}
		
		return 0;
	}
	
	public String toString () {
		return super.toString() + "\nCall number: " + callNum;
	}
	
	abstract public void checkout(String patron, String due);
	abstract public void returned();
	abstract public String circulationStatus();
	
	
}
