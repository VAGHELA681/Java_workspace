import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[2][3];

        // Input
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Enter marks: ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]);
            }
        }
    }
}