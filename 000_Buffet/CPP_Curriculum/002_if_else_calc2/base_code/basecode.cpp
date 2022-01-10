// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	int answer;
	char joe = 'z';
	cout<<"Enter a number: ";
	cin>> x;
	cout<<"Enter a number: ";
	cin>> y;
	cout<<"Select your operation: ";
	cin>> joe;
	if(joe == '+'){
		cout<<x + y<<endl;
	}
	else if(joe == '-'){
		cout<<x - y<<endl;
	}
	else if(joe == '*'){
		cout<<x * y<<endl;
	}
	else if(joe =='/'){
		cout<<x / y<<endl;
	}
	else{
		cout<<"SYNTAX ERROR"<<endl;
	}
	

}
