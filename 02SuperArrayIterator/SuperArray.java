//Kevin Lula 11/6/16
//Worked with Anthony Hom

public class SuperArray{

    private String [] data;
    private int size;

    public SuperArray(){
	size = 0;
	data = new String [10];
    }

    public SuperArray(int capacity){
	if(capacity < 0){
	    throw new IllegalArgumentException();}
	size = 0;
	data = new String [capacity];
    }

    public void trimToSize(){
	String [] copy = new String [size];
	for(int x = 0; x < size; x++){
	    copy[x] = data[x];}
        data = copy;}
	    

    public int size(){
	return size;}

    public String get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	return data[index];}

    public void grow(){
        String [] copy = new String [data.length * 2];
	for(int x = 0; x < size; x++){
	    copy[x] = data[x];}
	data = copy;
    }

    public boolean  add(String n){
	if(size < (data.length)){
	    data[size] = n;
	    size = size + 1;
	    return true;}
	else{grow();
	    data[size] = n;
	    size = size + 1;
	    return true;}
    }

    public String toString(){
	String res = "[";
	for(int x = 0; x < (data.length); x++){
	    if(x + 1 == data.length){
		res = res + data[x] + "]";}
	    else{res = res + data[x] + ", ";}
	}
	return res;}

    public String toStringDebug(){
	String res = "[";
	for(int x = 0; x < (size); x++){
		res = res + data[x] + ", ";}
	    for(int x = 0; x < (data.length - size); x++){
		if(x + 1 == data.length - size){
		    res = res + "_" + "]";
		    break;}
		else{res = res + "_" + ", ";}}
	    return res;}
    
    public void clear(){
	size = 0;
	String [] copy = new String [10];
	data = copy;}

    public boolean isEmpty(){
	if(size == 0){return true;}
	else{return false;}
    }

    public String set(int index, String element){
       	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
	return data[index] = element;}

    public void add(int index, String element){
	if(index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();}
	if(data.length == size){grow();}
	if(size < data.length){
	    for(int x = size - 1; x >= index; x--){
		data[x+1] = data[x];
	    }
	    data[index] = element;
	    size = size + 1;}
    }

    public String remove(int index){
       	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();}
        String [] copy = new String [data.length];
	String y = copy[index];
	for(int x = 0; x < data.length; x++){
	    copy[x] = data[x];}
	for(int x = 0; x < size; x++){
	    if(x == index){
		break;}
	    else{data[x] = copy[x];}}
	for(int x = index; x < size; x++){
	    data[x] = copy[x + 1];}
	size = size - 1;
	return y;}

   public String [] toArray(){
       String [] copy = new String [size];
       for(int x = 0; x < size; x++){
	   copy[x] = data[x];}
       return copy;
   }
  

    public int indexOf(String i){
	int y = 0;
	int z = 0;
	for(int x = 0; x < (size); x++){
	    if(y == 1){
		break;}
	    else{if(data[x] == i){
		    y = y + 1;}
		else{y = 0;
		    z = z + 1;}}
	}
	if(z == size){return -1;}
	else{return z;}}
	    

    public int lastIndexOf(String i){
	int y = 0;
	int z = size - 1;
	for(int x = (size - 1); x >= 0; x--){
	     if(y == 1){
		break;}
	    else{if(data[x] == i){
		    y = y + 1;}
		else{y = 0;
		    z = z - 1;}}
	}
	return z;}
	   
}



