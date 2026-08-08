public class Main {
	public static void main(String[] args) {
		//Arithmetic (+ - * / %)
		int a = 10;
		int b = 20;
		boolean result = true;

		System.out.println("sum = " + (a + b));
		System.out.println("sub = " + (a - b));
		System.out.println("mul = " + (a * b));
		System.out.println("div = " + (a / b));
		System.out.println("pow = " + (a % b));
		
		//Assigement operater
		System.out.println("sum = " + (a += b));
		System.out.println("sub = " + (a -= b));
		System.out.println("mul = " + (a *= b));
		System.out.println("div = " + (a /= b));
		System.out.println("pow = " + (a %= b));
		//relation operater
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a<= b);
		System.out.println(a >= b);
		
		//logical operater
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(!result);
		
		//unary operater
		
		System.out.println(++a); // 11
        System.out.println(a++); // 11
        System.out.println(a);   // 12

        System.out.println(--a); // 11
        System.out.println(a--); // 11
        System.out.println(a);   // 10
	}
}
