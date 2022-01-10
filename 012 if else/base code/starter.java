import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Guess a number from 1 to 1000");
		num = sc.nextInt();
		if(num == 500)
		{
			System.out.println("You got it right! Have a cookie or something.");
		}
		else
		{
			System.out.println("Wrong! It was 500!");
		}
	}
}
