public class ReferenceBook extends LibraryBook{

    private String collection;

    public ReferenceBook(String a, String t, String isbn, String cn, String c){
	super(a, t, isbn, cn);
	collection = c;
    }

    public String getcollection(){
	return collection;
    }

    public void setCollection(String c){
	collection = c;
    }

    public void checkout(String patron, String due){
	System.out.println("A reference book cannot be checked out.");
    }

    public void returned(){
	System.out.println("Reference book could not have been checked out -- return impossible.");
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString() + " This book belongs in " + collection + ".";
    }
}
