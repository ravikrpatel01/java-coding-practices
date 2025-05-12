package string;

public class PalindromeString {
    public static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return str.contentEquals(sb);
    }
    public static void main(String[] args) {
        String str = "madam";
        if (checkPalindrome(str)) {
            System.out.println(str + " is a palindrome string.");
        }else {
            System.out.println(str + " is not a palindrome string.");
        }
    }
}
