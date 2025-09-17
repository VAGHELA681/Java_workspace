//package ✓
import java.util.*;
public class function {
	public static void Printfactorial(int n) {
		int factorial = 1;
		//if (factorial==0) {
		if (n <= 0) {
			System.out.print("invaild number");
			return ;
		}

		for (int i = n; i >= 1; i--) {
			  factorial = factorial + i;
			//factorial++;
		}
		System.out.print(factorial);
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Printfactorial(n);
	}
}
