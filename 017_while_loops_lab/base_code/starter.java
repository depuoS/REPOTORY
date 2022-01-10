import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("How many times do you want it repeated.");
		int x = sc.nextInt();
		int y = 0;
		while(true)
		{
			System.out.println(name);
			if(y == x - 1)
			{
				break;
			}
			y = y + 1;
		}



		
	}
}
	