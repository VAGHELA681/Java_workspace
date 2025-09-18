//package ✓
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number [] = new int [size] ;

		//input
		for (int i=1; i<size; i++) {
			//System.out.println(number[i]);
			number [i] = sc.nextInt();
		}

		//output
		for (int i=1; i<size; i++) {
			System.out.println(number[i]);
		}
    }
}
