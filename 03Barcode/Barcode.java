public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
	int temp = 0
	if(zip.length() != 5 || ){
	throw new RunTimeException();}
	else{
	_zip = zip;
	for(int x = 0; x < _zip.length(); x++){
	temp = temp + _zip.get(x);
	}
	_checkDigit = temp % 10;}
	}
	



// postcondition: computes and returns the check sum for _zip
  private static int checkSum(String z){
	int x = 0
        for(int y = 0; y < z.length(); y++){
	x = x + z.get(y);
	}
	return (int)z + (x % 10)}

	public String get_Zip(){
	return _zip;
}


//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
	String temp = _zip + _checkDigit
	String ans = "|"
	for(int x = 0; x < temp.length(); x++){
	switch(temp.charAt(x)){
	case 0: ans = ans + "||:::";
		break;
	case 1: ans = ans + ":::||";
		break;
	case 2: ans = ans + "::|:|";
		break;
	case 3: ans = ans + "::||:";
		break;
	case 4: ans = ans + ":|::|";
		break;
	case 5: ans = ans + ":|:|:";
		break;
	case 6: ans = ans + ":||::";
		break;
	case 7: ans = ans + "|:::|";
		break;
	case 8: ans = ans + "|::|:";
		break;
	case 9: ans = ans + "|:|::";
		break; 
	default: ans = ans + "";
		break;}
		}
	return temp + "" + ans + "|";
	}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
	return checkSum(_zip).compareTo(checkSum(other.get_Zip()));
	}
    

//Hint: a switch statement is your friend here. It is optional, however.

	public String toCode(String zip){
	String temp = checkSum(zip)
        String ans = "|"
	for(int x = 0; x < temp.length(); x++){
	switch(temp.charAt(x)){
	case 0: ans = ans + "||:::";
		break;
	case 1: ans = ans + ":::||";
		break;
	case 2: ans = ans + "::|:|";
		break;
	case 3: ans = ans + "::||:";
		break;
	case 4: ans = ans + ":|::|";
		break;
	case 5: ans = ans + ":|:|:";
		break;
	case 6: ans = ans + ":||::";
		break;
	case 7: ans = ans + "|:::|";
		break;
	case 8: ans = ans + "|::|:";
		break;
	case 9: ans = ans + "|:|::";
		break; 
	default: ans = ans + "";
		break;}
		}
	return ans + "|";
	}
}

	public int toZip(String code){
	
}


