//package ✓
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// even and old number cheak
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.print("even");
		} else {
			System.out.print("old");
		}
	}
}
