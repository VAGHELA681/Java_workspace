import java.util.*;

public class Main {

    static void subtract(int a, int b) {
        //return a - b;
        int result = a -b;
        System.out.print(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        subtract(a, b); //call

        //System.out.println("Subtraction = " + result);
    }
}
