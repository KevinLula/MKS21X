public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private static String[] barcodes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
	if(zip.length() != 5){
	    throw new IllegalArgumentException("Zip must be 5 digits long");}
	for(int x = 0; x < 5; x ++){
	    if(!Character.isDigit(zip.charAt(x))){
		throw new IllegalArgumentException("Zip can only contain digits");}
	}
	_zip = zip;
        _checkDigit = checkSum() % 10;
  }
	



// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int x = 0;
        for(int y = 0; y < _zip.length(); y++){
	    x = x + _zip.charAt(y);
	}
	return x;}



//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String temp = _zip + _checkDigit;
      String ans = "|";
      for(int x = 0; x < temp.length(); x++){
			char y = temp.charAt(x);
			if (y == '0'){
			    ans = ans + "||:::";
			}
		        else if (y == '1'){
			    ans = ans + ":::||";
			}
			else if (y == '2'){
			    ans = ans + "::|:|";
			}
			else if (y == '3'){
			    ans = ans + "::||:";
			}
			else if (y == '4'){
			    ans = ans + ":|::|";
			}
			else if (y == '5'){
			    ans = ans + ":|:|:";
			}
			else if (y == '6'){
			    ans = ans + ":||::";
			}
			else if (y == '7'){
			    ans = ans + "|:::|";
			}
			else if (y == '8'){
			    ans = ans + "|::|:";
			}
			else if (y == '9'){
			    ans = ans + "|:|::";
			}
      }
      	return temp + " " + ans + "|";
  }
 


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      return (Integer.valueOf(_zip + _checkDigit)).compareTo(Integer.valueOf(other._zip + other._checkDigit));
  }

    private static int findIntCorrespondence(String end){
	for(int x = 0; x < barcodes.length; x++){
	    if(barcodes[x].equals(end)){
		    return x;}
	}
	throw new IllegalArgumentException("Characters other than barcode characters (| ;) can not be used");}

    private static int checkCheckSum(String beg){
	int total = 0;
	for(int x  = 0; x < beg.length(); x = x + 5){
	    total = total + findIntCorrespondence(beg.substring(x, x + 5));
	}
	return total;
    }

		

//Hint: a switch statement is your friend here. It is optional, however.

	public static String toCode(String zip){
	    String ans = "|";
	    int checkSum = 0;
		if(zip.length() == 5){
		    for(int x = 0; x < zip.length(); x++){
			char y = zip.charAt(x);
			if (y == '0'){
			    ans = ans + "||:::";
			}
		        else if (y == '1'){
			    ans = ans + ":::||";
			}
			else if (y == '2'){
			    ans = ans + "::|:|";
			}
			else if (y == '3'){
			    ans = ans + "::||:";
			}
			else if (y == '4'){
			    ans = ans + ":|::|";
			}
			else if (y == '5'){
			    ans = ans + ":|:|:";
			}
			else if (y == '6'){
			    ans = ans + ":||::";
			}
			else if (y == '7'){
			    ans = ans + "|:::|";
			}
			else if (y == '8'){
			    ans = ans + "|::|:";
			}
			else if (y == '9'){
			    ans = ans + "|:|::";
			}
		    else{
			throw new IllegalArgumentException("Zip must only have digits");}
		    }
		}
		    else{
			throw new IllegalArgumentException("Zip must only have 5 digits");}
		for(int y = 0; y < zip.length(); y++){
		    checkSum = checkSum + Integer.parseInt(zip.substring(y, y+1));
		}
		checkSum = checkSum % 10;
	        ans = ans + barcodes[checkSum] + "|";
		return ans;
	}


    public static String toZip(String code){
	String ans = "";
	if(code.length() != 32){
	    throw new IllegalArgumentException("Barcode must have a length of 32 characters");}
	else if(code.charAt(0) != '|' || code.charAt(31) != '|'){
	    throw new IllegalArgumentException("Barcode must start and end with |");}
	else if((checkCheckSum(code.substring(1, 26)) % 10) != (findIntCorrespondence(code.substring(26,31)))){
	    throw new IllegalArgumentException("Checksum is incorrect");}
	for(int x = 1; x < code.length() - 6; x = x + 5){
	    ans = ans + findIntCorrespondence(code.substring(x, x + 5));
	}
	return ans;}
}
								  
	    





