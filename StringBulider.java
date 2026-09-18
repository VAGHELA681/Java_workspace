public class Main {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" Java");
		System.out.println(sb);

		sb.insert(6, "World ");
		System.out.println(sb);

		sb.delete(2, 2);
		System.out.println(sb);

    	sb.reverse();
		System.out.println(sb);
		
	}
}