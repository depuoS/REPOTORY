// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x;
	int y;
	int answer;
	char joe = 'z';
	char loop = 'g';
	while(true){
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
	cout<<"would you like to do another? (yes/no)"<<endl;
	cin>> loop;
	if(loop == 'y'){
		
	}
	else if(loop == 'n'){
		break;
	}
	else{
		cout<<"bro?"<<endl;
		break;
	}
	}
	
}
