public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" Java");
        System.out.println("Append: " + sb);

        // Insert
        sb.insert(6, "World ");
        System.out.println("Insert: " + sb);

        // charAt
        System.out.println("Character: " + sb.charAt(0));

        // Update character
        sb.setCharAt(0, 'Y');
        System.out.println("Update: " + sb);

        // Delete
        sb.delete(6, 12);
        System.out.println("Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}
