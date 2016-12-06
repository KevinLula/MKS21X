public class IsDoneMethods{


    //1)
    public boolean isDone(){
	int x, y;
	boolean z = true;
	if(SlidingPuzzle[0][0] == 0 || SlidingPuzzle[side-1][side-1] == 0){
	    for(x = 0; x < side - 1; x++){
		for(y = 0; y < side - 1; y++){
		    if(SlidingPuzzle[x][y] > SlidingPuzzle[x][y+1]){
			z = false;}}}
	    for(x = side - 1; x < side; x++){
		for(y = 0; y < side - 2; y++){
		    if(SlidingPuzzle[x][y] > SlidingPuzzle[x][y + 1]){
			z = false;}}
		    for(x = 0; x < (side - 1); x++){
		if(SlidingPuzzle[x][side - 1] > SlidingPuzzle[x + 1][0]){
		    z = false;}}}
	    else{z = false;}
	    return z;
	}
    }

    //2)
    public boolean isDone(){
	int x, y;
	int a = 1;
	boolean z = true;
	if(SlidingPuzzle[0][0] == a){
	    for(x = 0; x < side; x++){
		for(y = 0; y < side; y++){
		    if(SlidingPuzzle[x][y] != (a + 1) || SlidingPuzzle[x][y] != 0){
			z = false;}
		    a = a + 1;}}}
	if(SlidingPuzzle[0][1] == a){
	    for(x = 0; x < side; x++){
		for(y = 0; y < side; y++){
		    if(SlidingPuzzle[x][y] != (a - 1)){
			    z = false;}
		    a = a + 1;}}}
	else{z = false;}
	return z;}
