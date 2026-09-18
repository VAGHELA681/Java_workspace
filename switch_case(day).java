import java.util.*;
class Demo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		switch (day) {
		case 1 :
			System.out.print("monday");
			break;

		case 2 :
			System.out.print("tuesday");
			break;

		case 3 :
			System.out.print("wensday");
			break;

		default:
			System.out.print("nothing");
		}
	}
}