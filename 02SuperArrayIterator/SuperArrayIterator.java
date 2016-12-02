import java.util.*
public class SuperArrayIterator implements Iterator<String>{
	private SuperArray ary;
	private int start;
	
public SuperArrayIterator(int start){
	this.start = start;
}

public boolean hasNext(){
	return start < ary.length;
}

public int next(){
	if (hasNext()){
		start ++;
		return start - 1;}
 	else{throw new NoSuchElementException;}
} 


public void remove(){
	throw new UnsupportedOperationException;
}
}
