// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	for(int i = 0; i < 10; i++){
		gotoxy(i,i+4);
		cout << "%" << endl;
	}
}
