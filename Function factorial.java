import java.util.*;

public class Main {

	static int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int n = sc.nextInt();

		int result = factorial(n);

		System.out.println("Factorial = " + result);
	}
}
