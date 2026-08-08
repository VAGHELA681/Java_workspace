import java.util.*;
public class Main {
	public static void displayName(String name)
	 {
		System.out.println("Your name is: " + name);	
}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.next();

		displayName(name);
	}
}
