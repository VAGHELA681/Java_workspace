//class 
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("tony");
		System.out.println(sb);


		//Get A Character from Index
		sb.charAt(0);
		System.out.println(sb);
		System.out.println(sb.charAt(0));

		//Set a Character at Index
		sb.setCharAt(0, 'P');
		System.out.println(sb);

		// insert
		sb.insert(0, 's');
		System.out.println(sb);

		//delete
		sb.delete(0, '1');
		System.out.print(sb);

		//append
		sb.append(" Stark");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());

	}
}
