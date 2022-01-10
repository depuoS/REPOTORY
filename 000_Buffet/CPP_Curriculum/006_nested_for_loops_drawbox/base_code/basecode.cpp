// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	char sym;
	cout<<"Please enter box width - ";
	cin>> x;
	cout<<"Please enter border character - ";
	cin>> sym;
	cout<<"Please enter box height - ";
	cin>> y;
	for(int i = 1; i < y+1; i++){
		for(int j = 1; j < x+1; j++){
			cout << sym;
		}
		cout<<""<<endl;
	}
}
