// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char sym;
	cout<<"Please enter a character - ";
	cin>>sym;
	int x;
	cout<<"Please enter line length - ";
	cin>>x;
	char hv;
	cout<<"horizontal, vertical, or diagnol (h/v/d) - ";
	cin>>hv;
	if(hv == 'h'){
	int i;
		for (int i = 0; i < x; i++){
			cout<<sym;
		}
	}
	else if(hv == 'v'){
		for (int i = 0; i < x; i++){
			cout<<sym<<endl;
		}
	}
	else if(hv == 'd'){
		for (int i = 0; i < x; i++){
			gotoxy(i,i+4);
			cout<<sym<<endl;
		}
	}
	else{
		cout<<"ok"<<endl;
	}

}
