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
	
	
// postcondition: Creates a copy of a bar code.
  public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
	return (int)_zip + _checkDigit;}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
	}
    
}

//Hint: a switch statement is your friend here. It is optional, however.


