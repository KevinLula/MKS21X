public class CirculatingBook extends LibraryBook{

    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String t, String isbn, String cn){
	super(a, t, isbn, cn);
	currentHolder = "";
	dueDate = "";	    
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public String getdueDate(){
	return dueDate;
    }

    public void setCurrentHolder(String patron){
	currentHolder = patron;
    }

    public void setDueDate(String Date){
	dueDate = Date;
    }

    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }

    public void returned(){
	currentHolder = "";
	dueDate = "";
    }

    public String circulationStatus(){
	if(currentHolder != "" && dueDate != ""){
	    return "" + currentHolder + dueDate;
	}
	else{return "book available on shelves";}
    }

    public String toString(){
	return super.toString() + "This is currently checked out by" + currentHolder + " and is due by "+ dueDate +".";
    }
}
	    

    
    

   
