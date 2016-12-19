public class Sorts{

    public static String name(){
	return "06.Lula.Kevin";
    }

    public static void selectionSort(int [] data){
	int position = 0;
	int temp = 0;
	for(int x = 0; x < data.length; x++){
		temp = data[x];
	    for(int a = x; a < data.length; a++){
		if(data[a] <= temp){
		    position = a;
		    temp = data[a];
		}		
	    }
	    data[position] = data[x];
	    data[x] = temp;
	    temp = 0;
	}
    }
		
			
	public static void insertionSort(int[]data){
	int position = 0;
	int value = 0;
	for(int x = 1; x < data.length; x++){
		value = data[x];
		for(int y = x; y > 0; y--){
			if(value < data[y-1]){
			data[y] = data[y - 1];
			position = y - 1;}
			else{position = y;
				break;}
		}
		data[position] = value;
}
}



	public static void bubbleSort(int[]data){
	    int current;
	    boolean swapped = true;
	    while(swapped){
		swapped = false;
		for(int x = 0; x < data.length - 1; x++){
		    if(data[x] > data[x + 1]){
			current = data[x];
			data[x] = data[x + 1];
			data[x + 1] = current;
			swapped = true;
		    }
		}
	    }
	}
					
	    
			
	
			
			
    public static String toString(int[]data){
	String str = "{";
	    for(int x = 0; x < data.length; x++){
		if(x + 1 == data.length){
		    str = str + data[x] + "}";
		    break;
			}
		str = str + data[x] + ", ";
	    }
	return str;
    }


public static void main(String [] args){
    System.out.println(name());
    int[]data = {5, 9, 3, 7, 12, 10, 18, 1, 0};
    bubbleSort(data);
    System.out.println(toString(data));
}
}

//System.currentTimeMillis();
