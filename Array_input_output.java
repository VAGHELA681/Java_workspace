import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] marks = new int[3];

		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter marks: ");
			marks[i] = sc.nextInt();
		}

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}