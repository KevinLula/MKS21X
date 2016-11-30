public class Book{
	private String author;
	private String title;
	private String ISBN;

    public Book(){
    }

    public Book(String Author, String Title, String isbn){
	author = Author;
	title = Title;
	ISBN = isbn;
    }

    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String Author){
	author = Author;
    }

    public void setTitle(String Title){
	title = Title;
    }
    
    public void setISBN(String isbn){
	ISBN = isbn;
    }

    public String toString(){
	return "";
    }
	


