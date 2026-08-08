public class Main {
    public static void main(String[] args) {
        int fac = 1;
        int n = 5;

        for (int i = n; i >= 1; i--) {
            fac = fac * i;
        }

        System.out.println("Factorial = " + fac);
    }
}
