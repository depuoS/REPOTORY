import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.print("Nice name ");
		System.out.print(name);
		System.out.println("!");
		String asdf;
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		asdf = sc.nextLine();
		if (asdf.equals("Wizard")){
		System.out.println("You have chose the Wizard");
		}
		else if(asdf.equals("Warrior")){
		System.out.println("You have chose the Warrior");
		}
		else if(asdf.equals("Rogue")){
		System.out.println("you have chose the Rogue");
		}
		else{
		System.out.println("Type an actual answer.");
		}
		int stats = 25;
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int strength;
		System.out.println("Strength (1-10):");
		strength = sc.nextInt();
		if(strength > 10){
		System.out.println("You can't enter more than 10.");
		}
		else if(strength > stats){
		System.out.println("You have too little points!");
		}
		else{
		stats = stats - strength;
		System.out.print("You have ");
		System.out.print(stats);
		System.out.println(" points left to spend.");
		}
		int dexterity;
		System.out.println("Dexterity (1-10):");
		dexterity = sc.nextInt();
		if(dexterity > 10){
		System.out.println("You can't enter more than 10.");
		}
		else if(dexterity > stats){
		System.out.println("You have too little points!");
		}
		else{
		stats = stats - dexterity;
		System.out.print("You have ");
		System.out.print(stats);
		System.out.println(" points left to spend.");
		}
		int intelligence;
		System.out.println("Intelligence (1-10):");
		intelligence = sc.nextInt();
		if(intelligence > 10){
		System.out.println("You can't enter more than 10.");
		}
		else if(intelligence > stats){
		System.out.println("You have too little points!");
		}
		else{
		stats = stats - intelligence;
		System.out.print("You have ");
		System.out.print(stats);
		System.out.println(" points left to spend.");
		}
		int constitution;
		System.out.println("Constitution (1-10):");
		constitution = sc.nextInt();
		if(constitution > 10){
		System.out.println("You can't enter more than 10.");
		}
		else if(constitution > stats){
		System.out.println("You have too little points!");
		}
		else{
		stats = stats - constitution;
		System.out.print("You have ");
		System.out.print(stats);
		System.out.println(" points left to spend.");
		}
		int charisma;
		System.out.println("Charisma (1-10):");
		charisma = sc.nextInt();
		if(charisma > 10){
		System.out.println("You can't enter more than 10.");
		}
		else if(charisma > stats){
		System.out.println("You have too little points!");
		}
		else{
		stats = stats - charisma;
		System.out.print("You have ");
		System.out.print(stats);
		System.out.println(" points left to spend.");
		}
		System.out.print("Your name is ");
		System.out.print(name);
		System.out.print(" and ");
		System.out.print("you are a ");
		System.out.print(asdf);
		System.out.print(" with ");
		System.out.print(strength);
		System.out.print(" Strength, ");
		System.out.print(dexterity);
		System.out.print(" Dexterity, ");
		System.out.print(intelligence);
		System.out.print(" Intelligence, ");
		System.out.print(constitution);
		System.out.print(" Constitution, ");
		System.out.print(charisma);
		System.out.print(" Charisma.");
	}
}
