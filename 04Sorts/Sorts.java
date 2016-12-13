public class Sorts{

    public static String name(){
	return "06.Lula.Kevin";
    }

    public static void selectionSort(int [] data){
	int position = 0;
	int value = 0;
	for(int x = 0; x < data.length; x++){
	    for(int a = x; a < data.length; a++){
		if(data[a] <= data[x]){
		    position = a;
		    value = data[a];
		}		
	    }
	    data[position] = data[x];
	    data[x] = value;
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
    int[]data = {5, 9, 3, 18};
    selectionSort(data);
    System.out.println(toString(data));
}
}
