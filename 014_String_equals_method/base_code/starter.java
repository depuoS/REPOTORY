import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String asdf;
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		asdf = sc.nextLine();
		if (asdf.equals("Wizard")){
		System.out.print("You have chose the Wizard");
		}
		else if(asdf.equals("Warrior")){
		System.out.print("You have chose the Warrior");
		}
		else if(asdf.equals("Rogue")){
		System.out.print("you have chose the Rogue");
		}
		else{
		System.out.print("wtf did you just type.");
		}
	}
}
