package lib;

public class ReferenceBook extends LibraryBook {

	private String collection;

	ReferenceBook(String author, String title, String isbn, String callNum, String collection){
		super(author, title, isbn, callNum);
		this.collection = collection;
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	/**
	 * Informs patrons that they cannot checkout reference books 
	 * @param patron: name of patron
	 * @param due: date when book is due
	 */
	public void checkout(String patron, String due) {
		System.out.println(patron + " cannot check out reference books.");
	}

	/**
	 * Informs patrons that they cannot return reference books 
	 */
	public void returned() {
		System.out.println("reference book " + this.callNum + " could not have been checked out -- return impossible");
	}

	/**
	 * Tells user circulation status
	 * @return "non-circulating reference book"
	 */
	public String circulationStatus() {
		return "non-circulating reference book";
	}

	public String toString () {
		return super.toString() + "\nCollection:" + collection;
	}
	public static void main (String argvs []) {
		ReferenceBook b1 = new ReferenceBook ("Name1", "Title1", "234534", "345", "collection1");
		ReferenceBook b2 = new ReferenceBook ("Name2", "Title2", "263847", "347", "collection2");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println ("Comparing b1 to b2 by the call number: " + b1.compareTo(b2));
		System.out.println ("Comparing b2 to b1 by the call number: " + b2.compareTo(b1));
		//testing setCollection
		b1.setCollection("collection3");
		System.out.println("Changing collection of b1:" + b1.getCollection());
		//testing checkout, returned and circulationStatus
		b2.checkout("patron", "due");
		b2.returned();
		System.out.println(b2.circulationStatus());
		
		
	}
}
