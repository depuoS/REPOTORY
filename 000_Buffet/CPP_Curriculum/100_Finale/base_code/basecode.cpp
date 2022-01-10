// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char input = 'a';
	cout<<"Hello, ";
	sleep(1);
	cout<<"would you like to see a Christmas Scene? (y/n) - ";
	cin>>input;
	for(int i = 0; i < 50; i++){
		gotoxy(1+i,25);
		cout<<"_";
	}
	for(int p = 0; p < 3; p++){
	gotoxy(40,9+p);
	cout<<"#"<<endl;
	}
	for(int o = 0; o < 3; o++){
		gotoxy(45,9+o);
		cout<<"#"<<endl;
	}
	for(int x = 0; x < 10; x++){
		gotoxy(random(45),random(20));
		cout<<"*";
	}
	//this could have been done better.
	gotoxy(2,10);
	cout<<"*******";
	gotoxy(3,9);
	cout<<"*****";
	gotoxy(4,8);
	cout<<"***";
	gotoxy(5,7);
	cout<<"*";
	gotoxy(4,11);
	cout<<"|"<<endl;
	gotoxy(6,11);
	cout<<"|"<<endl;
	gotoxy(40,12);
	cout<<"######";
	gotoxy(40,9);
	cout<<"#####";
	gotoxy(41,8);
	cout<<">o<";
}
