import java.util.*;

public class Main {

	public  static void square(int n) {
		int result = n * n;
		System.out.println("Square = " + result);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		square(n);
	}
}
