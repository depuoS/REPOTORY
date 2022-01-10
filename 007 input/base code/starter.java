import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = sc.nextLine();
		String age;
		System.out.println("What is your age?");
		age = sc.nextLine();
		String month;
		System.out.println("What is your birthday month? (1-12)");
		month = sc.nextLine();
		String day;
		System.out.println("What day were you born? (1-31)");
		day = sc.nextLine();
		String year;
		System.out.println("What year were you born?");
		year = sc.nextLine();
		String buck;
		System.out.println("How much is a buck fifty?");
		buck = sc.nextLine();
		System.out.print("Your name is " + name);
		System.out.print(" You are " + age);
		System.out.print(" years old ");
		System.out.print("You were born on " + month);
		System.out.print("/" + day);
		System.out.print("/" + year);
		System.out.print(" you have " + buck);
		System.out.print(" in your wallet.");
	}
}
