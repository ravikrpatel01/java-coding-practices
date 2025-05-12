package string;

public class ReverseString {
    public static String reverseStringManually(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseStringUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "Ravi Kumar Patel";
        System.out.println("Reversed String [Manually]: " + reverseStringManually(str));
        System.out.println("Reversed String [StringBuilder]: " + reverseStringUsingStringBuilder(str));
    }
}
