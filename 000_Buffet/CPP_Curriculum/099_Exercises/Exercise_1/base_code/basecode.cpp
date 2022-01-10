// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x = 4;
	int y = 15;
	while(true){
		x = x +1;
		cout<<x<<endl;
	if (x == 25){
		break;
	}
	
	cout << endl;
	
	for(int i = 5; i < 25; i = i + 1){
		cout<< i << endl;
	}	

}

	cout << endl;

	for(int y = 15; y >= 5; y = y - 1){
		cout<< y << endl;
	}

}
