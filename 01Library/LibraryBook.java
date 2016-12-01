abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	super(a, t, i);
	callNumber = c;
    }

    public String getCallNumber(){
	return callNumber;
    }

    public void setCallNumber(String c){
	callNumber = c;
    }

    public abstract void checkout(String patron, String due);

    public abstract void returned();

    public abstract String circulationStatus();

    public int compareTo(LibraryBook x){
	if(x instanceof LibraryBook){
	    LibraryBook y = (LibraryBook) x;
	}
	return -1;
	}
	
    }

    public String toString(){
	return "";
    }