// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	//cout<<"Please enter 5 I beg - "<<endl;
	for(int y = 1; y < 4; y++){ //actually y axis
		for(int x = 1; x < 6; x++){ // actually x axis
			gotoxy(x,y+6);//so it doesn't go in the running lines
			cout<<"*";
		}
	}
	
}
