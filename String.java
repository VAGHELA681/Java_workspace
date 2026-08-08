import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Declare a String
		String name = "Meera";
		System.out.println(name);

		System.out.print("Enter your name: ");
		String names = sc.nextLine();

		System.out.println("Hello " + names);

		sc.close();

		String s = "Java Programming";

		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
	}
}

