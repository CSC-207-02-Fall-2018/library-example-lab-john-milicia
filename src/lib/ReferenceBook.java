package lib;

public class ReferenceBook extends LibraryBook {

	private String collection;
	
	ReferenceBook(String author, String title, int isbn, int callNum, String collection){
		super(author, title, isbn, callNum);
		this.collection = collection;
	}
	
	public String getCollection() {
		return this.collection;
	}
	
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	public void checkout(String patron, String due) {
		
	}

}
