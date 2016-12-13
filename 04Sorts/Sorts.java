public class Sorts{

    public static String name(){
	return "06.Lula.Kevin";
    }

    public static void selectionSort(int [] data){
	int temp = 0;
	for(int x = 0; x < data.length; x++){
	    for(int a = x; a < data.length; a++){
		if(data[a] <= data[x]){
		    temp = data[a];
		}
		    data[x] = temp;
	    }
	}
    }

    public static String toString(int[]data){
	String str = "{";
	    for(int x = 0; x < data.length; x++){
		str = str + data[x] + ", ";
	    }
	str = str + "}";
	return str;
    }


public static void main(String [] args){
    System.out.println(name());
    int[]data = {5, 9, 4, 3, 18};
    selectionSort(data);
    System.out.println(toString(data));
}
}
