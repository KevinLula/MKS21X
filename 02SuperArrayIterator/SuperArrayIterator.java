import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
	private SuperArray ary;
	private int start;
	
public SuperArrayIterator(int start){
	this.start = start;
}

 public String  next(){
	if (hasNext()){
		start ++;
		return ary.get(start - 1);}
 	else{throw new NoSuchElementException();}
} 

public boolean hasNext(){
    return start < ary.size();
}

public void remove(){
    throw new UnsupportedOperationException();
}
}
