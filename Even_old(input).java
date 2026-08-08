import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//even_old number change
	System.out.print("enter number:");
	int num = sc.nextInt();
	
	if (num%2==0) {
		    System.out.println("even");
		} else if (num%2==1) {
		    System.out.println("old");
	    } else {
	        System.out.println("Nothing");
	    }
	}
}
