//package 
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// switch case
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();

		switch (button) {
		case 1:
			System.out.print("good morning");
			break ;

		case 2:
			System.out.print("good afternoon");
			break ;

		case 3:
			System.out.print("good evening");
			break ;

		default :
			System.out.print("nothing");
		}

	}
}
