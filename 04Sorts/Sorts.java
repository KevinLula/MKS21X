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
		
			
	public insertionSort(int[]data){
	int position = 0;
	int value = 0;
	for(int x = 1; x < data.length; x++){
		for(int y = x; y > 0; y--){
			if(data[y] < data[y-1])
				

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
    selectionSort(data);
    System.out.println(toString(data));
}
}
