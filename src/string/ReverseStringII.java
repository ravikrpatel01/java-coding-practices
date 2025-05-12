package string;

public class ReverseStringII {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String makeSubstring(String str, int left, int right) {
        right = Math.min(right, str.length());
        return str.substring(left, right);
    }
    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            String segment = makeSubstring(s, i, i + 2 * k);

            if (segment.length() >= k) {
                String reversed = reverseString(segment.substring(0, k));
                result.append(reversed).append(segment.substring(k));
            }else {
                result.append(reverseString(segment));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String string = "abcdefg";
        int k = 2;

        System.out.println("Reversed String: " + reverseStr(string, k));
    }
}
