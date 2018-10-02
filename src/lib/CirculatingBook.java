package lib;

public class CirculatingBook extends LibraryBook {

	String currentHolder;
	String dueDate;
	
	CirculatingBook(String author, String title, String isbn, String callNum){
		super(author, title, isbn, callNum);
		currentHolder = "";
		dueDate = "";
	}
	
	/** 
	 * Additional standard getters for CirculatingBook
	 */
	public String getCurrentHolder(){
		return this.currentHolder;
	}
	
	public String getDueDate() {
		return this.dueDate;
	}
	
	/**
	 * Additional standard setters for CirculatingBook
	 */
	public void setCurrentHolder(String newHolder) {
		this.currentHolder = newHolder;
	}
	
	public void setDueDate(String newDueDate) {
		this.dueDate = newDueDate;
	}
	
	/**
	 * Sets new current holder and due date
	 * @param patron: the new current holder 
	 * @param due: the new due date
	 */
	public void checkout(String patron, String due) {
		this.currentHolder = patron;
		this.dueDate = due;
	}

	/**
	 * Resets the currentHolder and dueDate of a book 
	 */
	public void returned() {
		this.currentHolder = "";
		this.dueDate = "";
	}

	/**
	 * Returns a book's circulation status
	 * @return If held, currentHolder and Due Date, if available, says so
	 */
	public String circulationStatus() {
		if (this.currentHolder.equals("")) {
			return "book available on shelves";
		}
		return "Current holder's name: " + this.currentHolder + "\nDue date: " + this.dueDate;
	}
	
	/**
	 * Returns string of all relevant data to CirculatingBook
	 */
	public String toString () {
		return super.toString() + "\n" + this.circulationStatus();
	}

	public static void main(String[] args) {
		CirculatingBook b2 = new CirculatingBook ("Name2", "Title2", "263847", "347");
		System.out.println(b2);
		//testing checkout, returned and circulationStatus
		b2.checkout("patron", "due");
		System.out.println(b2.circulationStatus());
		b2.returned();
		System.out.println(b2.circulationStatus());
		
		b2.setCurrentHolder("new holder");
		b2.setDueDate("10/02");
		System.out.println(b2);

	}

}
