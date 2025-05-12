package string;

public class LongestSubstring {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
    public static String findLongestSubstring(String str) {
        if (str.length() == 1) {
            return str;
        }
        int size = 0;
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String substring = str.substring(i, j+1);
                if (isPalindrome(substring)) {
                    if (size < substring.length()) {
                        size = Math.max(size, substring.length());
                        result = substring;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "c";
        String result = findLongestSubstring(str);
        System.out.println(result);
    }
}
